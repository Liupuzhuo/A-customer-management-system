package com.example.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.common.pagination.PageResult;
import com.example.common.pagination.Pagination;
import com.example.domain.entity.PurviewEntity;
import com.example.domain.model.PurviewEntityDTO;

import java.io.Serializable;

public interface PurviewEntityService extends IService<PurviewEntity> {

    /**
     * 分页条件查询PurviewEntity
     * @param pagination 分页
     * @param orderBy 排序
     * @param condition 条件
     * @return 分页列表
     */
    PageResult<PurviewEntity> page(Pagination pagination, String orderBy, PurviewEntityDTO condition);

    /**
     * 根据主键更新实体
     * @param PurviewEntity
     * @return
     */
    int updateEntityById(PurviewEntity entity);

    /**
     * 根据主键删除实体
     * @param id
     * @return
     */
    int deleteEntityById(Serializable id);

}
