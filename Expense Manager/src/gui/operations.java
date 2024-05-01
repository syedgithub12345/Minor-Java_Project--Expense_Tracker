///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package gui;
//import database.*;
//import java.sql.*;
//import javax.swing.*;
//
///**
// *
// * @author Het
// */
//public class operations {
//    public static boolean isLogin(String username,String password,JFrame frame){
//        try{
//             ResultSet rs = database.dbclass.st.executeQuery("Select user_id,Name from user where username = '"+username+"' and password = '"+password+"' ");
//            while(rs.next()){
//                loginsession.UID = rs.getInt("user_id");
//                loginsession.Name_user = rs.getString("Name");
//                return true;
//            }
//        }catch(Exception ex){
//            JOptionPane.showMessageDialog(null, ex);
//        }
//        return false;
//    }
//    
//       
////}
package gui;
import database.*;
import java.sql.*;
import javax.swing.*;

public class operations {
    public static boolean isLogin(String username, String password, JFrame frame) {
        try {
            ResultSet rs = database.dbclass.st.executeQuery("SELECT username, password, Name FROM user WHERE username = '"+username+"' AND password = '"+password+"'");
            if (rs.next()) {
                loginsession.Name_user = rs.getString("Name");
                return true;
            }
        } catch(Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        return false;
    }
}
//
//package gui;
//
//import database.*;
//import java.sql.*;
//import javax.swing.*;
//
//public class operations {
//    public static boolean isLogin(String username, String password, JFrame frame) {
//        try {
//            ResultSet rs = dbclass.st.executeQuery("SELECT userID, Name FROM user WHERE username = '" + username + "' AND password = '" + password + "'");
//            while (rs.next()) {
//                loginsession.UID = rs.getInt("userID");
//                loginsession.Name_user = rs.getString("Name");
//                return true;
//            }
//        } catch (Exception ex) {
//            JOptionPane.showMessageDialog(null, ex);
//        }
//        return false;
//    }
//}
