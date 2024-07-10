package com.example.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import com.example.domain.entity.*;
import com.example.domain.model.*;

/**
 * 枚举列表查询  8F106EDFB912444797EC0C5F564749CF
 */
@Mapper
public interface EnumerationListQuerySjzoBizServiceMapper {
      
   List<AnonymousModelDataQueryKblp> listAnonymousModelDataQueryKblp(@Param("enumerationTypeZzuk") Integer enumerationTypeZzuk);
   Long countAnonymousModelDataQueryKblp(@Param("enumerationTypeZzuk") Integer enumerationTypeZzuk);

}
 