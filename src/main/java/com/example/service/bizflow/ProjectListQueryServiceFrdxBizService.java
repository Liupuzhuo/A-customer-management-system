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
 * 项目列表查询服务
 */
@Service
public class ProjectListQueryServiceFrdxBizService {
      
    private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private ProjectListQuerySqlSrpvBizServiceMapper projectListQuerySqlSrpvBizServiceMapper;

    @Autowired
    private DataQueryUxntBizServiceMapper dataQueryUxntBizServiceMapper;

    /**
     * 查询项目列表业务流
     * @param entryNameTkrg 项目名称
     * @param projectManagerKvxe 项目经理
     * @param taskTypeAfjc 任务类型
     * @param taskStatusAlfw 任务状态
     * @param intendedEnclaveFdep 意向飞地
     * @return 项目列表业务流返回结果
     * @param currentPageNumberLoib 当前页码
     * @param numberOfEntriesPerPageAlgr 每页条数
     */
    public PageOfdataQueryPzvq queryProjectListBusinessFlowVvza(String entryNameTkrg, String projectManagerKvxe, String taskTypeAfjc, String taskStatusAlfw, String intendedEnclaveFdep, Integer currentPageNumberLoib, Integer numberOfEntriesPerPageAlgr){
        PageOfdataQueryPzvq projectListBusinessFlowReturnResultRkzo = new PageOfdataQueryPzvq();

        // 项目列表查询sql
        PageOfdataQueryPzvq projectListQuerySqlSrpv = BizFunctionUtil.createListPage(projectListQuerySqlSrpvBizServiceMapper.listAnonymousModelDataQueryPzvq(numberOfEntriesPerPageAlgr,currentPageNumberLoib,entryNameTkrg,taskTypeAfjc,intendedEnclaveFdep,taskStatusAlfw,projectManagerKvxe), projectListQuerySqlSrpvBizServiceMapper.countAnonymousModelDataQueryPzvq(numberOfEntriesPerPageAlgr,currentPageNumberLoib,entryNameTkrg,taskTypeAfjc,intendedEnclaveFdep,taskStatusAlfw,projectManagerKvxe).intValue(), PageOfdataQueryPzvq.class);        
        // 赋值 
        projectListBusinessFlowReturnResultRkzo = projectListQuerySqlSrpv;
        
        return projectListBusinessFlowReturnResultRkzo;
    }

    /**
     * 查询项目列表新业务流程
     * @param currentPageNumberZtvu 当前页码
     * @param numberOfEntriesPerPageOjdf 每页条数
     * @param entryNameWswu 项目名称
     * @param projectManagerIchh 项目经理
     * @param taskTypeBsah 任务类型
     * @param taskStatusMihn 任务状态
     * @param intendedEnclaveGcxu 意向飞地
     */
    public void queryProjectListNewBusinessProcessRqpb(String currentPageNumberZtvu, String numberOfEntriesPerPageOjdf, String entryNameWswu, String projectManagerIchh, String taskTypeBsah, String taskStatusMihn, String intendedEnclaveGcxu){

        // 数据查询
        PageOfdataQueryUxnt dataQueryUxnt = BizFunctionUtil.createListPage(dataQueryUxntBizServiceMapper.listAnonymousModelDataQueryUxnt(), dataQueryUxntBizServiceMapper.countAnonymousModelDataQueryUxnt().intValue(), PageOfdataQueryUxnt.class);
    }

}
 