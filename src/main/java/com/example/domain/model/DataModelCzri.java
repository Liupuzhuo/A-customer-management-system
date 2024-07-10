package com.example.domain.model;

import java.util.*;
import com.example.domain.entity.*;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * 数据模型
 */
public class DataModelCzri {
   /**
    * id
    */
   @JsonProperty("idVmed")
   private Long idVmed;
   
   public Long getIdVmed() {
      return idVmed;
   }

   public void setIdVmed(Long idVmed) {
      this.idVmed = idVmed;
   }
}
