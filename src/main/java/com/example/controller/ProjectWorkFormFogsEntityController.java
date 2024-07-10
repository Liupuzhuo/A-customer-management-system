package com.example.controller;

import com.example.common.pagination.PageResult;
import com.example.common.pagination.Pagination;
import com.example.common.result.Resp;
import com.example.domain.entity.ProjectWorkFormFogsEntity;
import com.example.domain.model.ProjectWorkFormFogsEntityDTO;
import com.example.service.ProjectWorkFormFogsEntityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import io.swagger.v3.oas.annotations.tags.Tag;

import java.util.List;

@Tag(name = "projectWorkFormFogs")
@RestController
public class ProjectWorkFormFogsEntityController {

    @Autowired
    private ProjectWorkFormFogsEntityService projectWorkFormFogsService;

 





}
