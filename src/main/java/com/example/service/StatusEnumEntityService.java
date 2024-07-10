package com.example.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.common.pagination.PageResult;
import com.example.common.pagination.Pagination;
import com.example.domain.entity.StatusEnumEntity;
import com.example.domain.model.StatusEnumEntityDTO;

import java.io.Serializable;

public interface StatusEnumEntityService extends IService<StatusEnumEntity> {

    /**
     * 分页条件查询StatusEnumEntity
     * @param pagination 分页
     * @param orderBy 排序
     * @param condition 条件
     * @return 分页列表
     */
    PageResult<StatusEnumEntity> page(Pagination pagination, String orderBy, StatusEnumEntityDTO condition);

    /**
     * 根据主键更新实体
     * @param StatusEnumEntity
     * @return
     */
    int updateEntityById(StatusEnumEntity entity);

    /**
     * 根据主键删除实体
     * @param id
     * @return
     */
    int deleteEntityById(Serializable id);

}
