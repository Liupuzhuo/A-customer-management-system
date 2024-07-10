package com.example.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.common.pagination.PageResult;
import com.example.common.pagination.Pagination;
import com.example.domain.entity.UserRoleEntity;
import com.example.domain.model.UserRoleEntityDTO;

import java.io.Serializable;

public interface UserRoleEntityService extends IService<UserRoleEntity> {

    /**
     * 分页条件查询UserRoleEntity
     * @param pagination 分页
     * @param orderBy 排序
     * @param condition 条件
     * @return 分页列表
     */
    PageResult<UserRoleEntity> page(Pagination pagination, String orderBy, UserRoleEntityDTO condition);

    /**
     * 根据主键更新实体
     * @param UserRoleEntity
     * @return
     */
    int updateEntityById(UserRoleEntity entity);

    /**
     * 根据主键删除实体
     * @param id
     * @return
     */
    int deleteEntityById(Serializable id);

}
