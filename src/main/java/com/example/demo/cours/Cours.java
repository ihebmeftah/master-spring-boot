package com.example.demo.cours;

public class Cours {
    private long id;
    private String name;
    private String author;
 
    public Cours(long id, String name, String author) {
        this.id = id;
        this.name = name;
        this.author = author;
    }
    public long getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getAuthor() {
        return author;
    }
    @Override
    public String toString() {
        return "Cours [id=" + id + ", name=" + name + ", author=" + author + "]";
    }
    public void setId(long id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAuthor(String author) {
        this.author = author;
    }

}
