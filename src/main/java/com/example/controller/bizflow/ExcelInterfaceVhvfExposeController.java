package com.example.controller.bizflow;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.apache.commons.lang3.ObjectUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import io.swagger.v3.oas.annotations.tags.Tag;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import java.util.*;
import java.time.*;
import java.time.format.*;
import com.example.service.*;
import com.example.service.bizflow.*;
import com.example.mapper.*;
import com.example.domain.constant.*;
import com.example.common.result.Resp;
import com.example.domain.model.*;
import com.example.common.util.*;
import com.example.domain.entity.*;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.service.bizflow.ExportBusinessFlowNzsbBizService;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
import java.io.ByteArrayOutputStream;
import com.alibaba.excel.EasyExcel;

@Tag(name = "excel接口")
@RequestMapping("/excel")
@RestController
public class ExcelInterfaceVhvfExposeController {
      
    private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private ExportBusinessFlowNzsbBizService exportBusinessFlowNzsbService;

    
    /**
     * excel导出 
     * @return
     */
    @GetMapping("/aggQuery/excelExportMzjb")
    public ResponseEntity<byte[]> excelExportOiwx() {
        byte outputParametersPimq = 0;
        var callingExcelExportJfti =  exportBusinessFlowNzsbService.excelExportMzjb();
        String filename = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMddHHmmss")) + ".xlsx";
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        EasyExcel.write(outputStream, AnonymousModelDataQueryKbap.class).sheet("导出数据").doWrite(callingExcelExportJfti);

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);
        // headers.setContentType(MediaType.valueOf("application/vnd.openxmlformats-officedocument.spreadsheetml.sheet"));
        headers.setContentDispositionFormData("attachment", filename);
        return ResponseEntity.ok()
              .headers(headers)
              .body(outputStream.toByteArray());
    }
}
 