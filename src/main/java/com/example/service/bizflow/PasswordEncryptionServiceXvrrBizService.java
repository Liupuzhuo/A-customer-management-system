package com.example.service.bizflow;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.apache.commons.lang3.ObjectUtils;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import org.apache.commons.lang3.ObjectUtils;
import java.util.*;
import java.time.*;
import java.time.format.*;
import com.example.service.*;
import com.example.common.util.*;
import com.example.common.exception.*;
import com.example.domain.constant.*;
import com.example.domain.entity.*;
import com.example.domain.model.*;
import com.example.mapper.*;

/**
 * 密码加密服务
 */
@Service
public class PasswordEncryptionServiceXvrrBizService {
      
    private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());

    /**
     * 加密流程
     * @param parametersBeforeEncryptionZoxb 加密前的参数
     * @return 加密后的参数
     */
    public String encryptionProcessSzim(String parametersBeforeEncryptionZoxb){
        String encryptedParametersXwlv = "";

        // MD5加密
        String md5EncryptionTjeo = BizFunctionUtil.md5Hash(parametersBeforeEncryptionZoxb, "LowerCase32");
        // MD5加密1
        String md5EncryptionQeic = BizFunctionUtil.md5Hash(md5EncryptionTjeo+"11s", "LowerCase32");        
        // 赋值 
        encryptedParametersXwlv = md5EncryptionQeic;
        
        return encryptedParametersXwlv;
    }

}
 