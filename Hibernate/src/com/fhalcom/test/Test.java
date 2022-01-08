package com.fhalcom.test;
import java.sql.Connection;
import java.sql.DriverManager;

public class Test{
    public static void main(String[] args) {
        //jdbc:driver://ip:port/dbname
        String jdbcUrl = "jdbc:postgresql://localhost:5432/fhalcom";
        String user = "postgres";
        String pass = "Df3a0b951";
        try 
        {
            System.out.println("DB connecting...");
            Connection conn = DriverManager.getConnection(jdbcUrl, user, pass);
            System.out.println("DB is connected.. ");
            conn.close();
        }
        catch(Exception e)
        {
            System.out.println("DB connection Error...");
        }
    }
}