package com.example.domain.model;

import java.util.*;
import com.example.domain.entity.*;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * PageResultOperationLogKsce
 */
public class PageResultOperationLogKsce {
   /**
    * pageNum页码
    */
   @JsonProperty("pageNum")
   private String pageNum;
   
   /**
    * pageSize页数
    */
   @JsonProperty("pageSize")
   private String pageSize;
   
   /**
    * totalPages总页数
    */
   @JsonProperty("totalPages")
   private String totalPages;
   
   /**
    * totalElements总条数
    */
   @JsonProperty("totalElements")
   private String totalElements;
   
   /**
    * list数据列表
    */
   @JsonProperty("list")
   private List<OperationLogEntity> list;
   
   public String getPageNum() {
      return pageNum;
   }

   public void setPageNum(String pageNum) {
      this.pageNum = pageNum;
   }
   public String getPageSize() {
      return pageSize;
   }

   public void setPageSize(String pageSize) {
      this.pageSize = pageSize;
   }
   public String getTotalPages() {
      return totalPages;
   }

   public void setTotalPages(String totalPages) {
      this.totalPages = totalPages;
   }
   public String getTotalElements() {
      return totalElements;
   }

   public void setTotalElements(String totalElements) {
      this.totalElements = totalElements;
   }
   public List<OperationLogEntity> getList() {
      return list;
   }

   public void setList(List<OperationLogEntity> list) {
      this.list = list;
   }
}
