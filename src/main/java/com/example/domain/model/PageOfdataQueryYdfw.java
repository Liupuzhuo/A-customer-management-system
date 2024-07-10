package com.example.domain.model;

import java.util.*;
import com.example.domain.entity.*;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * 数据查询-分页模型3
 */
public class PageOfdataQueryYdfw {
   /**
    * total
    */
   @JsonProperty("total")
   private Integer total;
   
   /**
    * list
    */
   @JsonProperty("list")
   private List<AnonymousModelDataQueryYdfw> list;
   
   public Integer getTotal() {
      return total;
   }

   public void setTotal(Integer total) {
      this.total = total;
   }
   public List<AnonymousModelDataQueryYdfw> getList() {
      return list;
   }

   public void setList(List<AnonymousModelDataQueryYdfw> list) {
      this.list = list;
   }
}
