package com.example.domain.model;

import java.util.*;
import com.example.domain.entity.*;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * 数据查询-分页模型2
 */
public class PageOfdataQueryCgiv {
   /**
    * total
    */
   @JsonProperty("total")
   private Integer total;
   
   /**
    * list
    */
   @JsonProperty("list")
   private List<AnonymousModelDataQueryCgiv> list;
   
   public Integer getTotal() {
      return total;
   }

   public void setTotal(Integer total) {
      this.total = total;
   }
   public List<AnonymousModelDataQueryCgiv> getList() {
      return list;
   }

   public void setList(List<AnonymousModelDataQueryCgiv> list) {
      this.list = list;
   }
}
