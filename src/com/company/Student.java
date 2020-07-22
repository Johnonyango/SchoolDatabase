package com.company;


public class Student {
    private String name;
    private int english;
    private int maths;
    private int averageGrade;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public int getGrade1() {
        return english;
    }
    public void setGrade1(int grade1) {
        this.english = english;
    }
    public int getGrade2() {
        return maths;
    }
    public void setGrade2(int grade1) {
        this.maths = maths;
    }
    public double getAverage() {
        return averageGrade;
    }

    public void setAverage(double average) {
        this.averageGrade = averageGrade;
    }

    public double calculateAverage() {
        return (english + maths) / 2;
    }

}