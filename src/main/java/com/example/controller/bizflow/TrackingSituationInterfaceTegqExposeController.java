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
import com.example.service.bizflow.TrackingServiceGvfyBizService;

@Tag(name = "跟踪情况接口")
@RequestMapping("/task/track")
@RestController
public class TrackingSituationInterfaceTegqExposeController {
      
    private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private TrackingServiceGvfyBizService trackingServiceGvfyService;

    
    /**
     * 根据项目id查询跟踪情况列表业务流 
     * @param projectIdUfdh 项目id
     * @param currentPageNumberTkwz 当前页码
     * @param pageSizeTgmh 页面大小
     * @return
     */
    @GetMapping("/aggQuery/queryTrackingStatusListBusinessFlowBasedOnProjectIdOowx")
    public ResponseEntity<PageOfdataQueryUuvb> queryTrackingStatusListBusinessFlowBasedOnProjectI(@RequestParam(required = false) Long projectIdUfdh,@RequestParam(required = false) Integer currentPageNumberTkwz,@RequestParam(required = false) Integer pageSizeTgmh) {
        PageOfdataQueryUuvb trackingSituationListFvuc = new PageOfdataQueryUuvb();
        var callToQueryTheTrackingStatusListBusinessFlowBasedOnTheProjectIdIsex =  trackingServiceGvfyService.queryTrackingStatusListBusinessFlowBasedOnProjectIdOowx(projectIdUfdh,currentPageNumberTkwz,pageSizeTgmh);        
        // 赋值-根据项目id查询跟踪情况列表业务流 
        trackingSituationListFvuc = callToQueryTheTrackingStatusListBusinessFlowBasedOnTheProjectIdIsex;

        return ResponseEntity.ok(trackingSituationListFvuc);
    }
}
 