package com.example.demo.entity;

import com.google.gson.Gson;

public class HttpResult<T> {

    private int code;
    private String msg;
    private T data;

    public HttpResult(int code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}
