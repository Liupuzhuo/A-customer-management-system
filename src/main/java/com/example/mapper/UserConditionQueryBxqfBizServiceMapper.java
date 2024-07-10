package com.example.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import com.example.domain.entity.*;
import com.example.domain.model.*;

/**
 * 用户条件查询 7BBEFEFBFF534CB58CEAAC906FE66992
 */
@Mapper
public interface UserConditionQueryBxqfBizServiceMapper {
      
   List<AnonymousModelAggregatedQueryZtul> listAnonymousModelAggregatedQueryZtul(@Param("userNameParameterShsp") String userNameParameterShsp,@Param("telephoneParametersJcoe") String telephoneParametersJcoe,@Param("stateParametersHomh") String stateParametersHomh,@Param("timeParameterRzhy") java.time.LocalDate timeParameterRzhy,@Param("nicknameParametersNgjr") String nicknameParametersNgjr,@Param("departmentParametersVkfx") String departmentParametersVkfx,@Param("numberOfEntriesPerPageGzpj") Integer numberOfEntriesPerPageGzpj,@Param("currentPageNumberZqru") Integer currentPageNumberZqru);
   Long countAnonymousModelAggregatedQueryZtul(@Param("userNameParameterShsp") String userNameParameterShsp,@Param("telephoneParametersJcoe") String telephoneParametersJcoe,@Param("stateParametersHomh") String stateParametersHomh,@Param("timeParameterRzhy") java.time.LocalDate timeParameterRzhy,@Param("nicknameParametersNgjr") String nicknameParametersNgjr,@Param("departmentParametersVkfx") String departmentParametersVkfx,@Param("numberOfEntriesPerPageGzpj") Integer numberOfEntriesPerPageGzpj,@Param("currentPageNumberZqru") Integer currentPageNumberZqru);

}
 