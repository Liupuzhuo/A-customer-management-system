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
import com.example.service.bizflow.ThreePartyInquiryProjectInformationServiceDcymBizService;

@Tag(name = "项目名称信息接口")
@RequestMapping("/project")
@RestController
public class ProjectNameInformationInterfaceYokjExposeController {
      
    private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private ThreePartyInquiryProjectInformationServiceDcymBizService threePartyInquiryProjectInformationServiceDcymService;

    
    /**
     * 三方查询项目信息业务流 
     * @param entryNameGneo 项目名称
     * @return
     */
    @GetMapping("/aggQuery/thirdPartyQueryProjectInformationBusinessFlowCewl")
    public ResponseEntity<List<QueryProjectInformationInterfaceOutputScsn>> thirdPartyQueryProjectInformationBusinessFlowWpbs(@RequestParam(required = false) String entryNameGneo) {
        List<QueryProjectInformationInterfaceOutputScsn> thirdPartyProjectInformationNcst = new ArrayList<>();
        var callThirdPartyQueryProjectInformationBusinessFlowFhoz =  threePartyInquiryProjectInformationServiceDcymService.thirdPartyQueryProjectInformationBusinessFlowCewl(entryNameGneo);        
        // 赋值-三方查询项目信息业务流 
        thirdPartyProjectInformationNcst = callThirdPartyQueryProjectInformationBusinessFlowFhoz;

        return ResponseEntity.ok(thirdPartyProjectInformationNcst);
    }
}
 