package com.company;

public class Teachers {
    private String name;
    private int id;
    private String subject;



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public int getSubject() {
        return id;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
    @Override
    public String toString() {
        return "[" + this.id + ", " + this.name + this.subject + "]";
    }

}