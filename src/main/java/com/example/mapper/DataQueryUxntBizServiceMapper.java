package com.example.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import com.example.domain.entity.*;
import com.example.domain.model.*;

/**
 * 数据查询  A8A8F7C0D7D9466BA464532DB0FC016E
 */
@Mapper
public interface DataQueryUxntBizServiceMapper {
      
   List<AnonymousModelDataQueryUxnt> listAnonymousModelDataQueryUxnt();
   Long countAnonymousModelDataQueryUxnt();

}
 