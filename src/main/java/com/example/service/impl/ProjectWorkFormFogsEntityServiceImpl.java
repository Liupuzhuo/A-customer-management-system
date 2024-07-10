package com.example.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.common.pagination.PageResult;
import com.example.common.pagination.Pagination;
import com.example.domain.entity.ProjectWorkFormFogsEntity;
import com.example.domain.model.ProjectWorkFormFogsEntityDTO;
import com.example.mapper.ProjectWorkFormFogsEntityMapper;
import com.example.service.ProjectWorkFormFogsEntityService;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.ObjectUtils;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.io.Serializable;

@Service
public class ProjectWorkFormFogsEntityServiceImpl extends ServiceImpl<ProjectWorkFormFogsEntityMapper, ProjectWorkFormFogsEntity> implements ProjectWorkFormFogsEntityService {

    @Override
    public PageResult<ProjectWorkFormFogsEntity> page(Pagination pagination, String orderBy, ProjectWorkFormFogsEntityDTO condition) {
        QueryWrapper<ProjectWorkFormFogsEntity> queryWrapper = Wrappers.query();
        if (ObjectUtils.isNotEmpty(condition.getId())) {
            queryWrapper
                .like("id", condition.getId()
            );
        }
        if (ObjectUtils.isNotEmpty(condition.get项目名称())) {
            queryWrapper
                .like("项目名称", condition.get项目名称()
            );
        }
        if (ObjectUtils.isNotEmpty(condition.get任务类型())) {
            queryWrapper
                .like("任务类型", condition.get任务类型()
            );
        }
        if (ObjectUtils.isNotEmpty(condition.get意向飞地())) {
            queryWrapper
                .like("意向飞地", condition.get意向飞地()
            );
        }
        if (ObjectUtils.isNotEmpty(condition.get任务状态())) {
            queryWrapper
                .like("任务状态", condition.get任务状态()
            );
        }
        if (ObjectUtils.isNotEmpty(condition.get项目经理())) {
            queryWrapper
                .like("项目经理", condition.get项目经理()
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
        Page<ProjectWorkFormFogsEntity> page = this.page(new Page<>(pagination.getPageNum(), pagination.getPageSize()), queryWrapper);
        return PageResult.of(page);
    }

    @Override
    public int updateEntityById(ProjectWorkFormFogsEntity entity) {
        return this.baseMapper.updateById(entity);
    }

    @Override
    public int deleteEntityById(Serializable id) {
        return this.baseMapper.deleteById(id);
    }

}
