package com.example.domain.model;

import java.util.*;
import com.example.domain.entity.*;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * 数据查询-分页模型
 */
public class PageOfdataQueryUuvb {
   /**
    * total
    */
   @JsonProperty("total")
   private Integer total;
   
   /**
    * list
    */
   @JsonProperty("list")
   private List<AnonymousModelDataQueryUuvb> list;
   
   public Integer getTotal() {
      return total;
   }

   public void setTotal(Integer total) {
      this.total = total;
   }
   public List<AnonymousModelDataQueryUuvb> getList() {
      return list;
   }

   public void setList(List<AnonymousModelDataQueryUuvb> list) {
      this.list = list;
   }
}
