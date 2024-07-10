package com.example.controller;

import com.example.common.pagination.PageResult;
import com.example.common.pagination.Pagination;
import com.example.common.result.Resp;
import com.example.domain.entity.WorklistEntity;
import com.example.domain.model.WorklistEntityDTO;
import com.example.service.WorklistEntityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import io.swagger.v3.oas.annotations.tags.Tag;

import java.util.List;

@Tag(name = "worklist")
@RestController
public class WorklistEntityController {

    @Autowired
    private WorklistEntityService worklistService;

     /**
     * 根据主键查询-WORKLIST
     * @param id 主键
     * @return WORKLIST详情
     */
    @GetMapping("/api/v1/worklist/{id}")
    public Resp<WorklistEntity> getById(@PathVariable String id) {
        WorklistEntity detail = worklistService.getById(id);
        return Resp.success(detail);
    }

    /**
     * 分页条件查询-WORKLIST
     * @param pageNum  页码
     * @param pageSize 页数
     * @param orderBy 排序字段（eg: orderBy=score desc）
     * @param condition 条件
     * @return 列表分页数据
     */
    @GetMapping("/api/v1/worklist")
    public Resp<PageResult<WorklistEntity>> page(@RequestParam(required = false) Integer pageNum,
                                          @RequestParam(required = false) Integer pageSize,
                                          @RequestParam(required = false) String orderBy,
                                          WorklistEntityDTO condition) {
        PageResult<WorklistEntity> pageResult = worklistService.page(Pagination.of(pageNum, pageSize), orderBy, condition);
        return Resp.success(pageResult);
    }

    /**
     * 查询全部-WORKLIST
     * @return 列表数据
     */
    @GetMapping("/api/v1/worklist/list")
    public Resp<List<WorklistEntity>> list() {
        return Resp.success(worklistService.list());
    }
 
    /**
     * 创建-WORKLIST
     * @param worklist WORKLIST
     * @return
     */
    @PostMapping("/api/v1/worklist")
    public Resp<WorklistEntity> create(@RequestBody WorklistEntity worklist) {
        worklistService.save(worklist);
        return Resp.success( worklist);
    }

    /**
     * 创建或修改-WORKLIST
     * @param worklist WORKLIST
     * @return 是否成功
     */
    @PostMapping("/api/v1/worklist/upsert")
    public Resp<Boolean> upsert(@RequestBody WorklistEntity worklist) {
        boolean result = worklistService.saveOrUpdate(worklist);
        return result?Resp.success(true):Resp.fail("upsert failed");
    }

    /**
     * 根据主键修改-WORKLIST
     * @param id 主键
     * @param worklist WORKLIST
     * @return
     */
    @PutMapping("/api/v1/worklist/{id}")
    public Resp<Integer> updateById(@PathVariable String id, @RequestBody WorklistEntity worklist) {
        // worklist.setId(id);
        int affected = worklistService.updateEntityById(worklist);
        return Resp.success(affected);
    }

    /**
     * 根据主键删除-WORKLIST
     * @param id 主键
     * @return
     */
    @DeleteMapping("/api/v1/worklist/{id}")
    public Resp<Integer> deleteById(@PathVariable String id) {
        int affected = worklistService.deleteEntityById(id);
        return Resp.success(affected);
    }
}
