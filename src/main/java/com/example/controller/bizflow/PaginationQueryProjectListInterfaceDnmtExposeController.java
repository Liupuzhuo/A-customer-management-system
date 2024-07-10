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
import com.example.service.bizflow.ProjectListQueryServiceFrdxBizService;

@Tag(name = "分页查询项目列表接口")
@RequestMapping("/project")
@RestController
public class PaginationQueryProjectListInterfaceDnmtExposeController {
      
    private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private ProjectListQueryServiceFrdxBizService projectListQueryServiceFrdxService;

    
    /**
     * 分页查询项目列表方法 
     * @param entryNameKalj 项目名称
     * @param projectManagerQvhl 项目经理
     * @param taskTypeCvan 任务类型
     * @param taskStatusGsnz 任务状态
     * @param intendedEnclaveRxtx 意向飞地
     * @param numberOfEntriesPerPageXaag 每页条数
     * @param currentPageNumberXzik 当前页码
     * @return
     */
    @PostMapping("/exposeInterfaceMethodsFugj")
    public ResponseEntity<PageOfdataQueryPzvq> pageWiseQueryProjectListMethodCesh(@RequestParam(required = false) String entryNameKalj,@RequestParam(required = false) String projectManagerQvhl,@RequestParam(required = false) String taskTypeCvan,@RequestParam(required = false) String taskStatusGsnz,@RequestParam(required = false) String intendedEnclaveRxtx,@RequestParam(required = false) Integer numberOfEntriesPerPageXaag,@RequestParam(required = false) Integer currentPageNumberXzik) {
        PageOfdataQueryPzvq projectListQueryResultsIqjv = new PageOfdataQueryPzvq();
        var callToQueryProjectListBusinessFlowIhzm =  projectListQueryServiceFrdxService.queryProjectListBusinessFlowVvza(entryNameKalj,projectManagerQvhl,taskTypeCvan,taskStatusGsnz,intendedEnclaveRxtx,currentPageNumberXzik,numberOfEntriesPerPageXaag);        
        // 赋值 
        projectListQueryResultsIqjv = callToQueryProjectListBusinessFlowIhzm;

        return ResponseEntity.ok(projectListQueryResultsIqjv);
    }
}
 