package com.example.domain.model;

import java.util.*;
import com.example.domain.entity.*;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * 角色权限查询-分页
 */
public class PageOfaggregatedQuerySuyk {
   /**
    * total
    */
   @JsonProperty("total")
   private Integer total;
   
   /**
    * list
    */
   @JsonProperty("list")
   private List<AnonymousModelAggregatedQuerySuyk> list;
   
   public Integer getTotal() {
      return total;
   }

   public void setTotal(Integer total) {
      this.total = total;
   }
   public List<AnonymousModelAggregatedQuerySuyk> getList() {
      return list;
   }

   public void setList(List<AnonymousModelAggregatedQuerySuyk> list) {
      this.list = list;
   }
}
