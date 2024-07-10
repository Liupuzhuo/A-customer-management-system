package com.example.controller;

import com.example.common.pagination.PageResult;
import com.example.common.pagination.Pagination;
import com.example.common.result.Resp;
import com.example.domain.entity.RoleRelevanceEntity;
import com.example.domain.model.RoleRelevanceEntityDTO;
import com.example.service.RoleRelevanceEntityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import io.swagger.v3.oas.annotations.tags.Tag;

import java.util.List;

@Tag(name = "roleRelevance")
@RestController
public class RoleRelevanceEntityController {

    @Autowired
    private RoleRelevanceEntityService roleRelevanceService;

     /**
     * 根据主键查询-roleRelevance
     * @param id 主键
     * @return roleRelevance详情
     */
    @GetMapping("/api/v1/role_relevance/{id}")
    public Resp<RoleRelevanceEntity> getById(@PathVariable String id) {
        RoleRelevanceEntity detail = roleRelevanceService.getById(id);
        return Resp.success(detail);
    }

    /**
     * 分页条件查询-roleRelevance
     * @param pageNum  页码
     * @param pageSize 页数
     * @param orderBy 排序字段（eg: orderBy=score desc）
     * @param condition 条件
     * @return 列表分页数据
     */
    @GetMapping("/api/v1/role_relevance")
    public Resp<PageResult<RoleRelevanceEntity>> page(@RequestParam(required = false) Integer pageNum,
                                          @RequestParam(required = false) Integer pageSize,
                                          @RequestParam(required = false) String orderBy,
                                          RoleRelevanceEntityDTO condition) {
        PageResult<RoleRelevanceEntity> pageResult = roleRelevanceService.page(Pagination.of(pageNum, pageSize), orderBy, condition);
        return Resp.success(pageResult);
    }

    /**
     * 查询全部-roleRelevance
     * @return 列表数据
     */
    @GetMapping("/api/v1/role_relevance/list")
    public Resp<List<RoleRelevanceEntity>> list() {
        return Resp.success(roleRelevanceService.list());
    }
 
    /**
     * 创建-roleRelevance
     * @param roleRelevance roleRelevance
     * @return
     */
    @PostMapping("/api/v1/role_relevance")
    public Resp<RoleRelevanceEntity> create(@RequestBody RoleRelevanceEntity roleRelevance) {
        roleRelevanceService.save(roleRelevance);
        return Resp.success( roleRelevance);
    }

    /**
     * 创建或修改-roleRelevance
     * @param roleRelevance roleRelevance
     * @return 是否成功
     */
    @PostMapping("/api/v1/role_relevance/upsert")
    public Resp<Boolean> upsert(@RequestBody RoleRelevanceEntity roleRelevance) {
        boolean result = roleRelevanceService.saveOrUpdate(roleRelevance);
        return result?Resp.success(true):Resp.fail("upsert failed");
    }

    /**
     * 根据主键修改-roleRelevance
     * @param id 主键
     * @param roleRelevance roleRelevance
     * @return
     */
    @PutMapping("/api/v1/role_relevance/{id}")
    public Resp<Integer> updateById(@PathVariable String id, @RequestBody RoleRelevanceEntity roleRelevance) {
        // roleRelevance.setId(id);
        int affected = roleRelevanceService.updateEntityById(roleRelevance);
        return Resp.success(affected);
    }

    /**
     * 根据主键删除-roleRelevance
     * @param id 主键
     * @return
     */
    @DeleteMapping("/api/v1/role_relevance/{id}")
    public Resp<Integer> deleteById(@PathVariable String id) {
        int affected = roleRelevanceService.deleteEntityById(id);
        return Resp.success(affected);
    }
}
