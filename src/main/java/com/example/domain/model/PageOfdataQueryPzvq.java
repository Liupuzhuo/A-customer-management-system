package com.example.domain.model;

import java.util.*;
import com.example.domain.entity.*;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * 项目列表查询sql-分页
 */
public class PageOfdataQueryPzvq {
   /**
    * total
    */
   @JsonProperty("total")
   private Integer total;
   
   /**
    * list
    */
   @JsonProperty("list")
   private List<AnonymousModelDataQueryPzvq> list;
   
   /**
    * 默认字段
    */
   @JsonProperty("defaultFieldAchf")
   private String defaultFieldAchf;
   
   public Integer getTotal() {
      return total;
   }

   public void setTotal(Integer total) {
      this.total = total;
   }
   public List<AnonymousModelDataQueryPzvq> getList() {
      return list;
   }

   public void setList(List<AnonymousModelDataQueryPzvq> list) {
      this.list = list;
   }
   public String getDefaultFieldAchf() {
      return defaultFieldAchf;
   }

   public void setDefaultFieldAchf(String defaultFieldAchf) {
      this.defaultFieldAchf = defaultFieldAchf;
   }
}
