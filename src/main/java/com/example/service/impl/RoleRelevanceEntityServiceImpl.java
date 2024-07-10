package com.example.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.common.pagination.PageResult;
import com.example.common.pagination.Pagination;
import com.example.domain.entity.RoleRelevanceEntity;
import com.example.domain.model.RoleRelevanceEntityDTO;
import com.example.mapper.RoleRelevanceEntityMapper;
import com.example.service.RoleRelevanceEntityService;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.ObjectUtils;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.io.Serializable;

@Service
public class RoleRelevanceEntityServiceImpl extends ServiceImpl<RoleRelevanceEntityMapper, RoleRelevanceEntity> implements RoleRelevanceEntityService {

    @Override
    public PageResult<RoleRelevanceEntity> page(Pagination pagination, String orderBy, RoleRelevanceEntityDTO condition) {
        QueryWrapper<RoleRelevanceEntity> queryWrapper = Wrappers.query();
        if (ObjectUtils.isNotEmpty(condition.getId())) {
            queryWrapper
                .like("id", condition.getId()
            );
        }
        if (ObjectUtils.isNotEmpty(condition.getUserId())) {
            queryWrapper
                .like("user_id", condition.getUserId()
            );
        }
        if (ObjectUtils.isNotEmpty(condition.getRoleId())) {
            queryWrapper
                .like("role_id", condition.getRoleId()
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
        Page<RoleRelevanceEntity> page = this.page(new Page<>(pagination.getPageNum(), pagination.getPageSize()), queryWrapper);
        return PageResult.of(page);
    }

    @Override
    public int updateEntityById(RoleRelevanceEntity entity) {
        return this.baseMapper.updateById(entity);
    }

    @Override
    public int deleteEntityById(Serializable id) {
        return this.baseMapper.deleteById(id);
    }

}
