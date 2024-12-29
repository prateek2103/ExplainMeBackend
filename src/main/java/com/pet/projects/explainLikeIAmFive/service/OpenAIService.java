package com.pet.projects.explainLikeIAmFive.service;

import com.pet.projects.explainLikeIAmFive.dto.OpenAIResponse;

public interface OpenAIService {
    public OpenAIResponse getCompletions(String topic);
}
