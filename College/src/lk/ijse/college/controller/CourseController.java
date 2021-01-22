/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.college.controller;

import lk.ijse.college.bo.BOFactory;
import lk.ijse.college.bo.custom.CourseBO;
import lk.ijse.college.dto.CourseDTO;
import java.sql.SQLException;
import java.util.ArrayList;
import lk.ijse.college.entity.Course;

/**
 *
 * @author dell
 */
public class CourseController {
    
      static CourseBO co=(CourseBO) BOFactory.getInstance().getBO(BOFactory.BOTypes.COURSE);
        
    public boolean addCourse(CourseDTO dto) throws Exception {
       return co.addCourse(dto);
    }

    public ArrayList<CourseDTO> getAllCourses() throws ClassNotFoundException, SQLException, Exception {
      return co.getAllCourse();
    }

    public CourseDTO searchCourse(String code) throws Exception {
      return co.searchCourse(code);
    }
    
}
