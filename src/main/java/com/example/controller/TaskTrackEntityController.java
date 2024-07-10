package com.example.controller;

import com.example.common.pagination.PageResult;
import com.example.common.pagination.Pagination;
import com.example.common.result.Resp;
import com.example.domain.entity.TaskTrackEntity;
import com.example.domain.model.TaskTrackEntityDTO;
import com.example.service.TaskTrackEntityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import io.swagger.v3.oas.annotations.tags.Tag;

import java.util.List;

@Tag(name = "taskTrack")
@RestController
public class TaskTrackEntityController {

    @Autowired
    private TaskTrackEntityService taskTrackService;

     /**
     * 根据主键查询-taskTrack
     * @param id 主键
     * @return taskTrack详情
     */
    @GetMapping("/api/v1/task_track/{id}")
    public Resp<TaskTrackEntity> getById(@PathVariable String id) {
        TaskTrackEntity detail = taskTrackService.getById(id);
        return Resp.success(detail);
    }

    /**
     * 分页条件查询-taskTrack
     * @param pageNum  页码
     * @param pageSize 页数
     * @param orderBy 排序字段（eg: orderBy=score desc）
     * @param condition 条件
     * @return 列表分页数据
     */
    @GetMapping("/api/v1/task_track")
    public Resp<PageResult<TaskTrackEntity>> page(@RequestParam(required = false) Integer pageNum,
                                          @RequestParam(required = false) Integer pageSize,
                                          @RequestParam(required = false) String orderBy,
                                          TaskTrackEntityDTO condition) {
        PageResult<TaskTrackEntity> pageResult = taskTrackService.page(Pagination.of(pageNum, pageSize), orderBy, condition);
        return Resp.success(pageResult);
    }

    /**
     * 查询全部-taskTrack
     * @return 列表数据
     */
    @GetMapping("/api/v1/task_track/list")
    public Resp<List<TaskTrackEntity>> list() {
        return Resp.success(taskTrackService.list());
    }
 
    /**
     * 创建-taskTrack
     * @param taskTrack taskTrack
     * @return
     */
    @PostMapping("/api/v1/task_track")
    public Resp<TaskTrackEntity> create(@RequestBody TaskTrackEntity taskTrack) {
        taskTrackService.save(taskTrack);
        return Resp.success( taskTrack);
    }

    /**
     * 创建或修改-taskTrack
     * @param taskTrack taskTrack
     * @return 是否成功
     */
    @PostMapping("/api/v1/task_track/upsert")
    public Resp<Boolean> upsert(@RequestBody TaskTrackEntity taskTrack) {
        boolean result = taskTrackService.saveOrUpdate(taskTrack);
        return result?Resp.success(true):Resp.fail("upsert failed");
    }

    /**
     * 根据主键修改-taskTrack
     * @param id 主键
     * @param taskTrack taskTrack
     * @return
     */
    @PutMapping("/api/v1/task_track/{id}")
    public Resp<Integer> updateById(@PathVariable String id, @RequestBody TaskTrackEntity taskTrack) {
        // taskTrack.setId(id);
        int affected = taskTrackService.updateEntityById(taskTrack);
        return Resp.success(affected);
    }

    /**
     * 根据主键删除-taskTrack
     * @param id 主键
     * @return
     */
    @DeleteMapping("/api/v1/task_track/{id}")
    public Resp<Integer> deleteById(@PathVariable String id) {
        int affected = taskTrackService.deleteEntityById(id);
        return Resp.success(affected);
    }
}
