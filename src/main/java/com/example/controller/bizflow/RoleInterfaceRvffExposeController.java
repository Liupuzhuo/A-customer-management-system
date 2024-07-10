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
import com.example.service.bizflow.QueryRoleBusinessKbcpBizService;
import com.example.service.bizflow.UserServicesRjziBizService;

@Tag(name = "角色接口")
@RequestMapping("/app/search")
@RestController
public class RoleInterfaceRvffExposeController {
      
    private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private QueryRoleBusinessKbcpBizService queryRoleBusinessKbcpService;

    @Autowired
    private UserServicesRjziBizService userServicesRjziService;

    @Autowired
    private PurviewRelevancyEntityService purviewRelevancyEntityService;

    
    /**
     * 查询角色信息 
     * @return
     */
    @GetMapping("/queryRoleInformationPqcj")
    public ResponseEntity<List<AnonymousModelDataQueryHhis>> queryRoleInformationTqzy() {
        List<AnonymousModelDataQueryHhis> outputParametersClkr = new ArrayList<>();
        var callToQueryRoleInformationBmke =  queryRoleBusinessKbcpService.queryRoleInformationPqcj();        
        // 赋值-查询角色信息 
        outputParametersClkr = callToQueryRoleInformationBmke;

        return ResponseEntity.ok(outputParametersClkr);
    }
    
    /**
     * 查询用户绑定的角色列表 
     * @param userId userId
     * @param currentPageNumberVuvd 当前页码
     * @param numberOfPagesBxpi 页面条数
     * @return
     */
    @GetMapping("/aggQuery/queryTheListOfRolesBoundByUsersFyme")
    public ResponseEntity<String> queryTheListOfRolesBoundByUsersXppi(@RequestParam(required = false) Long userId,@RequestParam() Integer currentPageNumberVuvd,@RequestParam(required = false) Integer numberOfPagesBxpi) {
        String outputParametersJjxx = "";
        var callToQueryTheListOfRolesBoundByTheUserQdrp =  queryRoleBusinessKbcpService.queryTheListOfRolesBoundByUsersFyme(userId,currentPageNumberVuvd,numberOfPagesBxpi);        
        // 赋值-查询用户绑定的角色列表 
        outputParametersJjxx = callToQueryTheListOfRolesBoundByTheUserQdrp;

        return ResponseEntity.ok(outputParametersJjxx);
    }
    
    /**
     * 根据用户id和角色id删除角色信息 
     * @param useridFwkk userId
     * @param roleidYvvt roleId
     * @return
     */
    @DeleteMapping("/aggQuery/deleteRoleInformationBasedOnUserIdAndRoleIdIamv")
    public ResponseEntity<Integer> deleteRoleInformationBasedOnUserIdAndRoleIdWvpr(@RequestParam(required = false) Long useridFwkk,@RequestParam(required = false) Long roleidYvvt) {
        Integer outputParametersYptt = null;
        var callToDeleteRoleInformationBasedOnUserIdAndRoleIdGryo =  userServicesRjziService.deleteRoleInformationBasedOnUserIdAndRoleIdIamv(useridFwkk,roleidYvvt);        
        // 赋值-根据用户id和角色id删除角色信息 
        outputParametersYptt = callToDeleteRoleInformationBasedOnUserIdAndRoleIdGryo;

        return ResponseEntity.ok(outputParametersYptt);
    }
    
    /**
     * 查询角色列表信息分页 
     * @param currentPageNumberJsli 当前页码
     * @param pageSizeMruf 页码大小
     * @return
     */
    @GetMapping("/aggQuery/queryRoleListInformationPaginationTmjy")
    public ResponseEntity<PageOfdataQueryWktb> queryRoleListInformationPaginationOsby(@RequestParam(required = false) Integer currentPageNumberJsli,@RequestParam(required = false) Integer pageSizeMruf) {
        PageOfdataQueryWktb outputParametersJtgb = new PageOfdataQueryWktb();
        var callToQueryRoleListInformationPaginationWipn =  queryRoleBusinessKbcpService.queryRoleListInformationPaginationTmjy(currentPageNumberJsli,pageSizeMruf);        
        // 赋值-查询角色列表信息分页 
        outputParametersJtgb = callToQueryRoleListInformationPaginationWipn;

        return ResponseEntity.ok(outputParametersJtgb);
    }
    
    /**
     * 根据角色和权限删除记录 
     * @param roleIdNrns 角色ID
     * @param permissionIdEfyf 权限ID
     * @return
     */
    @PostMapping("/exposeInterfaceMethodsPvvs")
    public ResponseEntity<Void> deleteRecordsBasedOnRolesAndPermissionsMaqi(@RequestParam(required = false) Long roleIdNrns,@RequestParam(required = false) Long permissionIdEfyf) {
        QueryWrapper<PurviewRelevancyEntity> dataDeletionIagfEntityDeleteWrapper = new QueryWrapper<>();
        
        dataDeletionIagfEntityDeleteWrapper.or(wrapper ->
          wrapper.eq("role_id", roleIdNrns)
        .and(wrapper1 -> wrapper1.eq("purview_id", permissionIdEfyf))
        );

        var dataDeletionIagf = purviewRelevancyEntityService.getBaseMapper().delete(dataDeletionIagfEntityDeleteWrapper);

        return ResponseEntity
              .ok()
              .build();
    }
}
 