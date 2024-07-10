package com.example.domain.model;

import java.util.*;
import com.example.domain.entity.*;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * 已存在的角色数据查询
 */
public class AnonymousModelDataQueryBtfm {
   /**
    * id
    */
   @JsonProperty("id")
   private Long id;
   
   public Long getId() {
      return id;
   }

   public void setId(Long id) {
      this.id = id;
   }
}
