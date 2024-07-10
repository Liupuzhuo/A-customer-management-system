package com.example.controller;

import com.example.common.pagination.PageResult;
import com.example.common.pagination.Pagination;
import com.example.common.result.Resp;
import com.example.domain.entity.PurviewEntity;
import com.example.domain.model.PurviewEntityDTO;
import com.example.service.PurviewEntityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import io.swagger.v3.oas.annotations.tags.Tag;

import java.util.List;

@Tag(name = "purview")
@RestController
public class PurviewEntityController {

    @Autowired
    private PurviewEntityService purviewService;

     /**
     * 根据主键查询-purview
     * @param id 主键
     * @return purview详情
     */
    @GetMapping("/api/v1/purview/{id}")
    public Resp<PurviewEntity> getById(@PathVariable String id) {
        PurviewEntity detail = purviewService.getById(id);
        return Resp.success(detail);
    }

    /**
     * 分页条件查询-purview
     * @param pageNum  页码
     * @param pageSize 页数
     * @param orderBy 排序字段（eg: orderBy=score desc）
     * @param condition 条件
     * @return 列表分页数据
     */
    @GetMapping("/api/v1/purview")
    public Resp<PageResult<PurviewEntity>> page(@RequestParam(required = false) Integer pageNum,
                                          @RequestParam(required = false) Integer pageSize,
                                          @RequestParam(required = false) String orderBy,
                                          PurviewEntityDTO condition) {
        PageResult<PurviewEntity> pageResult = purviewService.page(Pagination.of(pageNum, pageSize), orderBy, condition);
        return Resp.success(pageResult);
    }

    /**
     * 查询全部-purview
     * @return 列表数据
     */
    @GetMapping("/api/v1/purview/list")
    public Resp<List<PurviewEntity>> list() {
        return Resp.success(purviewService.list());
    }
 
    /**
     * 创建-purview
     * @param purview purview
     * @return
     */
    @PostMapping("/api/v1/purview")
    public Resp<PurviewEntity> create(@RequestBody PurviewEntity purview) {
        purviewService.save(purview);
        return Resp.success( purview);
    }

    /**
     * 创建或修改-purview
     * @param purview purview
     * @return 是否成功
     */
    @PostMapping("/api/v1/purview/upsert")
    public Resp<Boolean> upsert(@RequestBody PurviewEntity purview) {
        boolean result = purviewService.saveOrUpdate(purview);
        return result?Resp.success(true):Resp.fail("upsert failed");
    }

    /**
     * 根据主键修改-purview
     * @param id 主键
     * @param purview purview
     * @return
     */
    @PutMapping("/api/v1/purview/{id}")
    public Resp<Integer> updateById(@PathVariable String id, @RequestBody PurviewEntity purview) {
        // purview.setId(id);
        int affected = purviewService.updateEntityById(purview);
        return Resp.success(affected);
    }

    /**
     * 根据主键删除-purview
     * @param id 主键
     * @return
     */
    @DeleteMapping("/api/v1/purview/{id}")
    public Resp<Integer> deleteById(@PathVariable String id) {
        int affected = purviewService.deleteEntityById(id);
        return Resp.success(affected);
    }
}
