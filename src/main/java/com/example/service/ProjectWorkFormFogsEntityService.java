package com.example.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.common.pagination.PageResult;
import com.example.common.pagination.Pagination;
import com.example.domain.entity.ProjectWorkFormFogsEntity;
import com.example.domain.model.ProjectWorkFormFogsEntityDTO;

import java.io.Serializable;

public interface ProjectWorkFormFogsEntityService extends IService<ProjectWorkFormFogsEntity> {

    /**
     * 分页条件查询ProjectWorkFormFogsEntity
     * @param pagination 分页
     * @param orderBy 排序
     * @param condition 条件
     * @return 分页列表
     */
    PageResult<ProjectWorkFormFogsEntity> page(Pagination pagination, String orderBy, ProjectWorkFormFogsEntityDTO condition);

    /**
     * 根据主键更新实体
     * @param ProjectWorkFormFogsEntity
     * @return
     */
    int updateEntityById(ProjectWorkFormFogsEntity entity);

    /**
     * 根据主键删除实体
     * @param id
     * @return
     */
    int deleteEntityById(Serializable id);

}
