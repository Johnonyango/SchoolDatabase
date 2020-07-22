package com.company;

import org.junit.Test;

import static org.junit.Assert.*;

public class StudentTest {
    @Test
    public void setMarks() {

        int marks=70;
        assertEquals(70, marks);

    }
    @Test
    public void setGrade() {

        char b='a';
        assertEquals('a', b);


    }
}