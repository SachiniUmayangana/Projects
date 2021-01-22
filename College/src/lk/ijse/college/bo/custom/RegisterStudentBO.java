/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.college.bo.custom;

import lk.ijse.college.bo.SuperBO;
import lk.ijse.college.dto.StudentDTO;
import java.util.ArrayList;
import lk.ijse.college.entity.Registration;
import lk.ijse.college.entity.Student;

/**
 *
 * @author dell
 */

public interface RegisterStudentBO extends SuperBO{
     
    public ArrayList<Student> getAllStudents();

    public Student searchStudent(String id);

    public boolean registerStudent(StudentDTO dto);

    
}
