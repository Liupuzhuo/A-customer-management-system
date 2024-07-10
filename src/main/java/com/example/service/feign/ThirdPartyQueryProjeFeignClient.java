package com.example.service.feign;

import org.springframework.web.bind.annotation.*;
import org.springframework.cloud.openfeign.FeignClient;
import java.util.*;
import com.example.common.config.IgnoreSSLCheckConfiguration;
import com.example.domain.model.*;

@FeignClient(name = "thirdPartyQueryProje", url = "https://www.newwest.cn:9592/", configuration = IgnoreSSLCheckConfiguration.class)
public interface ThirdPartyQueryProjeFeignClient {
      
    
    /**
     * 查询项目信息接口 
     * @param technologyName technologyName
     * @return
     */
    @GetMapping("/achievements-api/gov/achievements/external/select2")
    List<QueryProjectInformationInterfaceOutputScsn> interfaceForQueryingProjectInformationIfqg(@RequestParam(required = false,defaultValue = "大宗工业固废综合利用整体技术解决方") String technologyName);
}
 