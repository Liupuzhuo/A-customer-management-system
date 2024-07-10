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
import com.example.service.bizflow.EnumeratingQueryServicesKtaoBizService;

@Tag(name = "查询枚举接口")
@RequestMapping("/enum")
@RestController
public class QueryEnumerationInterfaceGdhqExposeController {
      
    private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private EnumeratingQueryServicesKtaoBizService enumeratingQueryServicesKtaoService;

    
    /**
     * 查询枚举接口方法 
     * @param enumerationTypeWhtn 枚举类型
     * @return
     */
    @GetMapping("/exposeInterfaceMethodsPles/")
    public ResponseEntity<PageOfdataQueryKblp> queryEnumerationInterfaceMethodZrcb(@RequestParam() Integer enumerationTypeWhtn) {
        PageOfdataQueryKblp enumeratingListResultsIkke = new PageOfdataQueryKblp();
        var enumeratingQueryBusinessFlowsQqrn =  enumeratingQueryServicesKtaoService.enumeratingQueryBusinessFlowsRpkz(enumerationTypeWhtn);        
        // 赋值 
        enumeratingListResultsIkke = enumeratingQueryBusinessFlowsQqrn;

        return ResponseEntity.ok(enumeratingListResultsIkke);
    }
}
 