package com.example.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.common.pagination.PageResult;
import com.example.common.pagination.Pagination;
import com.example.domain.entity.UserinfoEntity;
import com.example.domain.model.UserinfoEntityDTO;
import com.example.mapper.UserinfoEntityMapper;
import com.example.service.UserinfoEntityService;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.ObjectUtils;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.io.Serializable;

@Service
public class UserinfoEntityServiceImpl extends ServiceImpl<UserinfoEntityMapper, UserinfoEntity> implements UserinfoEntityService {

    @Override
    public PageResult<UserinfoEntity> page(Pagination pagination, String orderBy, UserinfoEntityDTO condition) {
        QueryWrapper<UserinfoEntity> queryWrapper = Wrappers.query();
        if (ObjectUtils.isNotEmpty(condition.getId())) {
            queryWrapper
                .like("id", condition.getId()
            );
        }
        if (ObjectUtils.isNotEmpty(condition.getUserName())) {
            queryWrapper
                .like("userName", condition.getUserName()
            );
        }
        if (ObjectUtils.isNotEmpty(condition.getNickname())) {
            queryWrapper
                .like("nickname", condition.getNickname()
            );
        }
        if (ObjectUtils.isNotEmpty(condition.getBelongingDepartment())) {
            queryWrapper
                .like("belongingDepartment", condition.getBelongingDepartment()
            );
        }
        if (ObjectUtils.isNotEmpty(condition.getPhoneNumber())) {
            queryWrapper
                .like("phoneNumber", condition.getPhoneNumber()
            );
        }
        if (ObjectUtils.isNotEmpty(condition.getStateBfuw())) {
            queryWrapper
                .like("stateBfuw", condition.getStateBfuw()
            );
        }
        if (ObjectUtils.isNotEmpty(condition.getPassword())) {
            queryWrapper
                .like("password", condition.getPassword()
            );
        }
        if (ObjectUtils.isNotEmpty(condition.getRemarksDqdd())) {
            queryWrapper
                .like("remarksDqdd", condition.getRemarksDqdd()
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
        Page<UserinfoEntity> page = this.page(new Page<>(pagination.getPageNum(), pagination.getPageSize()), queryWrapper);
        return PageResult.of(page);
    }

    @Override
    public int updateEntityById(UserinfoEntity entity) {
        return this.baseMapper.updateById(entity);
    }

    @Override
    public int deleteEntityById(Serializable id) {
        return this.baseMapper.deleteById(id);
    }

}
