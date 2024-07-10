package com.example.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.common.pagination.PageResult;
import com.example.common.pagination.Pagination;
import com.example.domain.entity.OperationLogEntity;
import com.example.domain.model.OperationLogEntityDTO;
import com.example.mapper.OperationLogEntityMapper;
import com.example.service.OperationLogEntityService;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.ObjectUtils;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.io.Serializable;

@Service
public class OperationLogEntityServiceImpl extends ServiceImpl<OperationLogEntityMapper, OperationLogEntity> implements OperationLogEntityService {

    @Override
    public PageResult<OperationLogEntity> page(Pagination pagination, String orderBy, OperationLogEntityDTO condition) {
        QueryWrapper<OperationLogEntity> queryWrapper = Wrappers.query();
        if (ObjectUtils.isNotEmpty(condition.getId())) {
            queryWrapper
                .like("id", condition.getId()
            );
        }
        if (ObjectUtils.isNotEmpty(condition.getUserId())) {
            queryWrapper
                .like("userId", condition.getUserId()
            );
        }
        if (ObjectUtils.isNotEmpty(condition.getUserName())) {
            queryWrapper
                .like("userName", condition.getUserName()
            );
        }
        if (ObjectUtils.isNotEmpty(condition.getOperationType())) {
            queryWrapper
                .like("operationType", condition.getOperationType()
            );
        }
        if (ObjectUtils.isNotEmpty(condition.getIpAddress())) {
            queryWrapper
                .like("ipAddress", condition.getIpAddress()
            );
        }
        if (ObjectUtils.isNotEmpty(condition.getOperationDescription())) {
            queryWrapper
                .like("operationDescription", condition.getOperationDescription()
            );
        }
        if (ObjectUtils.isNotEmpty(condition.getCreatedTime())) {
            queryWrapper
                .like("createdTime", condition.getCreatedTime()
            );
        }
        if (ObjectUtils.isNotEmpty(condition.getParameters())) {
            queryWrapper
                .like("parameters", condition.getParameters()
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
        Page<OperationLogEntity> page = this.page(new Page<>(pagination.getPageNum(), pagination.getPageSize()), queryWrapper);
        return PageResult.of(page);
    }

    @Override
    public int updateEntityById(OperationLogEntity entity) {
        return this.baseMapper.updateById(entity);
    }

    @Override
    public int deleteEntityById(Serializable id) {
        return this.baseMapper.deleteById(id);
    }

}
