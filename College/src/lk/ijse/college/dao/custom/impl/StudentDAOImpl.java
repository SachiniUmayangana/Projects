/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.college.dao.custom.impl;

import lk.ijse.college.dao.CrudUtil;
import lk.ijse.college.dao.custom.StudentDAO;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import lk.ijse.college.entity.Student;

/**
 *
 * @author dell
 */
public class StudentDAOImpl implements StudentDAO{

   
    @Override
    public boolean add(Student student) throws SQLException, ClassNotFoundException {
        String sql="Insert into Student Values(?,?,?,?,?,?)";
      return CrudUtil.executeUpdate(sql, student.getId(),student.getStudentName(),student.getAddress(),student.getContact(),student.getDob(),student.getGender());
    }

    @Override
    public ArrayList<Student> getAll() throws SQLException, ClassNotFoundException {
        String sql="Select * From Student";
        ResultSet rst = CrudUtil.executeQuery(sql);
        ArrayList<Student> allStudents = new ArrayList<>();
        while (rst.next()) {
            allStudents.add(new Student(rst.getString(1), rst.getString(2), rst.getString(3), rst.getString(4), rst.getString(5), rst.getString(6)));
        }
        return allStudents;
    }

    @Override
    public Student search(String id) throws ClassNotFoundException, SQLException{
        String sql="Select * From Student where id=?";
       ResultSet rst = CrudUtil.executeQuery(sql, id);
         if (rst.next()) {
            return new Student(rst.getString(1), rst.getString(2), rst.getString(3), rst.getString(4), rst.getString(5), rst.getString(6));
        }
        return null;
     
    }


}
