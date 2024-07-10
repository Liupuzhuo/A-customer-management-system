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

/**
 * 日志管理
 */
@Service
public class LogManagementGhwuBizService {
      
    private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private OperationLogEntityService operationLogEntityService;

    /**
     * 新增日志记录
     */
    public void addANewLogRecordErhv(){

        OperationLogEntity dataAdditionYsmcoperationLogEntity = new OperationLogEntity();
        dataAdditionYsmcoperationLogEntity.setParameters("ceshi请求的参数");
        dataAdditionYsmcoperationLogEntity.setUserName("admin");
        operationLogEntityService.getBaseMapper().insert(dataAdditionYsmcoperationLogEntity);
        var dataAdditionYsmc = dataAdditionYsmcoperationLogEntity;
    }

}
 