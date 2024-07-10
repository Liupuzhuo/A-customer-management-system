package com.example.controller;

import com.example.common.pagination.PageResult;
import com.example.common.pagination.Pagination;
import com.example.common.result.Resp;
import com.example.domain.entity.OperationLogEntity;
import com.example.domain.model.OperationLogEntityDTO;
import com.example.service.OperationLogEntityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import io.swagger.v3.oas.annotations.tags.Tag;

import java.util.List;

@Tag(name = "operationLog")
@RestController
public class OperationLogEntityController {

    @Autowired
    private OperationLogEntityService operationLogService;

     /**
     * 根据主键查询-操作日志
     * @param id 主键
     * @return 操作日志详情
     */
    @GetMapping("/api/v1/operationLog/{id}")
    public Resp<OperationLogEntity> getById(@PathVariable String id) {
        OperationLogEntity detail = operationLogService.getById(id);
        return Resp.success(detail);
    }

    /**
     * 分页条件查询-操作日志
     * @param pageNum  页码
     * @param pageSize 页数
     * @param orderBy 排序字段（eg: orderBy=score desc）
     * @param condition 条件
     * @return 列表分页数据
     */
    @GetMapping("/api/v1/operationLog")
    public Resp<PageResult<OperationLogEntity>> page(@RequestParam(required = false) Integer pageNum,
                                          @RequestParam(required = false) Integer pageSize,
                                          @RequestParam(required = false) String orderBy,
                                          OperationLogEntityDTO condition) {
        PageResult<OperationLogEntity> pageResult = operationLogService.page(Pagination.of(pageNum, pageSize), orderBy, condition);
        return Resp.success(pageResult);
    }

    /**
     * 查询全部-操作日志
     * @return 列表数据
     */
    @GetMapping("/api/v1/operationLog/list")
    public Resp<List<OperationLogEntity>> list() {
        return Resp.success(operationLogService.list());
    }
 
    /**
     * 创建-操作日志
     * @param operationLog 操作日志
     * @return
     */
    @PostMapping("/api/v1/operationLog")
    public Resp<OperationLogEntity> create(@RequestBody OperationLogEntity operationLog) {
        operationLogService.save(operationLog);
        return Resp.success( operationLog);
    }

    /**
     * 创建或修改-操作日志
     * @param operationLog 操作日志
     * @return 是否成功
     */
    @PostMapping("/api/v1/operationLog/upsert")
    public Resp<Boolean> upsert(@RequestBody OperationLogEntity operationLog) {
        boolean result = operationLogService.saveOrUpdate(operationLog);
        return result?Resp.success(true):Resp.fail("upsert failed");
    }

    /**
     * 根据主键修改-操作日志
     * @param id 主键
     * @param operationLog 操作日志
     * @return
     */
    @PutMapping("/api/v1/operationLog/{id}")
    public Resp<Integer> updateById(@PathVariable String id, @RequestBody OperationLogEntity operationLog) {
        // operationLog.setId(id);
        int affected = operationLogService.updateEntityById(operationLog);
        return Resp.success(affected);
    }

    /**
     * 根据主键删除-操作日志
     * @param id 主键
     * @return
     */
    @DeleteMapping("/api/v1/operationLog/{id}")
    public Resp<Integer> deleteById(@PathVariable String id) {
        int affected = operationLogService.deleteEntityById(id);
        return Resp.success(affected);
    }
}
