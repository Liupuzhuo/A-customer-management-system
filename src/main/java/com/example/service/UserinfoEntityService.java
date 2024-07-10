package com.example.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.common.pagination.PageResult;
import com.example.common.pagination.Pagination;
import com.example.domain.entity.UserinfoEntity;
import com.example.domain.model.UserinfoEntityDTO;

import java.io.Serializable;

public interface UserinfoEntityService extends IService<UserinfoEntity> {

    /**
     * 分页条件查询UserinfoEntity
     * @param pagination 分页
     * @param orderBy 排序
     * @param condition 条件
     * @return 分页列表
     */
    PageResult<UserinfoEntity> page(Pagination pagination, String orderBy, UserinfoEntityDTO condition);

    /**
     * 根据主键更新实体
     * @param UserinfoEntity
     * @return
     */
    int updateEntityById(UserinfoEntity entity);

    /**
     * 根据主键删除实体
     * @param id
     * @return
     */
    int deleteEntityById(Serializable id);

}
