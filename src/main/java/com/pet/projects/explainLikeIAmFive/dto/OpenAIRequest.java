package com.pet.projects.explainLikeIAmFive.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

import static com.pet.projects.explainLikeIAmFive.constants.ExplainMeConstants.*;

public class OpenAIRequest {
    private String model = GPT_MODEL;

    private List<Message> messages;

    private double temperature = DEFAULT_MODEL_TEMP;

    @JsonProperty("max_tokens")
    private int maxTokens = DEFAULT_MAX_TOKENS;

    @JsonProperty("top_p")
    private double topP = DEFAULT_MODEL_TOP_P;

    @JsonProperty("frequency_penalty")
    private double frequencyPenalty = DEFAULT_MODEL_FP;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public List<Message> getMessages() {
        return messages;
    }

    public void setMessages(List<Message> messages) {
        this.messages = messages;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public int getMaxTokens() {
        return maxTokens;
    }

    public void setMaxTokens(int maxTokens) {
        this.maxTokens = maxTokens;
    }

    public double getTopP() {
        return topP;
    }

    public void setTopP(double topP) {
        this.topP = topP;
    }

    public double getFrequencyPenalty() {
        return frequencyPenalty;
    }

    public void setFrequencyPenalty(double frequencyPenalty) {
        this.frequencyPenalty = frequencyPenalty;
    }

    public double getPresencePenalty() {
        return presencePenalty;
    }

    public void setPresencePenalty(double presencePenalty) {
        this.presencePenalty = presencePenalty;
    }

    @JsonProperty("presence_penalty")
    private double presencePenalty = DEFAULT_MODEL_PP;
}
