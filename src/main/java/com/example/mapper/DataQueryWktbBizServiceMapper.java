package com.example.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import com.example.domain.entity.*;
import com.example.domain.model.*;

/**
 * 数据查询  A434FF01050D40DC8D6511FB52564EDD
 */
@Mapper
public interface DataQueryWktbBizServiceMapper {
      
   List<AnonymousModelDataQueryWktb> listAnonymousModelDataQueryWktb(@Param("pageSizeMruf") Integer pageSizeMruf,@Param("currentPageNumberJsli") Integer currentPageNumberJsli);
   Long countAnonymousModelDataQueryWktb(@Param("pageSizeMruf") Integer pageSizeMruf,@Param("currentPageNumberJsli") Integer currentPageNumberJsli);

}
 