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
import cn.hutool.json.JSONUtil;

import cn.hutool.json.JSONUtil;

import cn.hutool.json.JSONUtil;

import cn.hutool.json.JSONUtil;

import cn.hutool.json.JSONUtil;

import java.time.LocalDateTime;

import java.time.LocalDate;


/**
 * 项目列表crud服务
 */
@Service
public class ProjectListCrudServiceSgcsBizService {
      
    private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private WorklistEntityService worklistEntityService;

    @Autowired
    private TaskTrackEntityService taskTrackEntityService;

    /**
     * 添加项目信息和子表信息
     * @param entryNameYdav 项目名称
     * @param taskTypeZsxx 任务类型
     * @param projectManagerPcms 项目经理
     * @param homepageTaskStatusUaul 主页任务状态
     * @param intendedEnclaveNfry 意向飞地
     * @param remarksAjjp 备注
     * @param responsiblePersonSvjs 负责人
     * @param dateTgrl 日期
     * @param subtableTaskStatusNspp 子表任务状态
     * @param projectDebriefingDkzs 项目进展
     * @return 输出参数
     */
    @Transactional(rollbackFor = BusinessException.class)
    public Long addProjectInformationAndSubtableInformationSrmg(String entryNameYdav, String taskTypeZsxx, String projectManagerPcms, String homepageTaskStatusUaul, String intendedEnclaveNfry, String remarksAjjp, String responsiblePersonSvjs, java.time.LocalDate dateTgrl, String subtableTaskStatusNspp, String projectDebriefingDkzs){
        Long outputParametersRmab = 0L;

        // 创建时间
        java.time.LocalDateTime creationTimeMqbu = null;
        // 时间变量
        java.time.LocalDateTime timeVariableMljv = null;
        // 追踪时间变量
        java.time.LocalDate trackingTimeVariablesZosy = null;        
        // 赋值1 
        timeVariableMljv = LocalDateTime.now();
        trackingTimeVariablesZosy = LocalDate.now();

        WorklistEntity addProjectSqlUjydworklistEntity = new WorklistEntity();
        addProjectSqlUjydworklistEntity.setProjectName(entryNameYdav);
        addProjectSqlUjydworklistEntity.setTaskType(taskTypeZsxx);
        addProjectSqlUjydworklistEntity.setIntentionFeidi(intendedEnclaveNfry);
        addProjectSqlUjydworklistEntity.setTaskState(homepageTaskStatusUaul);
        addProjectSqlUjydworklistEntity.setManager(projectManagerPcms);
        addProjectSqlUjydworklistEntity.setRemark(remarksAjjp);
        addProjectSqlUjydworklistEntity.setCreateTime(timeVariableMljv);
        addProjectSqlUjydworklistEntity.setUpdateTime(timeVariableMljv);
        worklistEntityService.getBaseMapper().insert(addProjectSqlUjydworklistEntity);
        var addProjectSqlUjyd = addProjectSqlUjydworklistEntity;
        TaskTrackEntity addSubTableSqlGaawtaskTrackEntity = new TaskTrackEntity();
        addSubTableSqlGaawtaskTrackEntity.setDirector(responsiblePersonSvjs);
        addSubTableSqlGaawtaskTrackEntity.setTaskStatus(subtableTaskStatusNspp);
        addSubTableSqlGaawtaskTrackEntity.setProgress(projectDebriefingDkzs);
        addSubTableSqlGaawtaskTrackEntity.setCreateTime(timeVariableMljv);
        addSubTableSqlGaawtaskTrackEntity.setTrackingTime(trackingTimeVariablesZosy);
        addSubTableSqlGaawtaskTrackEntity.setWorkListId(addProjectSqlUjyd.getId());
        taskTrackEntityService.getBaseMapper().insert(addSubTableSqlGaawtaskTrackEntity);
        var addSubTableSqlGaaw = addSubTableSqlGaawtaskTrackEntity;        
        return outputParametersRmab;
    }

    /**
     * 修改主表/添加子表信息业务流
     * @param projectIdYawo 项目id
     * @param entryNameBicu 项目名称
     * @param taskTypeBiyu 任务类型
     * @param homepageTaskStatusPneq 主页任务状态
     * @param intendedEnclaveZefc 意向飞地
     * @param remarksOdtx 备注
     * @param responsiblePersonLxyy 负责人
     * @param dateOpvo 日期
     * @param subtableTaskStatusAshb 子表任务状态
     * @param dockingProgressJbxd 对接进展
     * @param projectManagerYhhh 项目经理
     * @return 输出参数
     */
    @Transactional(rollbackFor = BusinessException.class)
    public Long modifyMainTableAddSubTableInformationBusinessFlowPrhj(Long projectIdYawo, String entryNameBicu, String taskTypeBiyu, String homepageTaskStatusPneq, String intendedEnclaveZefc, String remarksOdtx, String responsiblePersonLxyy, java.time.LocalDate dateOpvo, String subtableTaskStatusAshb, String dockingProgressJbxd, String projectManagerYhhh){
        Long outputParametersOwcu = 0L;

        // 时间变量
        java.time.LocalDateTime timeVariableWubl = null;
        // 日期变量
        java.time.LocalDate dateVariableTnvl = null;        
        // 赋值 
        timeVariableWubl = LocalDateTime.now();
        dateVariableTnvl = LocalDate.now();

        // copy variables
        var copyidwpy = projectIdYawo;
        // 数据修改
        UpdateWrapper<WorklistEntity> dataModificationBntrEntityUpdateWrapper = new UpdateWrapper<>();
        dataModificationBntrEntityUpdateWrapper.or(wrapper ->
          wrapper.eq("id", copyidwpy)
          
        );
        WorklistEntity dataModificationBntrworklistEntity = new WorklistEntity();
        dataModificationBntrworklistEntity.setProjectName(entryNameBicu);
        dataModificationBntrworklistEntity.setTaskType(taskTypeBiyu);
        dataModificationBntrworklistEntity.setIntentionFeidi(intendedEnclaveZefc);
        dataModificationBntrworklistEntity.setTaskState(homepageTaskStatusPneq);
        dataModificationBntrworklistEntity.setManager(projectManagerYhhh);
        dataModificationBntrworklistEntity.setRemark(remarksOdtx);
        dataModificationBntrworklistEntity.setUpdateTime(timeVariableWubl);
        var dataModificationBntr = worklistEntityService.getBaseMapper().update(dataModificationBntrworklistEntity, dataModificationBntrEntityUpdateWrapper);

        TaskTrackEntity dataAdditionBmjitaskTrackEntity = new TaskTrackEntity();
        dataAdditionBmjitaskTrackEntity.setDirector(responsiblePersonLxyy);
        dataAdditionBmjitaskTrackEntity.setTaskStatus(subtableTaskStatusAshb);
        dataAdditionBmjitaskTrackEntity.setProgress(dockingProgressJbxd);
        dataAdditionBmjitaskTrackEntity.setCreateTime(timeVariableWubl);
        dataAdditionBmjitaskTrackEntity.setTrackingTime(dateVariableTnvl);
        dataAdditionBmjitaskTrackEntity.setWorkListId(projectIdYawo);
        taskTrackEntityService.getBaseMapper().insert(dataAdditionBmjitaskTrackEntity);
        var dataAdditionBmji = dataAdditionBmjitaskTrackEntity;        
        // 赋值1 
        outputParametersOwcu = dataAdditionBmji.getId();
        
        return outputParametersOwcu;
    }

}
 