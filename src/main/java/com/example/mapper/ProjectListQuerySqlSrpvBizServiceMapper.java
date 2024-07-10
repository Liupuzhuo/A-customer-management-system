package com.example.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import com.example.domain.entity.*;
import com.example.domain.model.*;

/**
 * 项目列表查询sql  CCDDC5D0010C442787D77B268AEBD6BF
 */
@Mapper
public interface ProjectListQuerySqlSrpvBizServiceMapper {
      
   List<AnonymousModelDataQueryPzvq> listAnonymousModelDataQueryPzvq(@Param("numberOfEntriesPerPageAlgr") Integer numberOfEntriesPerPageAlgr,@Param("currentPageNumberLoib") Integer currentPageNumberLoib,@Param("entryNameTkrg") String entryNameTkrg,@Param("taskTypeAfjc") String taskTypeAfjc,@Param("intendedEnclaveFdep") String intendedEnclaveFdep,@Param("taskStatusAlfw") String taskStatusAlfw,@Param("projectManagerKvxe") String projectManagerKvxe);
   Long countAnonymousModelDataQueryPzvq(@Param("numberOfEntriesPerPageAlgr") Integer numberOfEntriesPerPageAlgr,@Param("currentPageNumberLoib") Integer currentPageNumberLoib,@Param("entryNameTkrg") String entryNameTkrg,@Param("taskTypeAfjc") String taskTypeAfjc,@Param("intendedEnclaveFdep") String intendedEnclaveFdep,@Param("taskStatusAlfw") String taskStatusAlfw,@Param("projectManagerKvxe") String projectManagerKvxe);

}
 