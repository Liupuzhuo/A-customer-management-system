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
import com.example.service.feign.ThirdPartyQueryProjeFeignClient;

/**
 * 三方查询项目信息服务
 */
@Service
public class ThreePartyInquiryProjectInformationServiceDcymBizService {
      
    private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private ThirdPartyQueryProjeFeignClient thirdPartyQueryProjeFeignClient;

    /**
     * 三方查询项目信息业务流
     * @param entryNameGneo 项目名称
     * @return 三方项目信息
     */
    public List<QueryProjectInformationInterfaceOutputScsn> thirdPartyQueryProjectInformationBusinessFlowCewl(String entryNameGneo){
        List<QueryProjectInformationInterfaceOutputScsn> thirdPartyProjectInformationNcst = new ArrayList<>();

        var callInterfaceTsmu =  thirdPartyQueryProjeFeignClient.interfaceForQueryingProjectInformationIfqg(entryNameGneo);        
        // 赋值 
        thirdPartyProjectInformationNcst = callInterfaceTsmu;
        
        return thirdPartyProjectInformationNcst;
    }

}
 