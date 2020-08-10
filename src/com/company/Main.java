package com.company;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        System.out.println("You want to view teacher or student? \nA.student  \nB.Teacher ");
        Scanner sc=new Scanner(System.in);//Gets either the teacher or student input.
        char n= sc.next().charAt(0);
        if (n == 'A') {

            //Managing a list of students
            List<com.john.Student> studentList = new ArrayList<>();
            com.john.StudentDB.getStudentData();
        }
        else if (n == 'B') {

//            Managing the teachers' list
            Teachers teachers = new Teachers();
            System.out.println("What do you want to do? \n" +
                    "1. Add \n" +
                    "2. View \n" +
                    "3. Delete \n" +
                    "4. Assign Subject\n" +
                    "5. Back");
            Scanner scanner = new Scanner(System.in);
            int num = scanner.nextInt();
            if (num == 1)
                TeacherDB.getTeachersData();
            else if ((num == 2) && (num ==5))
                teachers.view();
            else if (num == 3)
                teachers.delete();
            else if (num == 4)
                teachers.assignSubject();
        }
    }
}
