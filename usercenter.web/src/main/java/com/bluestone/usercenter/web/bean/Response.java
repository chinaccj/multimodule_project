package com.bluestone.usercenter.web.bean;

/**
 * Created by yumo on 16/7/29.
 */
public class Response {

    public Response(String message){
        this.message = message;
    }

    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
