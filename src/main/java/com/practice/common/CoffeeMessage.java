package com.practice.common;

import java.io.Serializable;

public class CoffeeMessage implements Serializable{

    private static final long serialVersionUID = 123123123124L;

    private String status;
    private String message;

    public CoffeeMessage() {
    }

    public CoffeeMessage(String status, String message) {
        this.status = status;
        this.message = message;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
