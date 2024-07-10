package com.example.controller;

import com.example.common.pagination.PageResult;
import com.example.common.pagination.Pagination;
import com.example.common.result.Resp;
import com.example.domain.entity.UserRoleEntity;
import com.example.domain.model.UserRoleEntityDTO;
import com.example.service.UserRoleEntityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import io.swagger.v3.oas.annotations.tags.Tag;

import java.util.List;

@Tag(name = "userRole")
@RestController
public class UserRoleEntityController {

    @Autowired
    private UserRoleEntityService userRoleService;

     /**
     * 根据主键查询-角色实体
     * @param id 主键
     * @return 角色实体详情
     */
    @GetMapping("/api/v1/userRole/{id}")
    public Resp<UserRoleEntity> getById(@PathVariable String id) {
        UserRoleEntity detail = userRoleService.getById(id);
        return Resp.success(detail);
    }

    /**
     * 分页条件查询-角色实体
     * @param pageNum  页码
     * @param pageSize 页数
     * @param orderBy 排序字段（eg: orderBy=score desc）
     * @param condition 条件
     * @return 列表分页数据
     */
    @GetMapping("/api/v1/userRole")
    public Resp<PageResult<UserRoleEntity>> page(@RequestParam(required = false) Integer pageNum,
                                          @RequestParam(required = false) Integer pageSize,
                                          @RequestParam(required = false) String orderBy,
                                          UserRoleEntityDTO condition) {
        PageResult<UserRoleEntity> pageResult = userRoleService.page(Pagination.of(pageNum, pageSize), orderBy, condition);
        return Resp.success(pageResult);
    }

    /**
     * 查询全部-角色实体
     * @return 列表数据
     */
    @GetMapping("/api/v1/userRole/list")
    public Resp<List<UserRoleEntity>> list() {
        return Resp.success(userRoleService.list());
    }
 
    /**
     * 创建-角色实体
     * @param userRole 角色实体
     * @return
     */
    @PostMapping("/api/v1/userRole")
    public Resp<UserRoleEntity> create(@RequestBody UserRoleEntity userRole) {
        userRoleService.save(userRole);
        return Resp.success( userRole);
    }

    /**
     * 创建或修改-角色实体
     * @param userRole 角色实体
     * @return 是否成功
     */
    @PostMapping("/api/v1/userRole/upsert")
    public Resp<Boolean> upsert(@RequestBody UserRoleEntity userRole) {
        boolean result = userRoleService.saveOrUpdate(userRole);
        return result?Resp.success(true):Resp.fail("upsert failed");
    }

    /**
     * 根据主键修改-角色实体
     * @param id 主键
     * @param userRole 角色实体
     * @return
     */
    @PutMapping("/api/v1/userRole/{id}")
    public Resp<Integer> updateById(@PathVariable String id, @RequestBody UserRoleEntity userRole) {
        // userRole.setId(id);
        int affected = userRoleService.updateEntityById(userRole);
        return Resp.success(affected);
    }

    /**
     * 根据主键删除-角色实体
     * @param id 主键
     * @return
     */
    @DeleteMapping("/api/v1/userRole/{id}")
    public Resp<Integer> deleteById(@PathVariable String id) {
        int affected = userRoleService.deleteEntityById(id);
        return Resp.success(affected);
    }
}
