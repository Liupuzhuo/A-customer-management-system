package com.example.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.common.pagination.PageResult;
import com.example.common.pagination.Pagination;
import com.example.domain.entity.TaskTrackEntity;
import com.example.domain.model.TaskTrackEntityDTO;
import com.example.mapper.TaskTrackEntityMapper;
import com.example.service.TaskTrackEntityService;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.ObjectUtils;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.io.Serializable;

@Service
public class TaskTrackEntityServiceImpl extends ServiceImpl<TaskTrackEntityMapper, TaskTrackEntity> implements TaskTrackEntityService {

    @Override
    public PageResult<TaskTrackEntity> page(Pagination pagination, String orderBy, TaskTrackEntityDTO condition) {
        QueryWrapper<TaskTrackEntity> queryWrapper = Wrappers.query();
        if (ObjectUtils.isNotEmpty(condition.getId())) {
            queryWrapper
                .like("id", condition.getId()
            );
        }
        if (ObjectUtils.isNotEmpty(condition.getDirector())) {
            queryWrapper
                .like("director", condition.getDirector()
            );
        }
        if (ObjectUtils.isNotEmpty(condition.getTaskStatus())) {
            queryWrapper
                .like("task_status", condition.getTaskStatus()
            );
        }
        if (ObjectUtils.isNotEmpty(condition.getProgress())) {
            queryWrapper
                .like("progress", condition.getProgress()
            );
        }
        if (ObjectUtils.isNotEmpty(condition.getCreateTime())) {
            queryWrapper
                .like("create_time", condition.getCreateTime()
            );
        }
        if (ObjectUtils.isNotEmpty(condition.getTrackingTime())) {
            queryWrapper
                .like("tracking_time", condition.getTrackingTime()
            );
        }
        if (ObjectUtils.isNotEmpty(condition.getWorkListId())) {
            queryWrapper
                .like("work_list_id", condition.getWorkListId()
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
        Page<TaskTrackEntity> page = this.page(new Page<>(pagination.getPageNum(), pagination.getPageSize()), queryWrapper);
        return PageResult.of(page);
    }

    @Override
    public int updateEntityById(TaskTrackEntity entity) {
        return this.baseMapper.updateById(entity);
    }

    @Override
    public int deleteEntityById(Serializable id) {
        return this.baseMapper.deleteById(id);
    }

}
