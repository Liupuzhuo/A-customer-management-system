package com.example.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import com.example.domain.entity.*;
import com.example.domain.model.*;

/**
 * 角色权限查询 33ADB415D20B45B0A6DE0BA4C42718C7
 */
@Mapper
public interface RolePermissionQueryRfnxBizServiceMapper {
      
   List<AnonymousModelAggregatedQuerySuyk> listAnonymousModelAggregatedQuerySuyk(@Param("roleIdXuhc") Long roleIdXuhc);
   Long countAnonymousModelAggregatedQuerySuyk(@Param("roleIdXuhc") Long roleIdXuhc);

}
 