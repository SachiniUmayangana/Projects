/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.college.controller;

import lk.ijse.college.bo.BOFactory;
import java.util.ArrayList;
import lk.ijse.college.entity.Student;
import lk.ijse.college.bo.custom.RegisterStudentBO;
import lk.ijse.college.dto.StudentDTO;

/**
 *
 * @author dell
 */
public class RegisterStudentController {
    
   static RegisterStudentBO bo=(RegisterStudentBO) BOFactory.getInstance().getBO(BOFactory.BOTypes.REGISTRATION);
    
     

    public ArrayList<Student> getAllStudents() throws Exception {
        return bo.getAllStudents();
    }
    

    public Student searchStudent(String id) {
        return bo.searchStudent(id);
    }

    public boolean registerStudent(StudentDTO dto) {
        return bo.registerStudent(dto);
    }

    

    

    


    

    }
    

  

