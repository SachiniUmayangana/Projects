/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.college.bo.custom.impl;

import java.util.ArrayList;
import lk.ijse.college.bo.custom.RegisterStudentBO;
import lk.ijse.college.dao.DAOFactory;
import lk.ijse.college.dao.custom.RegisterDAO;
import lk.ijse.college.dao.custom.StudentDAO;
import lk.ijse.college.dao.custom.impl.RegisterDAOImpl;
import lk.ijse.college.dao.custom.impl.StudentDAOImpl;
import lk.ijse.college.db.DBConnection;
import lk.ijse.college.dto.RegisterDTO;
import lk.ijse.college.dto.StudentDTO;
import java.sql.Connection;
import java.util.logging.Level;
import java.util.logging.Logger;
import lk.ijse.college.entity.Registration;
import lk.ijse.college.entity.Student;

/**
 *
 * @author dell
 */
public class RegisterStudentBOImpl implements RegisterStudentBO{
        StudentDAO studentDao=new StudentDAOImpl();
        RegisterDAO regiDao=new RegisterDAOImpl();

    @Override
    public ArrayList<Student> getAllStudents() {
            try {
                return studentDao.getAll();
            } catch (Exception ex) {
                Logger.getLogger(RegisterStudentBOImpl.class.getName()).log(Level.SEVERE, null, ex);
            }
            return null;
    }

    @Override
    public Student searchStudent(String id) {

            try {
                return studentDao.search(id);
            } catch (Exception ex) {
                Logger.getLogger(RegisterStudentBOImpl.class.getName()).log(Level.SEVERE, null, ex);
            }
            return null;
            
    }

    @Override
    public boolean registerStudent(StudentDTO dto) {
          
            try {
                Connection connection = DBConnection.getInstance().getConnection();
                connection.setAutoCommit(false);
                Student student = new Student(dto.getId(),dto.getStudentName(),dto.getAddress(),dto.getContact(),dto.getDob(),dto.getGender());
                boolean add = studentDao.add(student);
                
                if (add) {
                    for (RegisterDTO regi : dto.getAllRegisters()) {
                        Registration register=new Registration(regi.getRegNo(),regi.getRegDate(),regi.getRegFee(),regi.getStID(),regi.getCourseCode());
                        boolean response = regiDao.add(register);
                        if (!response) {
                            connection.rollback();
                            connection.setAutoCommit(true);
                            return false;
                        }
                    }
                    connection.commit();
                    connection.setAutoCommit(true);
                    return true;
                    
                } else {
                    connection.rollback();
                    connection.setAutoCommit(true);
                    return false;
                }
            } catch (Exception ex) {
                Logger.getLogger(RegisterStudentBOImpl.class.getName()).log(Level.SEVERE, null, ex);
            }
            return false;
                }   

    
}
