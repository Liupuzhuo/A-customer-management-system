package com.example.common.pagination;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.List;

/**
 * page result
 * @param <T>
 */
public class PageResult<T> {

    /**
     * 页码
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private long pageNum;
    /**
     * 页数
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private long pageSize;
    /**
     * 总页数
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private long totalPages;
    /**
     * 总条数
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private long totalElements;

    /**
     * 数据列表
     */
    private List<T> list;

    public static <T> PageResult<T> of(Page<T> page) {
        PageResult<T> pageResult = new PageResult<>();
        pageResult.setList(page.getRecords());

        if (isPage(page.getSize())) {
            pageResult.setTotalElements(page.getTotal());
            pageResult.setTotalPages(page.getPages());
            pageResult.setPageNum(page.getCurrent());
            pageResult.setPageSize(page.getSize());
        }
        return pageResult;
    }

    public static <T> PageResult<T> valueOf(List<T> list) {
        PageResult<T> pageResult = new PageResult<>();
        pageResult.setList(list);
        return pageResult;
    }

    public static <R, T> PageResult<R> valueOf(Page<T> page, List<R> list) {
        PageResult<R> pageResult = new PageResult<>();
        pageResult.setList(list);

        if (isPage(page.getSize())) {
            pageResult.setTotalElements(page.getTotal());
            pageResult.setTotalPages(page.getPages());
            pageResult.setPageNum(page.getCurrent());
            pageResult.setPageSize(page.getSize());
        }
        return pageResult;
    }

    public static boolean isPage(long pageSize) {
        return Long.MAX_VALUE != pageSize;
    }

    private PageResult() {
    }

    public long getPageNum() {
        return pageNum;
    }

    public void setPageNum(long pageNum) {
        this.pageNum = pageNum;
    }

    public long getPageSize() {
        return pageSize;
    }

    public void setPageSize(long pageSize) {
        this.pageSize = pageSize;
    }

    public long getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(long totalPages) {
        this.totalPages = totalPages;
    }

    public long getTotalElements() {
        return totalElements;
    }

    public void setTotalElements(long totalElements) {
        this.totalElements = totalElements;
    }

    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }
}

