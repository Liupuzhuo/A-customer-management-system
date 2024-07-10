package com.example.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import com.example.domain.entity.*;
import com.example.domain.model.*;

/**
 * 数据查询  F4AB9344E9744823B66F84C05836C620
 */
@Mapper
public interface DataQueryHhisBizServiceMapper {
      
   List<AnonymousModelDataQueryHhis> listAnonymousModelDataQueryHhis();
   Long countAnonymousModelDataQueryHhis();

}
 