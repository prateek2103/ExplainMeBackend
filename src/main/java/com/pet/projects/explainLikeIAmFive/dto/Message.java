package com.pet.projects.explainLikeIAmFive.dto;

public class Message {
    private String role;

    public String getRole() {
        return role;
    }

    public Message(String role, String content) {
        this.role = role;
        this.content = content;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    private String content;
}

