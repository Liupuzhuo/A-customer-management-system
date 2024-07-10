package com.example.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.common.pagination.PageResult;
import com.example.common.pagination.Pagination;
import com.example.domain.entity.WorklistEntity;
import com.example.domain.model.WorklistEntityDTO;
import com.example.mapper.WorklistEntityMapper;
import com.example.service.WorklistEntityService;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.ObjectUtils;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.io.Serializable;

@Service
public class WorklistEntityServiceImpl extends ServiceImpl<WorklistEntityMapper, WorklistEntity> implements WorklistEntityService {

    @Override
    public PageResult<WorklistEntity> page(Pagination pagination, String orderBy, WorklistEntityDTO condition) {
        QueryWrapper<WorklistEntity> queryWrapper = Wrappers.query();
        if (ObjectUtils.isNotEmpty(condition.getId())) {
            queryWrapper
                .like("id", condition.getId()
            );
        }
        if (ObjectUtils.isNotEmpty(condition.getProjectName())) {
            queryWrapper
                .like("project_name", condition.getProjectName()
            );
        }
        if (ObjectUtils.isNotEmpty(condition.getTaskType())) {
            queryWrapper
                .like("task_type", condition.getTaskType()
            );
        }
        if (ObjectUtils.isNotEmpty(condition.getIntentionFeidi())) {
            queryWrapper
                .like("intention_feidi", condition.getIntentionFeidi()
            );
        }
        if (ObjectUtils.isNotEmpty(condition.getTaskState())) {
            queryWrapper
                .like("task_state", condition.getTaskState()
            );
        }
        if (ObjectUtils.isNotEmpty(condition.getManager())) {
            queryWrapper
                .like("manager", condition.getManager()
            );
        }
        if (ObjectUtils.isNotEmpty(condition.getRemark())) {
            queryWrapper
                .like("remark", condition.getRemark()
            );
        }
        if (ObjectUtils.isNotEmpty(condition.getCreateTime())) {
            queryWrapper
                .like("create_time", condition.getCreateTime()
            );
        }
        if (ObjectUtils.isNotEmpty(condition.getUpdateTime())) {
            queryWrapper
                .like("update_time", condition.getUpdateTime()
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
        Page<WorklistEntity> page = this.page(new Page<>(pagination.getPageNum(), pagination.getPageSize()), queryWrapper);
        return PageResult.of(page);
    }

    @Override
    public int updateEntityById(WorklistEntity entity) {
        return this.baseMapper.updateById(entity);
    }

    @Override
    public int deleteEntityById(Serializable id) {
        return this.baseMapper.deleteById(id);
    }

}
