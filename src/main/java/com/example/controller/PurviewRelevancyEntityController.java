package com.example.controller;

import com.example.common.pagination.PageResult;
import com.example.common.pagination.Pagination;
import com.example.common.result.Resp;
import com.example.domain.entity.PurviewRelevancyEntity;
import com.example.domain.model.PurviewRelevancyEntityDTO;
import com.example.service.PurviewRelevancyEntityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import io.swagger.v3.oas.annotations.tags.Tag;

import java.util.List;

@Tag(name = "purviewRelevancy")
@RestController
public class PurviewRelevancyEntityController {

    @Autowired
    private PurviewRelevancyEntityService purviewRelevancyService;

     /**
     * 根据主键查询-purviewRelevancy
     * @param id 主键
     * @return purviewRelevancy详情
     */
    @GetMapping("/api/v1/purview_relevancy/{id}")
    public Resp<PurviewRelevancyEntity> getById(@PathVariable String id) {
        PurviewRelevancyEntity detail = purviewRelevancyService.getById(id);
        return Resp.success(detail);
    }

    /**
     * 分页条件查询-purviewRelevancy
     * @param pageNum  页码
     * @param pageSize 页数
     * @param orderBy 排序字段（eg: orderBy=score desc）
     * @param condition 条件
     * @return 列表分页数据
     */
    @GetMapping("/api/v1/purview_relevancy")
    public Resp<PageResult<PurviewRelevancyEntity>> page(@RequestParam(required = false) Integer pageNum,
                                          @RequestParam(required = false) Integer pageSize,
                                          @RequestParam(required = false) String orderBy,
                                          PurviewRelevancyEntityDTO condition) {
        PageResult<PurviewRelevancyEntity> pageResult = purviewRelevancyService.page(Pagination.of(pageNum, pageSize), orderBy, condition);
        return Resp.success(pageResult);
    }

    /**
     * 查询全部-purviewRelevancy
     * @return 列表数据
     */
    @GetMapping("/api/v1/purview_relevancy/list")
    public Resp<List<PurviewRelevancyEntity>> list() {
        return Resp.success(purviewRelevancyService.list());
    }
 
    /**
     * 创建-purviewRelevancy
     * @param purviewRelevancy purviewRelevancy
     * @return
     */
    @PostMapping("/api/v1/purview_relevancy")
    public Resp<PurviewRelevancyEntity> create(@RequestBody PurviewRelevancyEntity purviewRelevancy) {
        purviewRelevancyService.save(purviewRelevancy);
        return Resp.success( purviewRelevancy);
    }

    /**
     * 创建或修改-purviewRelevancy
     * @param purviewRelevancy purviewRelevancy
     * @return 是否成功
     */
    @PostMapping("/api/v1/purview_relevancy/upsert")
    public Resp<Boolean> upsert(@RequestBody PurviewRelevancyEntity purviewRelevancy) {
        boolean result = purviewRelevancyService.saveOrUpdate(purviewRelevancy);
        return result?Resp.success(true):Resp.fail("upsert failed");
    }

    /**
     * 根据主键修改-purviewRelevancy
     * @param id 主键
     * @param purviewRelevancy purviewRelevancy
     * @return
     */
    @PutMapping("/api/v1/purview_relevancy/{id}")
    public Resp<Integer> updateById(@PathVariable String id, @RequestBody PurviewRelevancyEntity purviewRelevancy) {
        // purviewRelevancy.setId(id);
        int affected = purviewRelevancyService.updateEntityById(purviewRelevancy);
        return Resp.success(affected);
    }

    /**
     * 根据主键删除-purviewRelevancy
     * @param id 主键
     * @return
     */
    @DeleteMapping("/api/v1/purview_relevancy/{id}")
    public Resp<Integer> deleteById(@PathVariable String id) {
        int affected = purviewRelevancyService.deleteEntityById(id);
        return Resp.success(affected);
    }
}
