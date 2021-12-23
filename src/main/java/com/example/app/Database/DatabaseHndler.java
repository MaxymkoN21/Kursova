package com.example.app.Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;

public class DatabaseHndler extends Config {
    private Connection dbCnnection;
    public Connection getDbCnnectio() throws ClassNotFoundException,SQLException{
        String connectionString = "jdbc:mysql://"+dbHost +":"+ dbPort + "/" + dbName;

        Class.forName("com.mysql.cj.jdbc.Driver");
        dbCnnection = DriverManager.getConnection(connectionString,dbUser,dbPass);
        return dbCnnection;
    }
    public void singUpUser(User user){
        String insert = "INSERT INTO "+Const.USER_TABLE+"("+Const.USER_FIRSTNAME+","+Const.USER_LASTNAME+","+
                Const.USER_USERNAME+","+Const.USER_PASSWORD+","+
                Const.USER_LOCATION+","+Const.USER_AGE+","+
                Const.USER_GENDER+")"+
                "VALUES(?,?,?,?,?,?,?)";
        try {
            PreparedStatement prSt = getDbCnnectio().prepareStatement(insert);
            prSt.setString(1, user.getFirstName());
            prSt.setString(2, user.getLastname());
            prSt.setString(3, user.getUsername());
            prSt.setString(4, user.getPassword());
            prSt.setString(5, user.getLocation());
            prSt.setString(6, user.getAge());
            prSt.setString(7, user.getGender());

            prSt.executeUpdate();
            prSt.close();
            dbCnnection.close();
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }


    }
    public ResultSet getUser(User user){
        ResultSet resSet= null;

        String select = "SELECT * FROM " + Const.USER_TABLE + " WHERE " +
                Const.USER_USERNAME + "=? AND " + Const.USER_PASSWORD + "=?";

        try {
            PreparedStatement prSt = getDbCnnectio().prepareStatement(select);
            prSt.setString(1,user.getUsername());
            prSt.setString(2,user.getPassword());

            resSet = prSt.executeQuery();
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return resSet;
    }
}
