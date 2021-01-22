/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.college.dao.custom.impl;

import lk.ijse.college.dao.CrudUtil;
import lk.ijse.college.dao.custom.RegisterDAO;
import lk.ijse.college.dao.custom.StudentDAO;
import java.util.ArrayList;
import lk.ijse.college.entity.Registration;
import lk.ijse.college.entity.Student;

/**
 *
 * @author dell
 */
public class RegisterDAOImpl implements RegisterDAO{
    StudentDAO dao=new StudentDAOImpl();

    public ArrayList<Student> getAllCustomers() throws Exception {

        return dao.getAll();
    }

    @Override
    public boolean add(Registration t) throws Exception {
        String sql="Insert into Register Values(?,?,?,?,?)"; 
        return CrudUtil.executeUpdate(sql, t.getRegNo(),t.getRegDate(),t.getRegFee(),t.getStID(),t.getCourseCode());   
    }

    @Override
    public Registration search(String id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Registration> getAll() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
