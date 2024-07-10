package com.example.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.common.pagination.PageResult;
import com.example.common.pagination.Pagination;
import com.example.domain.entity.RoleRelevanceEntity;
import com.example.domain.model.RoleRelevanceEntityDTO;

import java.io.Serializable;

public interface RoleRelevanceEntityService extends IService<RoleRelevanceEntity> {

    /**
     * 分页条件查询RoleRelevanceEntity
     * @param pagination 分页
     * @param orderBy 排序
     * @param condition 条件
     * @return 分页列表
     */
    PageResult<RoleRelevanceEntity> page(Pagination pagination, String orderBy, RoleRelevanceEntityDTO condition);

    /**
     * 根据主键更新实体
     * @param RoleRelevanceEntity
     * @return
     */
    int updateEntityById(RoleRelevanceEntity entity);

    /**
     * 根据主键删除实体
     * @param id
     * @return
     */
    int deleteEntityById(Serializable id);

}
