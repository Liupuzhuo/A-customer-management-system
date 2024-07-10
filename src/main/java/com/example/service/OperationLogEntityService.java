package com.example.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.common.pagination.PageResult;
import com.example.common.pagination.Pagination;
import com.example.domain.entity.OperationLogEntity;
import com.example.domain.model.OperationLogEntityDTO;

import java.io.Serializable;

public interface OperationLogEntityService extends IService<OperationLogEntity> {

    /**
     * 分页条件查询OperationLogEntity
     * @param pagination 分页
     * @param orderBy 排序
     * @param condition 条件
     * @return 分页列表
     */
    PageResult<OperationLogEntity> page(Pagination pagination, String orderBy, OperationLogEntityDTO condition);

    /**
     * 根据主键更新实体
     * @param OperationLogEntity
     * @return
     */
    int updateEntityById(OperationLogEntity entity);

    /**
     * 根据主键删除实体
     * @param id
     * @return
     */
    int deleteEntityById(Serializable id);

}
