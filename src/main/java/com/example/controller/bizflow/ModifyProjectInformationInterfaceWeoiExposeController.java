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
import com.example.service.bizflow.ModifyingServicesZxhyBizService;

@Tag(name = "修改项目信息接口")
@RequestMapping("/project/update")
@RestController
public class ModifyProjectInformationInterfaceWeoiExposeController {
      
    private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private ModifyingServicesZxhyBizService modifyingServicesZxhyService;

    
    /**
     * 修改项目信息业务流 
     * @param modifyProjectInformationForReferenceNmef 修改项目信息入参
     * @return
     */
    @PostMapping("/aggQuery/modifyProjectInformationBusinessFlowOslt")
    public ResponseEntity<Long> modifyProjectInformationBusinessFlowVkdb(@RequestBody ModifyProjectInformationObjectOrou modifyProjectInformationForReferenceNmef) {
        Long projectIdNwic = 0L;
        var callAndModifyProjectInformationBusinessFlowLtof =  modifyingServicesZxhyService.modifyProjectInformationBusinessFlowOslt(modifyProjectInformationForReferenceNmef);        
        // 赋值-修改项目信息业务流 
        projectIdNwic = callAndModifyProjectInformationBusinessFlowLtof;

        return ResponseEntity.ok(projectIdNwic);
    }
}
 