package com.jap;

import java.sql.*;

/**
 * Hello world!
 *
 */
public class DeleteUpdateStudentData
{

    public Connection getConnection() throws ClassNotFoundException, SQLException{

            Connection connection = null;
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/school";
            String user = "root";
            String pass = "admin";
            connection = DriverManager.getConnection(url, user, pass);
            return connection;
    }
    public void deleteStudentData() throws SQLException, ClassNotFoundException {
      // call getConnection() method
       Statement st = getConnection().createStatement();
        //execute delete query
        String sql = "Delete from student where rollno = 29";
        st.executeUpdate(sql);
        System.out.println("Successfully deleted");
    }
    public void updateStudentData() throws SQLException,ClassNotFoundException{
        // call getConnection() method
        Statement st = getConnection().createStatement();
        //execute update query
        String sql = "Update student set age = 50 where totalMarks = 190 and rollno = 19";
        st.executeUpdate(sql);
        System.out.println("Successfully updated ");
    }
    public static void main(String[] args) {
        DeleteUpdateStudentData salesDataDemo = new DeleteUpdateStudentData();
        try {

            salesDataDemo.deleteStudentData();
            salesDataDemo.updateStudentData();
        } catch (SQLException e) {
           e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
