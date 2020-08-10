package com.company;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class StudentDB {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Student student = new Student();
        String url = "jdbc:mysql://localhost:3306/database1?useSSL=false";
        String uname = "root";
        String pas = "password";


        int grade1 = student.getGrade1();
        int grade2 = student.getGrade2();
        String name = student.getName();
        String query = "insert into student values (?,?,?);";

        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection(url,uname,pas);
        PreparedStatement st = con.prepareStatement(query);
        st.setInt(1, grade1);
        st.setInt(2, grade2);
        st.setString(3,name);
        int count = st.executeUpdate();

        System.out.println(count + "row(s) affected");
        st.close();
        con.close();
    }
}
