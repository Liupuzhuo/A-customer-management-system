package com.example.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import com.example.domain.entity.*;
import com.example.domain.model.*;

/**
 * 数据查询  CCF956B9816C463A92407501FB141794
 */
@Mapper
public interface DataQueryYdfwBizServiceMapper {
      
   List<AnonymousModelDataQueryYdfw> listAnonymousModelDataQueryYdfw(@Param("userId") Long userId);
   Long countAnonymousModelDataQueryYdfw(@Param("userId") Long userId);

}
 