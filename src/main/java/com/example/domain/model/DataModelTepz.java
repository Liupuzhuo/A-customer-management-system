package com.example.domain.model;

import java.util.*;
import com.example.domain.entity.*;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * 数据模型
 */
public class DataModelTepz {
   /**
    * id
    */
   @JsonProperty("idZspq")
   private Long idZspq;
   
   /**
    * 编码
    */
   @JsonProperty("codingXlnn")
   private String codingXlnn;
   
   /**
    * 名称
    */
   @JsonProperty("nameFjiz")
   private String nameFjiz;
   
   public Long getIdZspq() {
      return idZspq;
   }

   public void setIdZspq(Long idZspq) {
      this.idZspq = idZspq;
   }
   public String getCodingXlnn() {
      return codingXlnn;
   }

   public void setCodingXlnn(String codingXlnn) {
      this.codingXlnn = codingXlnn;
   }
   public String getNameFjiz() {
      return nameFjiz;
   }

   public void setNameFjiz(String nameFjiz) {
      this.nameFjiz = nameFjiz;
   }
}
