package com.example.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.common.pagination.PageResult;
import com.example.common.pagination.Pagination;
import com.example.domain.entity.UserRoleEntity;
import com.example.domain.model.UserRoleEntityDTO;
import com.example.mapper.UserRoleEntityMapper;
import com.example.service.UserRoleEntityService;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.ObjectUtils;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.io.Serializable;

@Service
public class UserRoleEntityServiceImpl extends ServiceImpl<UserRoleEntityMapper, UserRoleEntity> implements UserRoleEntityService {

    @Override
    public PageResult<UserRoleEntity> page(Pagination pagination, String orderBy, UserRoleEntityDTO condition) {
        QueryWrapper<UserRoleEntity> queryWrapper = Wrappers.query();
        if (ObjectUtils.isNotEmpty(condition.getId())) {
            queryWrapper
                .like("id", condition.getId()
            );
        }
        if (ObjectUtils.isNotEmpty(condition.getRoleName())) {
            queryWrapper
                .like("roleName", condition.getRoleName()
            );
        }
        if (ObjectUtils.isNotEmpty(condition.getPermissionCharacters())) {
            queryWrapper
                .like("permissionCharacters", condition.getPermissionCharacters()
            );
        }
        if (ObjectUtils.isNotEmpty(condition.getRolestate())) {
            queryWrapper
                .like("rolestate", condition.getRolestate()
            );
        }
        if (ObjectUtils.isNotEmpty(condition.getCreatedTime())) {
            queryWrapper
                .like("createdTime", condition.getCreatedTime()
            );
        }
        if (ObjectUtils.isNotEmpty(condition.getUpdatedTime())) {
            queryWrapper
                .like("updatedTime", condition.getUpdatedTime()
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
        Page<UserRoleEntity> page = this.page(new Page<>(pagination.getPageNum(), pagination.getPageSize()), queryWrapper);
        return PageResult.of(page);
    }

    @Override
    public int updateEntityById(UserRoleEntity entity) {
        return this.baseMapper.updateById(entity);
    }

    @Override
    public int deleteEntityById(Serializable id) {
        return this.baseMapper.deleteById(id);
    }

}
