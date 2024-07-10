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
import com.example.service.bizflow.AddBusinessFlowBsfmBizService;

@Tag(name = "添加接口")
@RequestMapping("/app/adddata")
@RestController
public class AddInterfaceCsihExposeController {
      
    private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private AddBusinessFlowBsfmBizService addBusinessFlowBsfmService;

    
    /**
     * 添加业务 
     * @param trackingListInformationYxzd 追踪列表信息
     * @return
     */
    @PostMapping("/addBusinessAmws")
    public ResponseEntity<Long> addBusinessMaqf(@RequestBody DataModelFhru trackingListInformationYxzd) {
        Long responseKavg = 0L;
        var callToAddBusinessPdnx =  addBusinessFlowBsfmService.addBusinessAmws(trackingListInformationYxzd);        
        // 赋值-添加业务 
        responseKavg = callToAddBusinessPdnx;

        return ResponseEntity.ok(responseKavg);
    }
}
 