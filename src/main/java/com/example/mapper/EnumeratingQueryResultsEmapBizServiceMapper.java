package com.example.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import com.example.domain.entity.*;
import com.example.domain.model.*;

/**
 * 枚举查询结果  9E05F16EF3CE47048C2AF68EE4080C30
 */
@Mapper
public interface EnumeratingQueryResultsEmapBizServiceMapper {
      
   List<AnonymousModelDataQueryCgiv> listAnonymousModelDataQueryCgiv();
   Long countAnonymousModelDataQueryCgiv();

}
 