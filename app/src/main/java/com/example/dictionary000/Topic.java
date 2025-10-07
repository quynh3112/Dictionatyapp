package com.example.dictionary000;

public class Topic {
    private  int id;
    private String name;
    public Topic(int id,String name){
        this.id=id;
        this.name=name;

    }
    public Topic(){}

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
