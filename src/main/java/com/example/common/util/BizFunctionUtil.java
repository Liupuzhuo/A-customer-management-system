package com.example.common.util;

import org.springframework.util.ReflectionUtils;
import cn.hutool.core.date.DatePattern;
import cn.hutool.core.collection.CollUtil;
import cn.hutool.core.date.DateUnit;
import cn.hutool.core.date.DateUtil;
import cn.hutool.core.util.StrUtil;
import cn.hutool.crypto.SecureUtil;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;
import java.util.Collection;
import java.util.Optional;
import java.util.stream.Collectors;

public class BizFunctionUtil<T> {

    public static <T, R>  R createListPage(List<T> list, Integer total, Class<R> rClass) {
        try {
            R obj = rClass.newInstance();
            ReflectionUtils.invokeMethod(ReflectionUtils.findMethod(rClass, "setList", List.class), obj, list);
            ReflectionUtils.invokeMethod(ReflectionUtils.findMethod(rClass, "setTotal", Integer.class), obj, total);
            return obj;
        } catch (Exception e) {
            // throw new RuntimeException(e);
            return BizFunctionUtil.createLongListPage(list, total, rClass);
        }
    }

    public static <T, R>  R createLongListPage(List<T> list, Integer total, Class<R> rClass) {
        try {
            R obj = rClass.newInstance();
            ReflectionUtils.invokeMethod(ReflectionUtils.findMethod(rClass, "setList", List.class), obj, list);
            ReflectionUtils.invokeMethod(ReflectionUtils.findMethod(rClass, "setTotal", Long.class), obj, Long.valueOf(total));
            return obj;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static String md5Hash(String input, String type) {
        String md5Hash = SecureUtil.md5(input);

        if("LowerCase16".equals(type)) {
            String md5Hash16 = StrUtil.sub(md5Hash, 8, 24);
            return md5Hash16.toLowerCase();
        } else if("UpperCase16".equals(type)) {
            String md5Hash16 = StrUtil.sub(md5Hash, 8, 24);
            return md5Hash16.toUpperCase();
        } else if("LowerCase32".equals(type)) {
            return md5Hash.toLowerCase();
        } else {
            // UpperCase32
            return md5Hash.toUpperCase();
        }
    }

    public static String appendStr(String... args) {
        StringBuilder stringBuilder = new StringBuilder();
        for (String arg: args) {
            stringBuilder.append(arg);
        }
        return stringBuilder.toString();
    }

    public static String getLocalDateTimeStr() {
        return LocalDateTime.now().format(DateTimeFormatter.ofPattern(DatePattern.NORM_DATETIME_PATTERN));
    }

    public static String getLocalDateStr() {
        return LocalDate.now().format(DateTimeFormatter.ofPattern(DatePattern.NORM_DATE_PATTERN));
    }

    public static String getLocalTimeStr() {
        return LocalTime.now().format(DateTimeFormatter.ofPattern(DatePattern.NORM_TIME_PATTERN));
    }

    public static String formatLocalDate(LocalDate date, String formatter) {
        return date.format(DateTimeFormatter.ofPattern(Optional.ofNullable(formatter).orElse(DatePattern.NORM_DATE_PATTERN)));
    }

    public static String formatLocalDateTime(LocalDateTime dateTime, String formatter) {
        return dateTime.format(DateTimeFormatter.ofPattern(Optional.ofNullable(formatter).orElse(DatePattern.NORM_DATETIME_PATTERN)));
    }

    /**
     * 本季度第一天
     * @return
     */
    public static String getBeginOfQuarterStr() {
        Date currentDate = new Date();
        return DateUtil.beginOfQuarter(currentDate).toString();
    }

    /**
     * 本季度最后一天
     * @return
     */
    public static String getEndOfQuarterStr() {
        Date currentDate = new Date();
        return DateUtil.endOfQuarter(currentDate).toString();
    }

    /**
     * 本月第一天
     * @return
     */
    public static String getBeginOfMonthStr() {
        Date currentDate = new Date();
        return DateUtil.beginOfMonth(currentDate).toString();
    }

    /**
     * 本月最后一天
     * @return
     */
    public static String getEndOfMonthStr() {
        Date currentDate = new Date();
        return DateUtil.endOfMonth(currentDate).toString();
    }

    /**
     * 本周第一天
     * @return
     */
    public static String getBeginOfWeekStr() {
        Date currentDate = new Date();
        return DateUtil.beginOfWeek(currentDate).toString();
    }

    /**
     * 本周最后一天
     * @return
     */
    public static String getEndOfWeekStr() {
        Date currentDate = new Date();
        return DateUtil.endOfWeek(currentDate).toString();
    }

    /**
     * 计算两个日期之间相差的的毫秒
     *
     * @param startDate 开始日期
     * @param endDate 结束日期
     * @return 日期差
     */
    public static long calculateDateBetweenMS(LocalDate startDate, LocalDate endDate) {
        return DateUtil.between(DateUtil.date(startDate).toJdkDate(), DateUtil.date(endDate).toJdkDate(), DateUnit.MS);
    }


    public static <T> T getCollFirst(Collection<T> collection) {
        return CollUtil.get(collection, 0);
    }

    public static InputStream getURLInputStream(String url)  {
        try {
            URI uri = new URI(url);
            String encodedUrl = uri.toASCIIString();
            HttpURLConnection connection = (HttpURLConnection) new URL(encodedUrl).openConnection();
            connection.setReadTimeout(5000);
            connection.setConnectTimeout(5000);
            connection.setRequestMethod("GET");
            if (connection.getResponseCode() == HttpURLConnection.HTTP_OK) {
                return connection.getInputStream();
            }
        } catch (URISyntaxException | IOException e) {
            throw new RuntimeException(e);
        }
        return null;
    }

    /**
    * 获取非空值
    * @param value
    * @param other
    * @return
    * @param <T>
    */
   public static <T> T getOptionNullableValue(T value, T other) {
       return Optional.ofNullable(value).orElse(other);
   }

   /**
   * 将对象列表中的指定属性转换为列表
   *
   * @param list     对象列表
   * @param property 属性名称
   * @param <T>      属性类型
   * @param <E>      对象类型
   * @return 属性列表
   */
  public static <T, E> List<T> getListBeanPropertyList(List<E> list, String property) {
      return list.stream()
              .map(e -> {
                  try {
                      Field field = e.getClass().getDeclaredField(property);
                      field.setAccessible(true);
                      return (T) field.get(e);
                  } catch (NoSuchFieldException | IllegalAccessException ex) {
                      throw new RuntimeException("Failed to get property value", ex);
                  }
              })
              .collect(Collectors.toList());
  }

}
