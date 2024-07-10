package com.example.service.bizflow;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.apache.commons.lang3.ObjectUtils;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import org.apache.commons.lang3.ObjectUtils;
import java.util.*;
import java.time.*;
import java.time.format.*;
import com.example.service.*;
import com.example.common.util.*;
import com.example.common.exception.*;
import com.example.domain.constant.*;
import com.example.domain.entity.*;
import com.example.domain.model.*;
import com.example.mapper.*;
import cn.hutool.core.collection.CollUtil;
import org.apache.commons.lang3.ObjectUtils;
import java.util.Objects;


/**
 * 导出业务流
 */
@Service
public class ExportBusinessFlowNzsbBizService {
      
    private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private ExcelTableDataZyysBizServiceMapper excelTableDataZyysBizServiceMapper;

    @Autowired
    private EnumeratingQueryResultsEmapBizServiceMapper enumeratingQueryResultsEmapBizServiceMapper;

    /**
     * excel导出
     * @return excel数据
     */
    public List<AnonymousModelDataQueryKbap> excelExportMzjb(){
        List<AnonymousModelDataQueryKbap> excelDataFzar = new ArrayList<>();

        // excel表数据
        PageOfdataQueryKbap excelTableDataZyys = BizFunctionUtil.createListPage(excelTableDataZyysBizServiceMapper.listAnonymousModelDataQueryKbap(), excelTableDataZyysBizServiceMapper.countAnonymousModelDataQueryKbap().intValue(), PageOfdataQueryKbap.class);
        // 枚举查询结果
        PageOfdataQueryCgiv enumeratingQueryResultsEmap = BizFunctionUtil.createListPage(enumeratingQueryResultsEmapBizServiceMapper.listAnonymousModelDataQueryCgiv(), enumeratingQueryResultsEmapBizServiceMapper.countAnonymousModelDataQueryCgiv().intValue(), PageOfdataQueryCgiv.class);
        // 判断
        if ((ObjectUtils.notEqual(CollUtil.isEmpty(enumeratingQueryResultsEmap.getList()), true) || ObjectUtils.notEqual(CollUtil.isEmpty(excelTableDataZyys.getList()), true))  ){
        // 条件

        // excel表数据循环
        for(AnonymousModelDataQueryKbap excelItem: excelTableDataZyys.getList()) {
        // 枚举列表循环
        for(AnonymousModelDataQueryCgiv enumItem: enumeratingQueryResultsEmap.getList()) {
        // 判断
        if ((Objects.equals(enumItem.getCode(), excelItem.getTaskType()) || Objects.equals(enumItem.getType(), 1))  ){
        // 任务类型判断
        
        // 赋值 
        excelItem.setTaskType(enumItem.getName());

        }else {
        // 条件判断else

        }
        // 判断1
        if ((Objects.equals(enumItem.getCode(), excelItem.getTaskState()) || Objects.equals(enumItem.getType(), 2))  ){
        // 任务状态判断
        
        // 赋值 
        excelItem.setTaskState(enumItem.getName());

        }else {
        // 条件判断else

        }
        // 判断2
        if ((Objects.equals(enumItem.getType(), 3) || Objects.equals(enumItem.getCode(), excelItem.getIntentionFeidi()))  ){
        // 意向飞地判断
        
        // 赋值 
        excelItem.setIntentionFeidi(enumItem.getName());

        }else {
        // 条件判断else

        }
        };
        };
        }else {
        // 条件判断else

        }        
        // 赋值1 
        excelDataFzar = excelTableDataZyys.getList();
        
        return excelDataFzar;
    }

}
 