package com.example.controller.bizflow;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.apache.commons.lang3.ObjectUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import io.swagger.v3.oas.annotations.tags.Tag;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import java.util.*;
import java.time.*;
import java.time.format.*;
import com.example.service.*;
import com.example.service.bizflow.*;
import com.example.mapper.*;
import com.example.domain.constant.*;
import com.example.common.result.Resp;
import com.example.domain.model.*;
import com.example.common.util.*;
import com.example.domain.entity.*;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.service.bizflow.UserServicesRjziBizService;
import com.example.service.bizflow.PasswordEncryptionServiceXvrrBizService;import org.apache.commons.lang3.ObjectUtils;
import java.util.Objects;


@Tag(name = "用户接口")
@RequestMapping("/userJk")
@RestController
public class UserInterfaceYlwdExposeController {
      
    private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private UserServicesRjziBizService userServicesRjziService;

    @Autowired
    private PasswordEncryptionServiceXvrrBizService passwordEncryptionServiceXvrrService;

    @Autowired
    private UserinfoEntityService userinfoEntityService;

    
    /**
     * 用户条件查询 
     * @param userNameParameterShsp 用户名参数
     * @param telephoneParametersJcoe 电话参数
     * @param stateParametersHomh 状态参数
     * @param timeParameterRzhy 时间参数
     * @param nicknameParametersNgjr 昵称参数
     * @param departmentParametersVkfx 部门参数
     * @param numberOfEntriesPerPageGzpj 每页条数
     * @param currentPageNumberZqru 当前页码
     * @return
     */
    @GetMapping("/aggQuery/userConditionQueryBowo")
    public ResponseEntity<PageOfaggregatedQueryZtul> userConditionQueryEhwf(@RequestParam(required = false) String userNameParameterShsp,@RequestParam(required = false) String telephoneParametersJcoe,@RequestParam(required = false) String stateParametersHomh,@RequestParam(required = false,defaultValue = "2024-05-01") java.time.LocalDate timeParameterRzhy,@RequestParam(required = false) String nicknameParametersNgjr,@RequestParam(required = false) String departmentParametersVkfx,@RequestParam(required = false,defaultValue = "10") Integer numberOfEntriesPerPageGzpj,@RequestParam(required = false,defaultValue = "1") Integer currentPageNumberZqru) {
        PageOfaggregatedQueryZtul outputParametersGmpl = new PageOfaggregatedQueryZtul();
        var callUserConditionQueryCfdw =  userServicesRjziService.userConditionQueryBowo(userNameParameterShsp,telephoneParametersJcoe,stateParametersHomh,timeParameterRzhy,nicknameParametersNgjr,departmentParametersVkfx,numberOfEntriesPerPageGzpj,currentPageNumberZqru);        
        // 赋值-用户条件查询 
        outputParametersGmpl = callUserConditionQueryCfdw;

        return ResponseEntity.ok(outputParametersGmpl);
    }
    
    /**
     * 加密流程 
     * @param parametersBeforeEncryptionZoxb 加密前的参数
     * @return
     */
    @GetMapping("/aggQuery/encryptionProcessSzim")
    public ResponseEntity<String> encryptionProcessHubu(@RequestParam(required = false) String parametersBeforeEncryptionZoxb) {
        String encryptedParametersXwlv = "";
        var callingTheEncryptionProcessOoqx =  passwordEncryptionServiceXvrrService.encryptionProcessSzim(parametersBeforeEncryptionZoxb);        
        // 赋值-加密流程 
        encryptedParametersXwlv = callingTheEncryptionProcessOoqx;

        return ResponseEntity.ok(encryptedParametersXwlv);
    }
    
    /**
     * 用户登录流程 
     * @param accountVpzv 账号
     * @param passwordHbho 密码
     * @return
     */
    @GetMapping("/aggQuery/userLoginProcessDjab")
    public ResponseEntity<UserinfoEntity> userLoginProcessDjyr(@RequestParam(required = false) String accountVpzv,@RequestParam(required = false) String passwordHbho) {
        UserinfoEntity loginResultsPuyn = new UserinfoEntity();
        var callingTheUserLoginProcessRnes =  userServicesRjziService.userLoginProcessDjab(accountVpzv,passwordHbho);        
        // 赋值-用户登录流程 
        loginResultsPuyn = callingTheUserLoginProcessRnes;

        return ResponseEntity.ok(loginResultsPuyn);
    }
    
    /**
     * 用户权限查询 
     * @param userId 用户id
     * @return
     */
    @GetMapping("/aggQuery/userPermissionBusinessFlowHmza")
    public ResponseEntity<PageOfdataQueryYdfw> userPermissionQueryLvhm(@RequestParam(required = false) Long userId) {
        PageOfdataQueryYdfw outputParametersPnkb = new PageOfdataQueryYdfw();
        var callUserPermissionBusinessFlowUbkn =  userServicesRjziService.userPermissionBusinessFlowHmza(userId);        
        // 赋值-用户权限业务流 
        outputParametersPnkb = callUserPermissionBusinessFlowUbkn;

        return ResponseEntity.ok(outputParametersPnkb);
    }
    
    /**
     * 重置密码 
     * @param userIdCpqg 用户ID
     * @param userNewPasswordBhpq 用户新密码
     * @return
     */
    @PostMapping("/czmm")
    public ResponseEntity<Integer> resetPasswordDwcp(@RequestParam(required = false) Long userIdCpqg,@RequestParam(required = false) String userNewPasswordBhpq) {
        Integer resetPasswordResultNdvk = null;
        var callingThePasswordModificationProcessCcpd =  userServicesRjziService.passwordModificationProcessAovp(userIdCpqg,userNewPasswordBhpq);        
        // 赋值 
        resetPasswordResultNdvk = 1;

        return ResponseEntity.ok(resetPasswordResultNdvk);
    }
    
    /**
     * 修改密码 
     * @param userIdKztn 用户ID
     * @param oldPasswordPfzs 旧密码
     * @param newPasswordLolc 新密码
     * @param userNameTnsq 用户名
     * @return
     */
    @PostMapping("/xgmm")
    public ResponseEntity<Integer> changePasswordMfau(@RequestParam(required = false) Long userIdKztn,@RequestParam(required = false) String oldPasswordPfzs,@RequestParam(required = false) String newPasswordLolc,@RequestParam(required = false) String userNameTnsq) {
        Integer changePasswordResultLyvk = null;       // 查询一条记录
        QueryWrapper<UserinfoEntity> userinfoEntitySelectOneWrapper = new QueryWrapper<>();
        
        userinfoEntitySelectOneWrapper.or(wrapper ->
          wrapper.eq("userName", userNameTnsq)
        
        );

        userinfoEntitySelectOneWrapper.last("limit 1");
        var queryARecordUsvy = userinfoEntityService.getBaseMapper().selectOne(userinfoEntitySelectOneWrapper);

        // 判断1
        if ((ObjectUtils.notEqual(queryARecordUsvy.getUserName(), null))  ){
        // 条件

        var oldPasswordEncryptionBusinessFlowYoxd =  passwordEncryptionServiceXvrrService.encryptionProcessSzim(oldPasswordPfzs);
        // 判断
        if ((Objects.equals(queryARecordUsvy.getPassword(), oldPasswordEncryptionBusinessFlowYoxd))  ){
        // 条件

        var callToModifyPasswordBusinessFlowZyks =  userServicesRjziService.passwordModificationProcessAovp(queryARecordUsvy.getId(),newPasswordLolc);        
        // 赋值1 
        changePasswordResultLyvk = 1;

        }else {
        // 条件判断else
        
        // 赋值2 
        changePasswordResultLyvk = 2;

        }
        }else {
        // 条件判断else
        
        // 赋值0 
        changePasswordResultLyvk = 0;

        }
        return ResponseEntity.ok(changePasswordResultLyvk);
    }
    
    /**
     * 角色权限查询 
     * @param roleIdXuhc 角色ID
     * @return
     */
    @GetMapping("/aggQuery/rolePermissionQueryJinj")
    public ResponseEntity<PageOfaggregatedQuerySuyk> rolePermissionQueryZudf(@RequestParam(required = false) Long roleIdXuhc) {
        PageOfaggregatedQuerySuyk outputParametersEzvt = new PageOfaggregatedQuerySuyk();
        var callRolePermissionQueryLkol =  userServicesRjziService.rolePermissionQueryJinj(roleIdXuhc);        
        // 赋值-角色权限查询 
        outputParametersEzvt = callRolePermissionQueryLkol;

        return ResponseEntity.ok(outputParametersEzvt);
    }
    
    /**
     * 创建修改角色信息 
     * @param roleListInputYosu 角色列表入参
     * @return
     */
    @PostMapping("/aggQuery/createAndModifyRoleInformationXjfv")
    public ResponseEntity<Boolean> createAndModifyRoleInformationUczq(@RequestBody List<RoleRelevanceEntity> roleListInputYosu) {
        Boolean outputParametersQmmb = false;
        var callToCreateAndModifyRoleInformationCttu =  userServicesRjziService.createAndModifyRoleInformationXjfv(roleListInputYosu);        
        // 赋值-创建修改角色信息 
        outputParametersQmmb = callToCreateAndModifyRoleInformationCttu;

        return ResponseEntity.ok(outputParametersQmmb);
    }
}
 