package com.example.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import com.example.domain.entity.*;
import com.example.domain.model.*;

/**
 * 已存在的角色数据查询  13F836CDE25E4695BAAE271057D035ED
 */
@Mapper
public interface QueryOfExistingRoleDataEmvzBizServiceMapper {
      
   List<AnonymousModelDataQueryBtfm> listAnonymousModelDataQueryBtfm(@Param("user_id") Long user_id);
   Long countAnonymousModelDataQueryBtfm(@Param("user_id") Long user_id);

}
 