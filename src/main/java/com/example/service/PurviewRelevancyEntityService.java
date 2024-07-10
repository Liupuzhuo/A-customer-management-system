package com.example.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.common.pagination.PageResult;
import com.example.common.pagination.Pagination;
import com.example.domain.entity.PurviewRelevancyEntity;
import com.example.domain.model.PurviewRelevancyEntityDTO;

import java.io.Serializable;

public interface PurviewRelevancyEntityService extends IService<PurviewRelevancyEntity> {

    /**
     * 分页条件查询PurviewRelevancyEntity
     * @param pagination 分页
     * @param orderBy 排序
     * @param condition 条件
     * @return 分页列表
     */
    PageResult<PurviewRelevancyEntity> page(Pagination pagination, String orderBy, PurviewRelevancyEntityDTO condition);

    /**
     * 根据主键更新实体
     * @param PurviewRelevancyEntity
     * @return
     */
    int updateEntityById(PurviewRelevancyEntity entity);

    /**
     * 根据主键删除实体
     * @param id
     * @return
     */
    int deleteEntityById(Serializable id);

}
