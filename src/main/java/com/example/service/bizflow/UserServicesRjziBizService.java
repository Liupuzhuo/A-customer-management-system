package com.example.service.bizflow;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.apache.commons.lang3.ObjectUtils;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import org.apache.commons.lang3.ObjectUtils;
import java.util.*;
import java.time.*;
import java.time.format.*;
import com.example.service.*;
import com.example.common.util.*;
import com.example.common.exception.*;
import com.example.domain.constant.*;
import com.example.domain.entity.*;
import com.example.domain.model.*;
import com.example.mapper.*;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.mapper.UserConditionQueryBxqfBizServiceMapper;

import org.springframework.beans.factory.annotation.Autowired;
import com.example.service.bizflow.PasswordEncryptionServiceXvrrBizService;import com.example.mapper.RolePermissionQueryRfnxBizServiceMapper;

import cn.hutool.json.JSONUtil;

import cn.hutool.json.JSONUtil;

import cn.hutool.json.JSONUtil;

import cn.hutool.json.JSONUtil;
import org.apache.commons.lang3.ObjectUtils;

import cn.hutool.core.collection.CollUtil;
import java.util.Objects;


/**
 * 用户服务
 */
@Service
public class UserServicesRjziBizService {
      
    private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private UserConditionQueryBxqfBizServiceMapper userConditionQueryBxqfBizServiceMapper;

    @Autowired
    private PasswordEncryptionServiceXvrrBizService passwordEncryptionServiceXvrrService;

    @Autowired
    private RolePermissionQueryRfnxBizServiceMapper rolePermissionQueryRfnxBizServiceMapper;

    @Autowired
    private UserinfoEntityService userinfoEntityService;

    @Autowired
    private DataQueryYdfwBizServiceMapper dataQueryYdfwBizServiceMapper;

    @Autowired
    private QueryOfExistingRoleDataEmvzBizServiceMapper queryOfExistingRoleDataEmvzBizServiceMapper;

    @Autowired
    private RoleRelevanceEntityService roleRelevanceEntityService;

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
     * @return 输出参数
     */
    public PageOfaggregatedQueryZtul userConditionQueryBowo(String userNameParameterShsp, String telephoneParametersJcoe, String stateParametersHomh, java.time.LocalDate timeParameterRzhy, String nicknameParametersNgjr, String departmentParametersVkfx, Integer numberOfEntriesPerPageGzpj, Integer currentPageNumberZqru){
        PageOfaggregatedQueryZtul outputParametersGmpl = new PageOfaggregatedQueryZtul();

        // 调用聚合查询
        PageOfaggregatedQueryZtul callAggregationQueryBhjr = BizFunctionUtil.createListPage(userConditionQueryBxqfBizServiceMapper.listAnonymousModelAggregatedQueryZtul(userNameParameterShsp,telephoneParametersJcoe,stateParametersHomh,timeParameterRzhy,nicknameParametersNgjr,departmentParametersVkfx,numberOfEntriesPerPageGzpj,currentPageNumberZqru), userConditionQueryBxqfBizServiceMapper.countAnonymousModelAggregatedQueryZtul(userNameParameterShsp,telephoneParametersJcoe,stateParametersHomh,timeParameterRzhy,nicknameParametersNgjr,departmentParametersVkfx,numberOfEntriesPerPageGzpj,currentPageNumberZqru).intValue(), PageOfaggregatedQueryZtul.class);        
        // 赋值 
        outputParametersGmpl = callAggregationQueryBhjr;
        
        return outputParametersGmpl;
    }

    /**
     * 用户登录流程
     * @param accountVpzv 账号
     * @param passwordHbho 密码
     * @return 登录结果
     */
    public UserinfoEntity userLoginProcessDjab(String accountVpzv, String passwordHbho){
        UserinfoEntity loginResultsPuyn = new UserinfoEntity();

        // 用户信息
        UserinfoEntity userInformationGdor = new UserinfoEntity();
        var callBusinessFlowAsfz =  passwordEncryptionServiceXvrrService.encryptionProcessSzim(passwordHbho);       // 查询一条记录
        QueryWrapper<UserinfoEntity> userinfoEntitySelectOneWrapper = new QueryWrapper<>();
        
        userinfoEntitySelectOneWrapper.or(wrapper ->
          wrapper.eq("userName", accountVpzv)
        .and(wrapper1 -> wrapper1.eq("password", callBusinessFlowAsfz))
        );

        userinfoEntitySelectOneWrapper.last("limit 1");
        var queryARecordTrhu = userinfoEntityService.getBaseMapper().selectOne(userinfoEntitySelectOneWrapper);

        // 判断
        if ((ObjectUtils.notEqual(queryARecordTrhu, null))  ){
        // 条件
        
        // 赋值 
        loginResultsPuyn = queryARecordTrhu;
        loginResultsPuyn.setPassword(null);

        }else {
        // 条件判断else

        }        
        return loginResultsPuyn;
    }

    /**
     * 用户权限业务流
     * @param userId 用户id
     * @return 输出参数
     */
    public PageOfdataQueryYdfw userPermissionBusinessFlowHmza(Long userId){
        PageOfdataQueryYdfw outputParametersPnkb = new PageOfdataQueryYdfw();

        // 数据查询
        PageOfdataQueryYdfw dataQueryYdfw = BizFunctionUtil.createListPage(dataQueryYdfwBizServiceMapper.listAnonymousModelDataQueryYdfw(userId), dataQueryYdfwBizServiceMapper.countAnonymousModelDataQueryYdfw(userId).intValue(), PageOfdataQueryYdfw.class);        
        // 赋值 
        outputParametersPnkb = dataQueryYdfw;
        
        return outputParametersPnkb;
    }

    /**
     * 修改密码流程
     * @param userIdTkay 用户ID
     * @param newPasswordDqor 新密码
     * @return 修改密码结果
     */
    public Integer passwordModificationProcessAovp(Long userIdTkay, String newPasswordDqor){
        Integer changePasswordResultMkmj = null;

        var callingEncryptedBusinessFlowKyfr =  passwordEncryptionServiceXvrrService.encryptionProcessSzim(newPasswordDqor);
        // copy variables
        var copyid20n = userIdTkay;
        // 数据修改
        UpdateWrapper<UserinfoEntity> dataModificationWovuEntityUpdateWrapper = new UpdateWrapper<>();
        dataModificationWovuEntityUpdateWrapper.or(wrapper ->
          wrapper.eq("id", copyid20n)
          
        );
        UserinfoEntity dataModificationWovuuserinfoEntity = new UserinfoEntity();
        dataModificationWovuuserinfoEntity.setPassword(callingEncryptedBusinessFlowKyfr);
        var dataModificationWovu = userinfoEntityService.getBaseMapper().update(dataModificationWovuuserinfoEntity, dataModificationWovuEntityUpdateWrapper);
        
        // 赋值 
        changePasswordResultMkmj = dataModificationWovu;
        
        return changePasswordResultMkmj;
    }

    /**
     * 角色权限查询
     * @param roleIdXuhc 角色ID
     * @return 输出参数
     */
    public PageOfaggregatedQuerySuyk rolePermissionQueryJinj(Long roleIdXuhc){
        PageOfaggregatedQuerySuyk outputParametersEzvt = new PageOfaggregatedQuerySuyk();

        // 调用聚合查询
        PageOfaggregatedQuerySuyk callAggregationQueryUbvb = BizFunctionUtil.createListPage(rolePermissionQueryRfnxBizServiceMapper.listAnonymousModelAggregatedQuerySuyk(roleIdXuhc), rolePermissionQueryRfnxBizServiceMapper.countAnonymousModelAggregatedQuerySuyk(roleIdXuhc).intValue(), PageOfaggregatedQuerySuyk.class);        
        // 赋值 
        outputParametersEzvt = callAggregationQueryUbvb;
        
        return outputParametersEzvt;
    }

    /**
     * 创建修改角色信息
     * @param roleListInputYosu 角色列表入参
     * @return 输出参数
     */
    @Transactional(rollbackFor = BusinessException.class)
    public Boolean createAndModifyRoleInformationXjfv(List<RoleRelevanceEntity> roleListInputYosu){
        Boolean outputParametersQmmb = false;

        // insert
        List<RoleRelevanceEntity> insertGwbv = new ArrayList<>();
        // update
        List<RoleRelevanceEntity> updateSwvs = new ArrayList<>();
        // 临时用户角色信息
        RoleRelevanceEntity temporaryUserRoleInformationEpvw = new RoleRelevanceEntity();
        // 判断
        if ((CollUtil.size(roleListInputYosu)>0)  ){
        // 条件
        
        // 赋值1 
        temporaryUserRoleInformationEpvw = BizFunctionUtil.getCollFirst(roleListInputYosu);

        // 已存在的角色数据查询
        PageOfdataQueryBtfm queryOfExistingRoleDataEmvz = BizFunctionUtil.createListPage(queryOfExistingRoleDataEmvzBizServiceMapper.listAnonymousModelDataQueryBtfm(temporaryUserRoleInformationEpvw.getUserId()), queryOfExistingRoleDataEmvzBizServiceMapper.countAnonymousModelDataQueryBtfm(temporaryUserRoleInformationEpvw.getUserId()).intValue(), PageOfdataQueryBtfm.class);
        // 判断
        if ((queryOfExistingRoleDataEmvz.getTotal()>0)  ){
        // 条件

        // 现存数据循环删除
        for(AnonymousModelDataQueryBtfm citem: queryOfExistingRoleDataEmvz.getList()) {
        QueryWrapper<RoleRelevanceEntity> dataDeletionTzzrEntityDeleteWrapper = new QueryWrapper<>();
        
        dataDeletionTzzrEntityDeleteWrapper.or(wrapper ->
          wrapper.eq("id", citem.getId())
        
        );

        var dataDeletionTzzr = roleRelevanceEntityService.getBaseMapper().delete(dataDeletionTzzrEntityDeleteWrapper);

        };
        }else {
        // 条件判断else

        }
        // 入参循环插入
        for(RoleRelevanceEntity ritem: roleListInputYosu) {
        // 判断
        if ((Objects.equals(ritem.getId(), null))  ){
        // insert

        RoleRelevanceEntity dataAdditionSlvwroleRelevanceEntity = new RoleRelevanceEntity();
        dataAdditionSlvwroleRelevanceEntity.setUserId(ritem.getUserId());
        dataAdditionSlvwroleRelevanceEntity.setRoleId(ritem.getRoleId());
        roleRelevanceEntityService.getBaseMapper().insert(dataAdditionSlvwroleRelevanceEntity);
        var dataAdditionSlvw = dataAdditionSlvwroleRelevanceEntity;
        }else {
        // update

        // copy variables
        var copyidlvc = ritem.getId();
        // 数据修改
        UpdateWrapper<RoleRelevanceEntity> dataModificationTtsgEntityUpdateWrapper = new UpdateWrapper<>();
        dataModificationTtsgEntityUpdateWrapper.or(wrapper ->
          wrapper.eq("id", copyidlvc)
          
        );
        RoleRelevanceEntity dataModificationTtsgroleRelevanceEntity = new RoleRelevanceEntity();
        dataModificationTtsgroleRelevanceEntity.setUserId(ritem.getUserId());
        dataModificationTtsgroleRelevanceEntity.setRoleId(ritem.getRoleId());
        var dataModificationTtsg = roleRelevanceEntityService.getBaseMapper().update(dataModificationTtsgroleRelevanceEntity, dataModificationTtsgEntityUpdateWrapper);

        }
        };        
        // 赋值 
        outputParametersQmmb = true;

        }else {
        // 条件判断else
        
        // 赋值 
        outputParametersQmmb = false;

        }        
        return outputParametersQmmb;
    }

    /**
     * 根据用户id和角色id删除角色信息
     * @param useridFwkk userId
     * @param roleidYvvt roleId
     * @return 输出参数
     */
    public Integer deleteRoleInformationBasedOnUserIdAndRoleIdIamv(Long useridFwkk, Long roleidYvvt){
        Integer outputParametersYptt = null;

        QueryWrapper<RoleRelevanceEntity> dataDeletionRgmcEntityDeleteWrapper = new QueryWrapper<>();
        
        dataDeletionRgmcEntityDeleteWrapper.or(wrapper ->
          wrapper.eq("user_id", useridFwkk)
        .and(wrapper1 -> wrapper1.eq("role_id", roleidYvvt))
        );

        var dataDeletionRgmc = roleRelevanceEntityService.getBaseMapper().delete(dataDeletionRgmcEntityDeleteWrapper);
        
        // 赋值 
        outputParametersYptt = dataDeletionRgmc;
        
        return outputParametersYptt;
    }

}
 