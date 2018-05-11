package com.github.common.dto;

public class ResponseInfo {

    private String code;
    private String msg;
    private String status;
    private String context;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Object getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    @Override
    public String toString() {
        return "ResponseInfo{" +
                "code='" + code + '\'' +
                ", msg='" + msg + '\'' +
                ", status='" + status + '\'' +
                ", context='" + context +
                "'}";
    }
}
