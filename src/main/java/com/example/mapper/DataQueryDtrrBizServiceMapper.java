package com.example.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import com.example.domain.entity.*;
import com.example.domain.model.*;

/**
 * 数据查询  A7BE72D282C04D92BB1AB3247F84D8E2
 */
@Mapper
public interface DataQueryDtrrBizServiceMapper {
      
   List<AnonymousModelDataQueryDtrr> listAnonymousModelDataQueryDtrr(@Param("numberOfPagesDldr") Integer numberOfPagesDldr,@Param("pageNumberWftn") Integer pageNumberWftn,@Param("userId") Long userId);
   Long countAnonymousModelDataQueryDtrr(@Param("numberOfPagesDldr") Integer numberOfPagesDldr,@Param("pageNumberWftn") Integer pageNumberWftn,@Param("userId") Long userId);

}
 