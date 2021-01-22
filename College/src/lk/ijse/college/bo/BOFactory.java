/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.college.bo;

import lk.ijse.college.bo.custom.impl.CourseBOImpl;
import lk.ijse.college.bo.custom.impl.RegisterStudentBOImpl;


/**
 *
 * @author dell
 */
public class BOFactory {
     private static BOFactory boFactory;

    private BOFactory() {
    }

    public static BOFactory getInstance() {
        if (boFactory == null) {
            boFactory = new BOFactory();
        }
        return boFactory;

    }

    public enum BOTypes {
       COURSE, REGISTRATION;
    }

    public SuperBO getBO(BOTypes types) {
        switch (types) {
            
            case COURSE:
                return new CourseBOImpl();
            case REGISTRATION:
                return new RegisterStudentBOImpl();
            default:
                return null;

        }

    }
}
