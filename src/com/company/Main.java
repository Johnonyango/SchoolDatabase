package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        System.out.println("You want to view teacher or student? \nA.student  \nB.Teacher ");
        Scanner sc=new Scanner(System.in);//Gets either the teacher or student input.
        char n= sc.next().charAt(0);
        if (n == 'A') {

            //Managing a list of students
            List<Student> studentList = new ArrayList<>();
            Scanner input = new Scanner(System.in);
            int english, maths;
            String studentName;
            int choice;
            do {
                Student student = new Student();

                System.out.println("student name: ");
                studentName = input.next();
                student.setName(studentName);

                System.out.println("first grade: ");//Integers only
                english = input.nextInt();
                student.setGrade1(english);

                System.out.println("second grade: ");//Integers only
                maths = input.nextInt();
                student.setGrade2(maths);


                System.out.println(" Add more students? Enter 1 or 2 ");
                System.out.print(" 1. YES     2. NO ");
                choice = input.nextInt();

                student.setAverage(student.calculateAverage());

                studentList.add(student);

            }
            while (choice != 2);

            //Get student object with the higher average
            Student higherStudent = Collections.max(studentList, Comparator.comparing(c -> c.getAverage()));

            System.out.println("Highest average score :" + higherStudent.getAverage() + "\n Student with the highest score is: " + higherStudent.getName());
        }
        else if (n == 'B') {

//            Managing the teachers' list
            Teachers teachers = new Teachers();
            System.out.println("What do you want to do? \n" +
                    "1. Add \n" +
                    "2. View \n" +
                    "3. Delete \n" +
                    "4. Back");
            Scanner scanner = new Scanner(System.in);
            int num = scanner.nextInt();
            if (num == 1)
                teachers.add();
            else if ((num == 2) && (num ==4))
                teachers.view();
            else if (num == 3)
                teachers.delete();
            }
    }
}
