package com.pet.projects.explainLikeIAmFive.controller;

import com.pet.projects.explainLikeIAmFive.dto.ApiResponse;
import com.pet.projects.explainLikeIAmFive.service.ExplainMeService;
import jakarta.validation.constraints.NotNull;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/explain")
public class ExplainController {
    private final ExplainMeService explainMeService;

    public ExplainController(ExplainMeService explainMeService) {
        this.explainMeService = explainMeService;
    }

    @PostMapping("/likeIAmFive")
    public ResponseEntity<ApiResponse> explainMe(@NotNull @RequestBody String topic) {
        ApiResponse response = new ApiResponse();
        response.setMessage(explainMeService.explainMe(topic));
        response.setTopic(topic);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
