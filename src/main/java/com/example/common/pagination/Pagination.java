package com.example.common.pagination;

import java.util.Optional;

/**
 * Pagination
 *
 * @author fos
 */
public class Pagination {

    private Integer pageNum;
    private Integer pageSize;

    private Pagination() {

    }

    public static Pagination of(Integer pageNum, Integer pageSize) {
        Pagination page = new Pagination();
        page.setPageNum(Optional.ofNullable(pageNum).orElse(1));
        page.setPageSize(Optional.ofNullable(pageSize).orElse(10));
        return page;
    }

    public Integer getPageNum() {
        return pageNum;
    }

    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }
}

