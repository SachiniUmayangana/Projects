/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehicleparking;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author User
 */
public class VehicleController {
      public static boolean addVehicle(String vNo, String ownerName) throws ClassNotFoundException, SQLException{
        Connection connection = DBConnection.getInstance().getConnection();
        PreparedStatement stm = connection.prepareStatement("Insert into Vehicle Values(?,?)");
        stm.setObject(1, vNo);
        stm.setObject(2, ownerName);
        
        int res = stm.executeUpdate();
        return res>0;
        
    }
    
       public static Vehicle searchVehicle(String vNo) throws ClassNotFoundException, SQLException{
        PreparedStatement stm = DBConnection.getInstance().getConnection().prepareStatement("Select * From Vehicle where vNo=?");
        stm.setObject(1, vNo);
        ResultSet rst = stm.executeQuery();
        if(rst.next()){
            Vehicle vehicle=new Vehicle(rst.getString("vNo"), rst.getString("ownerName"));
            return vehicle;
        }
        return null;
    }
    
          public static boolean addParking(String vNo, String vType, Double arrivalTime, String arrivalDate) throws ClassNotFoundException, SQLException{
        Connection connection = DBConnection.getInstance().getConnection();
        PreparedStatement stm = connection.prepareStatement("Insert into Parking Values(?,?,?,?)");
        stm.setObject(1, vNo);
        stm.setObject(2, vType);
        stm.setObject(3, arrivalTime);
        stm.setObject(4, arrivalDate);
        int res = stm.executeUpdate();
        return res>0;
        
    }
          
          public static Parking searchParking(String vNo) throws ClassNotFoundException, SQLException{
        PreparedStatement stm = DBConnection.getInstance().getConnection().prepareStatement("Select * From Parking where vNo=?");
        stm.setObject(1, vNo);
        ResultSet rst = stm.executeQuery();
        if(rst.next()){
            Parking parking=new Parking(rst.getString("vNo"), rst.getString("vType"), rst.getDouble("arrivalTime"),rst.getString("arrivalDate"));
            return parking;
        }
        return null;
    }
          
             public static boolean addPayment(String vNo, String vType, Double arrivalTime, Double departureTime, Double totalFee, Double parkedTime, String payment) throws ClassNotFoundException, SQLException{
        Connection connection = DBConnection.getInstance().getConnection();
        PreparedStatement stm = connection.prepareStatement("Insert into Payment Values(?,?,?,?,?,?,?)");
        stm.setObject(1, vNo);
        stm.setObject(2, vType);
        stm.setObject(3, arrivalTime);
        stm.setObject(4, departureTime);
         stm.setObject(5, totalFee);
          stm.setObject(6, parkedTime);
           stm.setObject(7, payment);
        int res = stm.executeUpdate();
        return res>0;
     }
          
      
     
           /*
            public static Payment searchPayment(String vNo) throws ClassNotFoundException, SQLException{
        PreparedStatement stm = DBConnection.getInstance().getConnection().prepareStatement("Select * From Parking where vNo=?");
        stm.setObject(1, vNo);
        ResultSet rst = stm.executeQuery();
        if(rst.next()){
            Payment payment=new Payment(rst.getString("vNo"), rst.getDouble("arrivalTime"));
            return payment;
        }
        return null;
    }
       
      */ 
	

}
