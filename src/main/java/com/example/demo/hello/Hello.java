package com.example.demo.hello;

public class Hello {
    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "Hello{" +
                "message='" + message + '\'' +
                '}';
    }

    public Hello(String message) {
        this.message = message;
    }
}
