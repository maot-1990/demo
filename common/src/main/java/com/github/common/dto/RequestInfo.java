package com.github.common.dto;

public class RequestInfo {

    private String key;
    private String name;
    private String content;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Object getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "RequestInfo{" +
                "key='" + key + '\'' +
                ", name='" + name + '\'' +
                ", content='" + content +
                "'}";
    }
}
