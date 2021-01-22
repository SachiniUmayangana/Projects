/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.college.dao.custom.impl;

import lk.ijse.college.dao.custom.CourseDAO;
import lk.ijse.college.dao.CrudUtil;
import lk.ijse.college.dto.CourseDTO;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import lk.ijse.college.entity.Course;

/**
 *
 * @author dell
 */
public class CourseDAOImpl implements CourseDAO{
    
    @Override
    public boolean add(Course course) throws ClassNotFoundException, SQLException {
         String sql="Insert into Course Values(?,?,?,?)"; 
        return CrudUtil.executeUpdate(sql, course.getCode(),course.getCourseName(),course.getIntake(),course.getDuration());
    }

    @Override
    public ArrayList<Course> getAll() throws ClassNotFoundException, SQLException {
         String sql="Select * From Course";
 
        ResultSet rst = CrudUtil.executeQuery(sql);
        ArrayList<Course> allCourses = new ArrayList<>();
        while (rst.next()) {
            allCourses.add(new Course(rst.getString(1), rst.getString(2), rst.getString(3), rst.getString(4)));
        }
        return allCourses;
          }

    @Override
    public Course search(String code) throws ClassNotFoundException, SQLException {
        String sql="Select * From Course where code=?";
         ResultSet rst = CrudUtil.executeQuery(sql, code);
         if (rst.next()) {
            return new Course(rst.getString(1), rst.getString(2), rst.getString(3), rst.getString(4));
        }
        return null;
    }

    


   
}
