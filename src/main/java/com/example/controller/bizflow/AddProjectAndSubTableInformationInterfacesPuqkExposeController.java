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
import com.example.service.bizflow.ProjectListCrudServiceSgcsBizService;

@Tag(name = "新增项目和子表信息接口")
@RequestMapping("/")
@RestController
public class AddProjectAndSubTableInformationInterfacesPuqkExposeController {
      
    private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private ProjectListCrudServiceSgcsBizService projectListCrudServiceSgcsService;

    
    /**
     * 添加项目信息和子表信息 
     * @param entryNameYdav 项目名称
     * @param taskTypeZsxx 任务类型
     * @param projectManagerPcms 项目经理
     * @param homepageTaskStatusUaul 主页任务状态
     * @param intendedEnclaveNfry 意向飞地
     * @param remarksAjjp 备注
     * @param responsiblePersonSvjs 负责人
     * @param dateTgrl 日期
     * @param subtableTaskStatusNspp 子表任务状态
     * @param projectDebriefingDkzs 项目进展
     * @return
     */
    @GetMapping("/aggQuery/addProjectInformationAndSubtableInformationSrmg")
    public ResponseEntity<Long> addProjectInformationAndSubtableInformationKdtp(@RequestParam(required = false) String entryNameYdav,@RequestParam(required = false) String taskTypeZsxx,@RequestParam(required = false) String projectManagerPcms,@RequestParam(required = false) String homepageTaskStatusUaul,@RequestParam(required = false) String intendedEnclaveNfry,@RequestParam(required = false) String remarksAjjp,@RequestParam(required = false) String responsiblePersonSvjs,@RequestParam(required = false) java.time.LocalDate dateTgrl,@RequestParam(required = false) String subtableTaskStatusNspp,@RequestParam(required = false) String projectDebriefingDkzs) {
        Long outputParametersIxhx = 0L;
        var callToAddProjectInformationAndSubTableInformationYspm =  projectListCrudServiceSgcsService.addProjectInformationAndSubtableInformationSrmg(entryNameYdav,taskTypeZsxx,projectManagerPcms,homepageTaskStatusUaul,intendedEnclaveNfry,remarksAjjp,responsiblePersonSvjs,dateTgrl,subtableTaskStatusNspp,projectDebriefingDkzs);
        return ResponseEntity.ok(outputParametersIxhx);
    }
    
    /**
     * 修改主表/添加子表信息业务流 
     * @param projectIdYawo 项目id
     * @param entryNameBicu 项目名称
     * @param taskTypeBiyu 任务类型
     * @param homepageTaskStatusPneq 主页任务状态
     * @param intendedEnclaveZefc 意向飞地
     * @param remarksOdtx 备注
     * @param responsiblePersonLxyy 负责人
     * @param dateOpvo 日期
     * @param subtableTaskStatusAshb 子表任务状态
     * @param dockingProgressJbxd 对接进展
     * @param projectManagerYhhh 项目经理
     * @return
     */
    @GetMapping("/aggQuery/modifyMainTableAddSubTableInformationBusinessFlowPrhj")
    public ResponseEntity<Long> modifyMainTableAddSubTableInformationBusinessFlowO(@RequestParam(required = false) Long projectIdYawo,@RequestParam(required = false) String entryNameBicu,@RequestParam(required = false) String taskTypeBiyu,@RequestParam(required = false) String homepageTaskStatusPneq,@RequestParam(required = false) String intendedEnclaveZefc,@RequestParam(required = false) String remarksOdtx,@RequestParam(required = false) String responsiblePersonLxyy,@RequestParam(required = false) java.time.LocalDate dateOpvo,@RequestParam(required = false) String subtableTaskStatusAshb,@RequestParam(required = false) String dockingProgressJbxd,@RequestParam(required = false) String projectManagerYhhh) {
        Long outputParametersOwcu = 0L;
        var callToModifyTheMainTableAddSubTableInformationBusinessFlowZsbj =  projectListCrudServiceSgcsService.modifyMainTableAddSubTableInformationBusinessFlowPrhj(projectIdYawo,entryNameBicu,taskTypeBiyu,homepageTaskStatusPneq,intendedEnclaveZefc,remarksOdtx,responsiblePersonLxyy,dateOpvo,subtableTaskStatusAshb,dockingProgressJbxd,projectManagerYhhh);        
        // 赋值-修改主表/添加子表信息业务流 
        outputParametersOwcu = callToModifyTheMainTableAddSubTableInformationBusinessFlowZsbj;

        return ResponseEntity.ok(outputParametersOwcu);
    }
}
 