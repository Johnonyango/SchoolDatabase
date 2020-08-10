package com.company;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class TeacherDB {
    public static void getTeachersData() throws ClassNotFoundException, SQLException {
        Teachers teachers = new Teachers();
        String url = "jdbc:mysql://localhost:3306/school?useSSL=false";
        String uname = "root";
        String pas = "password";


        int id = teachers.getId();
        String teacher_name = teachers.getName();
        String subject = teachers.subject;
        String query = "insert into teachers values (?,?,?);";

        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection(url,uname,pas);
        PreparedStatement st = con.prepareStatement(query);
        st.setInt(1, id);
        st.setString(2,teacher_name);
        st.setString(3, subject);
        int count = st.executeUpdate();

        System.out.println(count + "row(s) affected");
        st.close();
        con.close();
    }
}
