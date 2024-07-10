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
 * 枚举查询服务
 */
@Service
public class EnumeratingQueryServicesKtaoBizService {
      
    private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private EnumerationListQuerySjzoBizServiceMapper enumerationListQuerySjzoBizServiceMapper;

    /**
     * 枚举查询业务流
     * @param enumerationTypeZzuk 枚举类型
     * @return 枚举列表
     */
    public PageOfdataQueryKblp enumeratingQueryBusinessFlowsRpkz(Integer enumerationTypeZzuk){
        PageOfdataQueryKblp enumerationListYtem = new PageOfdataQueryKblp();

        // 枚举列表查询
        PageOfdataQueryKblp enumerationListQuerySjzo = BizFunctionUtil.createListPage(enumerationListQuerySjzoBizServiceMapper.listAnonymousModelDataQueryKblp(enumerationTypeZzuk), enumerationListQuerySjzoBizServiceMapper.countAnonymousModelDataQueryKblp(enumerationTypeZzuk).intValue(), PageOfdataQueryKblp.class);        
        // 赋值 
        enumerationListYtem = enumerationListQuerySjzo;
        
        return enumerationListYtem;
    }

}
 