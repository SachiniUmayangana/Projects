/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.college.bo.custom.impl;

import lk.ijse.college.bo.custom.CourseBO;
import lk.ijse.college.dao.DAOFactory;
import lk.ijse.college.dao.custom.CourseDAO;
import lk.ijse.college.dto.CourseDTO;
import lk.ijse.college.entity.Course;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author dell
 */
public class CourseBOImpl implements CourseBO{
      CourseDAO dao=(CourseDAO) DAOFactory.getIntance().getDAO(DAOFactory.DAOTypes.COURSE);

    /*
     @Override
    public boolean addCourse(CourseDTO dto) throws ClassNotFoundException, SQLException, Exception {
        return dao.add(new Course(dto.getCode(), dto.getCourseName(), dto.getIntake(), dto.getDuration()));
    }
*/
    @Override
    public CourseDTO searchCourse(String code) throws ClassNotFoundException, SQLException, Exception {
          Course s = dao.search(code);
         return (new CourseDTO(s.getCode(), s.getCourseName(), s.getIntake(), s.getDuration()));
    }

    @Override
    public ArrayList<CourseDTO> getAllCourse() throws SQLException, ClassNotFoundException, Exception {
        ArrayList<Course> all = dao.getAll();
        ArrayList<CourseDTO> allCustomers = new ArrayList<>();
        for (Course c : all) {
            CourseDTO dto = new CourseDTO(c.getCode(), c.getCourseName(), c.getIntake(), c.getDuration());
            allCustomers.add(dto);
        }
        return allCustomers;
    }

    @Override
    public boolean addCourse(CourseDTO dto) {
          try {
              return dao.add(new Course(dto.getCode(), dto.getCourseName(), dto.getIntake(), dto.getDuration()));
          } catch (Exception ex) {
              Logger.getLogger(CourseBOImpl.class.getName()).log(Level.SEVERE, null, ex);
          }
          return false;
    }

    
     
 

     
}
