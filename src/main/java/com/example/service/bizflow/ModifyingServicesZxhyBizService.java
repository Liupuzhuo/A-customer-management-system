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

import java.time.LocalDateTime;
import org.apache.commons.lang3.ObjectUtils;


/**
 * 修改服务
 */
@Service
public class ModifyingServicesZxhyBizService {
      
    private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private WorklistEntityService worklistEntityService;

    @Autowired
    private TaskTrackEntityService taskTrackEntityService;

    /**
     * 修改项目信息业务流
     * @param modifyProjectInformationForReferenceNmef 修改项目信息入参
     * @return 项目id
     */
    @Transactional(rollbackFor = BusinessException.class)
    public Long modifyProjectInformationBusinessFlowOslt(ModifyProjectInformationObjectOrou modifyProjectInformationForReferenceNmef){
        Long projectIdNwic = 0L;

        // 时间变量
        java.time.LocalDateTime timeVariableNoui = null;        
        // 赋值 
        timeVariableNoui = LocalDateTime.now();

        // copy variables
        var copyid2rl = modifyProjectInformationForReferenceNmef.getProjectInformationObjectOskg().getProjectIdFylv();
        // 数据修改
        UpdateWrapper<WorklistEntity> dataModificationCvsjEntityUpdateWrapper = new UpdateWrapper<>();
        dataModificationCvsjEntityUpdateWrapper.or(wrapper ->
          wrapper.eq("id", copyid2rl)
          
        );
        WorklistEntity dataModificationCvsjworklistEntity = new WorklistEntity();
        dataModificationCvsjworklistEntity.setProjectName(modifyProjectInformationForReferenceNmef.getProjectInformationObjectOskg().getEntryNameVxwl());
        dataModificationCvsjworklistEntity.setTaskType(modifyProjectInformationForReferenceNmef.getProjectInformationObjectOskg().getTaskTypeSehy());
        dataModificationCvsjworklistEntity.setIntentionFeidi(modifyProjectInformationForReferenceNmef.getProjectInformationObjectOskg().getIntendedEnclaveWmwt());
        dataModificationCvsjworklistEntity.setTaskState(modifyProjectInformationForReferenceNmef.getProjectInformationObjectOskg().getTaskStatusUbjn());
        dataModificationCvsjworklistEntity.setManager(modifyProjectInformationForReferenceNmef.getProjectInformationObjectOskg().getProjectManagerZoza());
        dataModificationCvsjworklistEntity.setRemark(modifyProjectInformationForReferenceNmef.getProjectInformationObjectOskg().getRemarksWyyb());
        dataModificationCvsjworklistEntity.setUpdateTime(timeVariableNoui);
        var dataModificationCvsj = worklistEntityService.getBaseMapper().update(dataModificationCvsjworklistEntity, dataModificationCvsjEntityUpdateWrapper);

        // 判断
        if ((ObjectUtils.notEqual(modifyProjectInformationForReferenceNmef.getProjectInformationObjectOskg().getTaskTypeSehy(), "enclave"))  ){
        // 条件

        // copy variables
        var copyidc6v = modifyProjectInformationForReferenceNmef.getProjectInformationObjectOskg().getProjectIdFylv();
        // 数据修改
        UpdateWrapper<WorklistEntity> dataModificationQgmdEntityUpdateWrapper = new UpdateWrapper<>();
        dataModificationQgmdEntityUpdateWrapper.or(wrapper ->
          wrapper.eq("id", copyidc6v)
          
        );
        WorklistEntity dataModificationQgmdworklistEntity = new WorklistEntity();
        dataModificationQgmdworklistEntity.setIntentionFeidi("");
        var dataModificationQgmd = worklistEntityService.getBaseMapper().update(dataModificationQgmdworklistEntity, dataModificationQgmdEntityUpdateWrapper);

        }else {
        // 条件判断else

        }
        // forEach循环
        for(TrackingInformationSyzz item: modifyProjectInformationForReferenceNmef.getTrackingInformationListRysn()) {
        // 判断
        if ((ObjectUtils.notEqual(item.getTrackingSituationIdRsxs(), null))   && (ObjectUtils.notEqual(item.getTrackingSituationIdRsxs(), null))  ){
        // 条件

        // copy variables
        var copyido2t = item.getTrackingSituationIdRsxs();
        // 数据修改
        UpdateWrapper<TaskTrackEntity> dataModificationWotpEntityUpdateWrapper = new UpdateWrapper<>();
        dataModificationWotpEntityUpdateWrapper.or(wrapper ->
          wrapper.eq("id", copyido2t)
          
        );
        TaskTrackEntity dataModificationWotptaskTrackEntity = new TaskTrackEntity();
        dataModificationWotptaskTrackEntity.setDirector(item.getResponsiblePersonBixf());
        dataModificationWotptaskTrackEntity.setTaskStatus(item.getTaskStatusVdal());
        dataModificationWotptaskTrackEntity.setProgress(item.getDockingProgressQtuz());
        dataModificationWotptaskTrackEntity.setTrackingTime(item.getTrackingTimeBabb());
        dataModificationWotptaskTrackEntity.setUpdateTime(timeVariableNoui);
        dataModificationWotptaskTrackEntity.setWorkListId(item.getProjectIdFaxb());
        var dataModificationWotp = taskTrackEntityService.getBaseMapper().update(dataModificationWotptaskTrackEntity, dataModificationWotpEntityUpdateWrapper);

        }else {
        // 条件判断else

        TaskTrackEntity dataAdditionNmfdtaskTrackEntity = new TaskTrackEntity();
        dataAdditionNmfdtaskTrackEntity.setDirector(item.getResponsiblePersonBixf());
        dataAdditionNmfdtaskTrackEntity.setTaskStatus(item.getTaskStatusVdal());
        dataAdditionNmfdtaskTrackEntity.setProgress(item.getDockingProgressQtuz());
        dataAdditionNmfdtaskTrackEntity.setCreateTime(timeVariableNoui);
        dataAdditionNmfdtaskTrackEntity.setTrackingTime(item.getTrackingTimeBabb());
        dataAdditionNmfdtaskTrackEntity.setWorkListId(modifyProjectInformationForReferenceNmef.getProjectInformationObjectOskg().getProjectIdFylv());
        dataAdditionNmfdtaskTrackEntity.setUpdateTime(timeVariableNoui);
        taskTrackEntityService.getBaseMapper().insert(dataAdditionNmfdtaskTrackEntity);
        var dataAdditionNmfd = dataAdditionNmfdtaskTrackEntity;
        }
        };        
        // 赋值1 
        projectIdNwic = modifyProjectInformationForReferenceNmef.getProjectInformationObjectOskg().getProjectIdFylv();
        
        return projectIdNwic;
    }

}
 