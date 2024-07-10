package com.example.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import com.example.domain.entity.*;
import com.example.domain.model.*;

/**
 * 数据查询  E9E178F2118B4725AE837E32CFA6BCD1
 */
@Mapper
public interface DataQueryUuvbBizServiceMapper {
      
   List<AnonymousModelDataQueryUuvb> listAnonymousModelDataQueryUuvb(@Param("pageSizeTgmh") Integer pageSizeTgmh,@Param("currentPageNumberTkwz") Integer currentPageNumberTkwz,@Param("projectIdUfdh") Long projectIdUfdh);
   Long countAnonymousModelDataQueryUuvb(@Param("pageSizeTgmh") Integer pageSizeTgmh,@Param("currentPageNumberTkwz") Integer currentPageNumberTkwz,@Param("projectIdUfdh") Long projectIdUfdh);

}
 