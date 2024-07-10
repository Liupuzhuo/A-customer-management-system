package com.example.domain.model;

import java.util.*;
import com.example.domain.entity.*;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * 已存在的角色数据查询-分页
 */
public class PageOfdataQueryBtfm {
   /**
    * total
    */
   @JsonProperty("total")
   private Integer total;
   
   /**
    * list
    */
   @JsonProperty("list")
   private List<AnonymousModelDataQueryBtfm> list;
   
   public Integer getTotal() {
      return total;
   }

   public void setTotal(Integer total) {
      this.total = total;
   }
   public List<AnonymousModelDataQueryBtfm> getList() {
      return list;
   }

   public void setList(List<AnonymousModelDataQueryBtfm> list) {
      this.list = list;
   }
}
