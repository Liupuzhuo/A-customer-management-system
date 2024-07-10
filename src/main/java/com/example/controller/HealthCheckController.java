package com.example.controller;

import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Tag(name = "健康检查")
@RestController
public class HealthCheckController {

    /**
     * health
     * @return
     */
    @GetMapping("/health")
    public ResponseEntity<Integer> health() {
        return ResponseEntity.ok(200);
    }
}
