package com.pet.projects.explainLikeIAmFive.service.impl;

import com.pet.projects.explainLikeIAmFive.dto.OpenAIResponse;
import com.pet.projects.explainLikeIAmFive.service.ExplainMeService;
import com.pet.projects.explainLikeIAmFive.service.OpenAIService;
import org.springframework.stereotype.Service;

@Service
public class ExplainMeServiceImpl implements ExplainMeService {

    private final OpenAIService openAIService;

    public ExplainMeServiceImpl(OpenAIService openAIService) {
        this.openAIService = openAIService;
    }

    @Override
    public String explainMe(String topic) {
        OpenAIResponse response = openAIService.getCompletions(topic);
        return response.getChoices().get(0).getMessage().getContent();
    }
}
