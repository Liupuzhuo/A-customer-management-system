package com.example.controller;

import com.example.common.pagination.PageResult;
import com.example.common.pagination.Pagination;
import com.example.common.result.Resp;
import com.example.domain.entity.StatusEnumEntity;
import com.example.domain.model.StatusEnumEntityDTO;
import com.example.service.StatusEnumEntityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import io.swagger.v3.oas.annotations.tags.Tag;

import java.util.List;

@Tag(name = "statusEnum")
@RestController
public class StatusEnumEntityController {

    @Autowired
    private StatusEnumEntityService statusEnumService;

     /**
     * 根据主键查询-statusEnum
     * @param id 主键
     * @return statusEnum详情
     */
    @GetMapping("/api/v1/status_enum/{id}")
    public Resp<StatusEnumEntity> getById(@PathVariable String id) {
        StatusEnumEntity detail = statusEnumService.getById(id);
        return Resp.success(detail);
    }

    /**
     * 分页条件查询-statusEnum
     * @param pageNum  页码
     * @param pageSize 页数
     * @param orderBy 排序字段（eg: orderBy=score desc）
     * @param condition 条件
     * @return 列表分页数据
     */
    @GetMapping("/api/v1/status_enum")
    public Resp<PageResult<StatusEnumEntity>> page(@RequestParam(required = false) Integer pageNum,
                                          @RequestParam(required = false) Integer pageSize,
                                          @RequestParam(required = false) String orderBy,
                                          StatusEnumEntityDTO condition) {
        PageResult<StatusEnumEntity> pageResult = statusEnumService.page(Pagination.of(pageNum, pageSize), orderBy, condition);
        return Resp.success(pageResult);
    }

    /**
     * 查询全部-statusEnum
     * @return 列表数据
     */
    @GetMapping("/api/v1/status_enum/list")
    public Resp<List<StatusEnumEntity>> list() {
        return Resp.success(statusEnumService.list());
    }
 
    /**
     * 创建-statusEnum
     * @param statusEnum statusEnum
     * @return
     */
    @PostMapping("/api/v1/status_enum")
    public Resp<StatusEnumEntity> create(@RequestBody StatusEnumEntity statusEnum) {
        statusEnumService.save(statusEnum);
        return Resp.success( statusEnum);
    }

    /**
     * 创建或修改-statusEnum
     * @param statusEnum statusEnum
     * @return 是否成功
     */
    @PostMapping("/api/v1/status_enum/upsert")
    public Resp<Boolean> upsert(@RequestBody StatusEnumEntity statusEnum) {
        boolean result = statusEnumService.saveOrUpdate(statusEnum);
        return result?Resp.success(true):Resp.fail("upsert failed");
    }

    /**
     * 根据主键修改-statusEnum
     * @param id 主键
     * @param statusEnum statusEnum
     * @return
     */
    @PutMapping("/api/v1/status_enum/{id}")
    public Resp<Integer> updateById(@PathVariable String id, @RequestBody StatusEnumEntity statusEnum) {
        // statusEnum.setId(id);
        int affected = statusEnumService.updateEntityById(statusEnum);
        return Resp.success(affected);
    }

    /**
     * 根据主键删除-statusEnum
     * @param id 主键
     * @return
     */
    @DeleteMapping("/api/v1/status_enum/{id}")
    public Resp<Integer> deleteById(@PathVariable String id) {
        int affected = statusEnumService.deleteEntityById(id);
        return Resp.success(affected);
    }
}
