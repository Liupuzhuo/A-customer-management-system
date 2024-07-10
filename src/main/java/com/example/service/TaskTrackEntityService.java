package com.example.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.common.pagination.PageResult;
import com.example.common.pagination.Pagination;
import com.example.domain.entity.TaskTrackEntity;
import com.example.domain.model.TaskTrackEntityDTO;

import java.io.Serializable;

public interface TaskTrackEntityService extends IService<TaskTrackEntity> {

    /**
     * 分页条件查询TaskTrackEntity
     * @param pagination 分页
     * @param orderBy 排序
     * @param condition 条件
     * @return 分页列表
     */
    PageResult<TaskTrackEntity> page(Pagination pagination, String orderBy, TaskTrackEntityDTO condition);

    /**
     * 根据主键更新实体
     * @param TaskTrackEntity
     * @return
     */
    int updateEntityById(TaskTrackEntity entity);

    /**
     * 根据主键删除实体
     * @param id
     * @return
     */
    int deleteEntityById(Serializable id);

}
