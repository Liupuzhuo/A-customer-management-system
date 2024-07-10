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
import cn.hutool.json.JSONUtil;


/**
 * 查询角色业务
 */
@Service
public class QueryRoleBusinessKbcpBizService {
      
    private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private DataQueryHhisBizServiceMapper dataQueryHhisBizServiceMapper;

    @Autowired
    private DataQueryDtrrBizServiceMapper dataQueryDtrrBizServiceMapper;

    @Autowired
    private DataQueryWktbBizServiceMapper dataQueryWktbBizServiceMapper;

    /**
     * 查询角色信息
     * @return 输出参数
     */
    public List<AnonymousModelDataQueryHhis> queryRoleInformationPqcj(){
        List<AnonymousModelDataQueryHhis> outputParametersClkr = new ArrayList<>();

        // 数据查询
        PageOfdataQueryHhis dataQueryHhis = BizFunctionUtil.createListPage(dataQueryHhisBizServiceMapper.listAnonymousModelDataQueryHhis(), dataQueryHhisBizServiceMapper.countAnonymousModelDataQueryHhis().intValue(), PageOfdataQueryHhis.class);        
        // 赋值 
        outputParametersClkr = dataQueryHhis.getList();
        
        return outputParametersClkr;
    }

    /**
     * 查询用户绑定的角色列表
     * @param userId userId
     * @return 输出参数
     * @param pageNumberWftn 页码
     * @param numberOfPagesDldr 页面条数
     */
    public String queryTheListOfRolesBoundByUsersFyme(Long userId, Integer pageNumberWftn, Integer numberOfPagesDldr){
        String outputParametersJjxx = "";

        // 数据查询
        PageOfdataQueryDtrr dataQueryDtrr = BizFunctionUtil.createListPage(dataQueryDtrrBizServiceMapper.listAnonymousModelDataQueryDtrr(numberOfPagesDldr,pageNumberWftn,userId), dataQueryDtrrBizServiceMapper.countAnonymousModelDataQueryDtrr(numberOfPagesDldr,pageNumberWftn,userId).intValue(), PageOfdataQueryDtrr.class);
        // 序列化
        var serializeXyfh = JSONUtil.toJsonStr(dataQueryDtrr);        
        // 赋值 
        outputParametersJjxx = serializeXyfh;
        
        return outputParametersJjxx;
    }

    /**
     * 查询角色列表信息分页
     * @param currentPageNumberJsli 当前页码
     * @param pageSizeMruf 页码大小
     * @return 输出参数
     */
    public PageOfdataQueryWktb queryRoleListInformationPaginationTmjy(Integer currentPageNumberJsli, Integer pageSizeMruf){
        PageOfdataQueryWktb outputParametersJtgb = new PageOfdataQueryWktb();

        // 数据查询
        PageOfdataQueryWktb dataQueryWktb = BizFunctionUtil.createListPage(dataQueryWktbBizServiceMapper.listAnonymousModelDataQueryWktb(pageSizeMruf,currentPageNumberJsli), dataQueryWktbBizServiceMapper.countAnonymousModelDataQueryWktb(pageSizeMruf,currentPageNumberJsli).intValue(), PageOfdataQueryWktb.class);        
        // 赋值 
        outputParametersJtgb = dataQueryWktb;
        
        return outputParametersJtgb;
    }

}
 