package com.example.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.common.pagination.PageResult;
import com.example.common.pagination.Pagination;
import com.example.domain.entity.PurviewRelevancyEntity;
import com.example.domain.model.PurviewRelevancyEntityDTO;
import com.example.mapper.PurviewRelevancyEntityMapper;
import com.example.service.PurviewRelevancyEntityService;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.ObjectUtils;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.io.Serializable;

@Service
public class PurviewRelevancyEntityServiceImpl extends ServiceImpl<PurviewRelevancyEntityMapper, PurviewRelevancyEntity> implements PurviewRelevancyEntityService {

    @Override
    public PageResult<PurviewRelevancyEntity> page(Pagination pagination, String orderBy, PurviewRelevancyEntityDTO condition) {
        QueryWrapper<PurviewRelevancyEntity> queryWrapper = Wrappers.query();
        if (ObjectUtils.isNotEmpty(condition.getId())) {
            queryWrapper
                .like("id", condition.getId()
            );
        }
        if (ObjectUtils.isNotEmpty(condition.getRoleId())) {
            queryWrapper
                .like("role_id", condition.getRoleId()
            );
        }
        if (ObjectUtils.isNotEmpty(condition.getPurviewId())) {
            queryWrapper
                .like("purview_id", condition.getPurviewId()
            );
        }
        if (ObjectUtils.isNotEmpty(condition.getPurviewCodeArr())) {
            queryWrapper
                .like("purview_code_arr", condition.getPurviewCodeArr()
            );
        }
        if(StringUtils.isNotEmpty(orderBy)) {
            List<String> ands = Arrays.asList(orderBy.split("and"));
            ands.forEach(oneOrderBy -> {
                String[] orderByArr = oneOrderBy.split(" ");
                String orderByField = orderByArr[0];  // 排序字段
                String orderByDirection = orderByArr[1];  // 排序方式
                if ("desc".equalsIgnoreCase(orderByDirection)) {
                    queryWrapper.orderByDesc(orderByField);
                } else {
                    queryWrapper.orderByAsc(orderByField);
                }
            });
        }
        Page<PurviewRelevancyEntity> page = this.page(new Page<>(pagination.getPageNum(), pagination.getPageSize()), queryWrapper);
        return PageResult.of(page);
    }

    @Override
    public int updateEntityById(PurviewRelevancyEntity entity) {
        return this.baseMapper.updateById(entity);
    }

    @Override
    public int deleteEntityById(Serializable id) {
        return this.baseMapper.deleteById(id);
    }

}
