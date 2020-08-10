package com.company;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class TeacherDB {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Teachers teachers = new Teachers();
        String url = "jdbc:mysql://localhost:3306/database1?useSSL=false";
        String uname = "root";
        String pas = "password";


        int id = teachers.getId();
        String name = teachers.getName();
        String subject = teachers.subject;
        String query = "insert into teacher values (?,?,?);";

        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection(url,uname,pas);
        PreparedStatement st = con.prepareStatement(query);
        st.setInt(1, id);
        st.setString(2,name);
        st.setString(3, subject);
        st.setString(3,name);
        int count = st.executeUpdate();

        System.out.println(count + "row(s) affected");
        st.close();
        con.close();
    }
}
