package com.example.domain.model;

import java.util.*;
import com.example.domain.entity.*;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * 用户条件查询-分页
 */
public class PageOfaggregatedQueryZtul {
   /**
    * total
    */
   @JsonProperty("total")
   private Integer total;
   
   /**
    * list
    */
   @JsonProperty("list")
   private List<AnonymousModelAggregatedQueryZtul> list;
   
   public Integer getTotal() {
      return total;
   }

   public void setTotal(Integer total) {
      this.total = total;
   }
   public List<AnonymousModelAggregatedQueryZtul> getList() {
      return list;
   }

   public void setList(List<AnonymousModelAggregatedQueryZtul> list) {
      this.list = list;
   }
}
