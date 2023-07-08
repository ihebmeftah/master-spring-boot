package com.example.demo.todo;

import java.time.LocalDate;

public class Todo {
    private int id;
    private String username;
    private String desc;
    private LocalDate date;
    private boolean done;

    public Todo(int id, String username, String desc, LocalDate date, boolean done) {
        super();

        this.id = id;
        this.username = username;
        this.desc = desc;
        this.date = date;
        this.done = done;
    }

    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getDesc() {
        return desc;
    }

    public LocalDate getDate() {
        return date;
    }

    public boolean isDone() {
        return done;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    @Override
    public String toString() {
        return "Todo [id=" + id + ", username=" + username + ", desc=" + desc + ", date=" + date + ", done=" + done
                + "]";
    }

}
