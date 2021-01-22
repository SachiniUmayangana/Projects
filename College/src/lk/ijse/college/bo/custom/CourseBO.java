/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.college.bo.custom;

import lk.ijse.college.bo.SuperBO;
import lk.ijse.college.dto.CourseDTO;
import java.sql.SQLException;
import java.util.ArrayList;
import lk.ijse.college.entity.Course;
import lk.ijse.college.entity.Student;

/**
 *
 * @author dell
 */
public interface CourseBO extends SuperBO{
    public boolean addCourse(CourseDTO dto);
       
    public CourseDTO searchCourse(String code) throws ClassNotFoundException, SQLException, Exception;

    public ArrayList<CourseDTO> getAllCourse() throws SQLException, ClassNotFoundException, Exception;

        
}
