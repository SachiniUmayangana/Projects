/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.college.dao;

import lk.ijse.college.dao.custom.impl.CourseDAOImpl;
import lk.ijse.college.dao.custom.impl.QueryDAOImpl;
import lk.ijse.college.dao.custom.impl.RegisterDAOImpl;
import lk.ijse.college.dao.custom.impl.StudentDAOImpl;

/**
 *
 * @author dell
 */
public class DAOFactory {
    
    private static DAOFactory daoFactory;

    private DAOFactory() {
    }

    public static DAOFactory getIntance() {
        if (daoFactory == null) {
            daoFactory = new DAOFactory();
        }
        return daoFactory;
    }

    public enum DAOTypes {
        STUDENT,COURSE,REGISTRATION,QUERYDAO;
    }

    public SuperDAO getDAO(DAOTypes types) {
        switch (types) {
            case STUDENT:
                return new StudentDAOImpl();
            case REGISTRATION:
                return new RegisterDAOImpl();
            case QUERYDAO:
                return new QueryDAOImpl();
            case COURSE:
                return new CourseDAOImpl();
            default:
                return null;

        }
    }
}
