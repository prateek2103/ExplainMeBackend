package com.pet.projects.explainLikeIAmFive.service.impl;

import com.pet.projects.explainLikeIAmFive.dto.Message;
import com.pet.projects.explainLikeIAmFive.dto.OpenAIRequest;
import com.pet.projects.explainLikeIAmFive.dto.OpenAIResponse;
import com.pet.projects.explainLikeIAmFive.service.OpenAIService;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

import static com.pet.projects.explainLikeIAmFive.constants.ExplainMeConstants.*;

@Service
public class OpenAIServiceImpl implements OpenAIService {
    private final RestTemplate restTemplate;
    private final String apiKey;
    public OpenAIServiceImpl(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
        this.apiKey = System.getenv("OPEN_AI_API_KEY");;
    }

    @Override
    public OpenAIResponse getCompletions(String topic) {
        HttpHeaders headers = new HttpHeaders();
        headers.set("Authorization", "Bearer " + apiKey);
        headers.set("Content-Type", "application/json");

        OpenAIRequest request = prepareOpenAIRequest(topic);
        return restTemplate
                .exchange(OPEN_AI_URI, HttpMethod.POST, new HttpEntity<>(request, headers),
                        OpenAIResponse.class)
                .getBody();
    }

    private OpenAIRequest prepareOpenAIRequest(String topic) {
        Message systemMessage = new Message(ROLE_TYPE_SYSTEM, SYSTEM_ROLE_CONTENT);
        Message userMessage = new Message(ROLE_TYPE_USER, topic);
        List<Message> messages = Arrays.asList(systemMessage, userMessage);

        OpenAIRequest request = new OpenAIRequest();
        request.setMessages(messages);

        return request;
    }
}
