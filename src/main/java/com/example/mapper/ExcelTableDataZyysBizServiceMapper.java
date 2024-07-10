package com.example.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import com.example.domain.entity.*;
import com.example.domain.model.*;

/**
 * excel表数据  1BC6678D0016489FB2785C443A28C89E
 */
@Mapper
public interface ExcelTableDataZyysBizServiceMapper {
      
   List<AnonymousModelDataQueryKbap> listAnonymousModelDataQueryKbap();
   Long countAnonymousModelDataQueryKbap();

}
 