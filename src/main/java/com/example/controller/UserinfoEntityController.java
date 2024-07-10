package com.example.controller;

import com.example.common.pagination.PageResult;
import com.example.common.pagination.Pagination;
import com.example.common.result.Resp;
import com.example.domain.entity.UserinfoEntity;
import com.example.domain.model.UserinfoEntityDTO;
import com.example.service.UserinfoEntityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import io.swagger.v3.oas.annotations.tags.Tag;

import java.util.List;

@Tag(name = "userinfo")
@RestController
public class UserinfoEntityController {

    @Autowired
    private UserinfoEntityService userinfoService;

     /**
     * 根据主键查询-用户实体
     * @param id 主键
     * @return 用户实体详情
     */
    @GetMapping("/api/v1/userinfo/{id}")
    public Resp<UserinfoEntity> getById(@PathVariable String id) {
        UserinfoEntity detail = userinfoService.getById(id);
        return Resp.success(detail);
    }

    /**
     * 分页条件查询-用户实体
     * @param pageNum  页码
     * @param pageSize 页数
     * @param orderBy 排序字段（eg: orderBy=score desc）
     * @param condition 条件
     * @return 列表分页数据
     */
    @GetMapping("/api/v1/userinfo")
    public Resp<PageResult<UserinfoEntity>> page(@RequestParam(required = false) Integer pageNum,
                                          @RequestParam(required = false) Integer pageSize,
                                          @RequestParam(required = false) String orderBy,
                                          UserinfoEntityDTO condition) {
        PageResult<UserinfoEntity> pageResult = userinfoService.page(Pagination.of(pageNum, pageSize), orderBy, condition);
        return Resp.success(pageResult);
    }

    /**
     * 查询全部-用户实体
     * @return 列表数据
     */
    @GetMapping("/api/v1/userinfo/list")
    public Resp<List<UserinfoEntity>> list() {
        return Resp.success(userinfoService.list());
    }
 
    /**
     * 创建-用户实体
     * @param userinfo 用户实体
     * @return
     */
    @PostMapping("/api/v1/userinfo")
    public Resp<UserinfoEntity> create(@RequestBody UserinfoEntity userinfo) {
        userinfoService.save(userinfo);
        return Resp.success( userinfo);
    }

    /**
     * 创建或修改-用户实体
     * @param userinfo 用户实体
     * @return 是否成功
     */
    @PostMapping("/api/v1/userinfo/upsert")
    public Resp<Boolean> upsert(@RequestBody UserinfoEntity userinfo) {
        boolean result = userinfoService.saveOrUpdate(userinfo);
        return result?Resp.success(true):Resp.fail("upsert failed");
    }

    /**
     * 根据主键修改-用户实体
     * @param id 主键
     * @param userinfo 用户实体
     * @return
     */
    @PutMapping("/api/v1/userinfo/{id}")
    public Resp<Integer> updateById(@PathVariable String id, @RequestBody UserinfoEntity userinfo) {
        // userinfo.setId(id);
        int affected = userinfoService.updateEntityById(userinfo);
        return Resp.success(affected);
    }

    /**
     * 根据主键删除-用户实体
     * @param id 主键
     * @return
     */
    @DeleteMapping("/api/v1/userinfo/{id}")
    public Resp<Integer> deleteById(@PathVariable String id) {
        int affected = userinfoService.deleteEntityById(id);
        return Resp.success(affected);
    }
}
