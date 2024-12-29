package com.pet.projects.explainLikeIAmFive.config;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ExplainMeConfig {

    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder) {
        return new RestTemplate();
    }
}
