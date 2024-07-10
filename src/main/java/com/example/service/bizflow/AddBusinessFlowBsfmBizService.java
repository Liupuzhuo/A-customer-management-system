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


/**
 * 添加业务流
 */
@Service
public class AddBusinessFlowBsfmBizService {
      
    private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private WorklistEntityService worklistEntityService;

    @Autowired
    private TaskTrackEntityService taskTrackEntityService;

    /**
     * 添加业务
     * @return respones
     * @param trackingListInformationYxzd 追踪列表信息
     */
    @Transactional(rollbackFor = BusinessException.class)
    public Long addBusinessAmws(DataModelFhru trackingListInformationYxzd){
        Long responseKavg = 0L;

        // 时间变量
        java.time.LocalDateTime timeVariableDktp = null;        
        // 赋值 
        timeVariableDktp = LocalDateTime.now();

        WorklistEntity dataAdditionMainTableOkksworklistEntity = new WorklistEntity();
        dataAdditionMainTableOkksworklistEntity.setProjectName(trackingListInformationYxzd.getProjectInformationObjectKezb().getEntryNameHvxp());
        dataAdditionMainTableOkksworklistEntity.setTaskType(trackingListInformationYxzd.getProjectInformationObjectKezb().getTaskTypeMxbe());
        dataAdditionMainTableOkksworklistEntity.setIntentionFeidi(trackingListInformationYxzd.getProjectInformationObjectKezb().getIntendedEnclaveWehe());
        dataAdditionMainTableOkksworklistEntity.setTaskState(trackingListInformationYxzd.getProjectInformationObjectKezb().getTaskStatusDamg());
        dataAdditionMainTableOkksworklistEntity.setManager(trackingListInformationYxzd.getProjectInformationObjectKezb().getProjectManagerBpht());
        dataAdditionMainTableOkksworklistEntity.setRemark(trackingListInformationYxzd.getProjectInformationObjectKezb().getRemarksMoea());
        dataAdditionMainTableOkksworklistEntity.setCreateTime(timeVariableDktp);
        dataAdditionMainTableOkksworklistEntity.setUpdateTime(timeVariableDktp);
        worklistEntityService.getBaseMapper().insert(dataAdditionMainTableOkksworklistEntity);
        var dataAdditionMainTableOkks = dataAdditionMainTableOkksworklistEntity;
        // forEach循环
        for(DataModelJgnx item: trackingListInformationYxzd.getTrackingSituationUaqq()) {
        TaskTrackEntity dataAdditionSjibtaskTrackEntity = new TaskTrackEntity();
        dataAdditionSjibtaskTrackEntity.setDirector(item.getResponsiblePersonVvjw());
        dataAdditionSjibtaskTrackEntity.setTaskStatus(item.getTaskStatusIdji());
        dataAdditionSjibtaskTrackEntity.setProgress(item.getDockingProgressUelu());
        dataAdditionSjibtaskTrackEntity.setCreateTime(timeVariableDktp);
        dataAdditionSjibtaskTrackEntity.setTrackingTime(item.getTrackingTimeFdhe());
        dataAdditionSjibtaskTrackEntity.setWorkListId(dataAdditionMainTableOkks.getId());
        dataAdditionSjibtaskTrackEntity.setUpdateTime(timeVariableDktp);
        taskTrackEntityService.getBaseMapper().insert(dataAdditionSjibtaskTrackEntity);
        var dataAdditionSjib = dataAdditionSjibtaskTrackEntity;
        };        
        // 赋值1 
        responseKavg = dataAdditionMainTableOkks.getId();
        
        return responseKavg;
    }

}
 