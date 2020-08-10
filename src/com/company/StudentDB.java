package com.john;


import java.sql.*;
import java.util.Scanner;

public class StudentDB {
    public static void getStudentData() throws ClassNotFoundException, SQLException {
        Scanner sc = new Scanner(System.in);
        String url = "jdbc:mysql://localhost:3306/school?useSSL=false";
        String uname = "root";
        String pas = "password";
        System.out.println("Enter name");
        String name = sc.next();
        System.out.println("Enter grade1");
        int grade1 = sc.nextInt();
        System.out.println("Enter grade2");
        int grade2 = sc.nextInt();
        String query = "insert into users values (?,?,?);";


        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection(url,uname,pas);
        PreparedStatement st = con.prepareStatement(query);
        st.setString(1,name);
        st.setInt(2, grade1);
        st.setInt(3, grade2);
        int count = st.executeUpdate();

        System.out.println(count + " Student added to the database successfully");
        st.close();
        con.close();
    }
}

