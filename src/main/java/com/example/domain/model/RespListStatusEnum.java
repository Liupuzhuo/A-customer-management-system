package com.example.domain.model;

import java.util.*;
import com.example.domain.entity.*;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * RespListStatus_enum
 */
public class RespListStatusEnum {
   /**
    * code返回码
    */
   @JsonProperty("code")
   private String code;
   
   /**
    * success是否成功
    */
   @JsonProperty("success")
   private String success;
   
   /**
    * message消息
    */
   @JsonProperty("message")
   private String message;
   
   /**
    * data数据载体
    */
   @JsonProperty("data")
   private Integer data;
   
   public String getCode() {
      return code;
   }

   public void setCode(String code) {
      this.code = code;
   }
   public String getSuccess() {
      return success;
   }

   public void setSuccess(String success) {
      this.success = success;
   }
   public String getMessage() {
      return message;
   }

   public void setMessage(String message) {
      this.message = message;
   }
   public Integer getData() {
      return data;
   }

   public void setData(Integer data) {
      this.data = data;
   }
}
