package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        System.out.print("You want to view teacher or student? A.student  B.Teacher");
        Scanner sc=new Scanner(System.in);//Gets either the teacher or student input, case sensitive
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

                System.out.println(" student name: ");
                studentName = input.next();
                student.setName(studentName);

                System.out.println(" --Please enter the first grade: ");//Integers only
                english = input.nextInt();
                student.setGrade1(english);

                System.out.println(" --Please enter the the second grade: ");//Integers only
                maths = input.nextInt();
                student.setGrade2(maths);


                System.out.println(" Continue? Enter 1 or 2 ");
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
            Collection<Teachers> teachers = new LinkedList<>();
            Scanner scanner = new Scanner(System.in);
            int numberOfTeachers = 5;
            while(numberOfTeachers > 0){
                Teachers teacher = new Teachers();
                System.out.println("Enter teacher's name: ");
                teacher.setId(scanner.nextLine());
                System.out.println("Enter teacher's id: ");
                teacher.setSubject(scanner.nextLine());
                System.out.println("Enter Subject: ");
                teacher.setName(scanner.nextLine());
                teachers.add((Teachers) teachers);
                numberOfTeachers --;
            }
        }

    }
}

        // Assignment
        // 1. Manage a list of students
        // 2. Manage a list of teachers
        // 3. Manage results for each of the students (per subject, and the teachers for the respective subjects)
        // Output should be a working program (console application) to capture all the above (register the objects) and provide manipulative
        // functions for the same
        // - Design - correct use of data types and structures
        // - Use of OOP principles and concepts