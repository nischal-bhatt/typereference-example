package com.example.demo.model;

import java.io.Serializable;

public class MyClass <T> implements Serializable {
    private String result;
    private T genericValue;

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public T getGenericValue() {
        return genericValue;
    }

    public void setGenericValue(T genericValue) {
        this.genericValue = genericValue;
    }
}
