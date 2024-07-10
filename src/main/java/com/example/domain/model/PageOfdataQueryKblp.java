package com.example.domain.model;

import java.util.*;
import com.example.domain.entity.*;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * 数据查询-分页
 */
public class PageOfdataQueryKblp {
   /**
    * total
    */
   @JsonProperty("total")
   private Integer total;
   
   /**
    * list
    */
   @JsonProperty("list")
   private List<AnonymousModelDataQueryKblp> list;
   
   public Integer getTotal() {
      return total;
   }

   public void setTotal(Integer total) {
      this.total = total;
   }
   public List<AnonymousModelDataQueryKblp> getList() {
      return list;
   }

   public void setList(List<AnonymousModelDataQueryKblp> list) {
      this.list = list;
   }
}
