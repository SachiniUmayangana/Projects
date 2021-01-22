
package vehicleparking;
import java.sql.*;
public class VehicleParking {

    public static void main(String[] args) {
     	String SQL="Select * From Vehicle,Select * From Parking,Select * From Payment";
        
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/Vehicle_Parking","root","1234");
			Statement stm=conn.createStatement();
			ResultSet rst=stm.executeQuery(SQL);
			while(rst.next()){ //move first row
				String vNo=rst.getString("vNo");
				String ownerName=rst.getString("ownerName");
				
				System.out.println(vNo+"\t"+ownerName);
			}
			
		}catch(ClassNotFoundException ex){
			System.out.println("Driver not found...");
			System.out.println(ex.getMessage());
			return;
		}catch(SQLException ex){
			System.out.println(ex.getMessage());
		}
        //=========================================================================================================       
        
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/Vehicle_Parking","root","1234");
			Statement stm=conn.createStatement();
			ResultSet rst=stm.executeQuery(SQL);
			while(rst.next()){ //move first row
				String vNo=rst.getString("vNo");
                                String vType=rst.getString("vType");
				double arrivalTime=rst.getDouble("arrivalTime");
				String arrivalDate=rst.getString("arrivalDate");
                                
				System.out.println(vNo+"\t"+vType+"\t"+arrivalTime+"\t"+arrivalDate);
			}
			
		}catch(ClassNotFoundException ex){
			System.out.println("Driver not found...");
			System.out.println(ex.getMessage());
			return;
		}catch(SQLException ex){
			System.out.println(ex.getMessage());
		} 
        //=========================================================================================================
                
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/Vehicle_Parking","root","1234");
			Statement stm=conn.createStatement();
			ResultSet rst=stm.executeQuery(SQL);
			while(rst.next()){ //move first row
				String vNo=rst.getString("vNo");
				String vType=rst.getString("vType");
				double arrivalTime=rst.getDouble("arrivalTime");
                                double departuretime=rst.getDouble("departuretime");
                                double totalFee=rst.getDouble("totalFee");
                                double parkedTime=rst.getDouble("parkedTime");
                                String payment=rst.getString("payment");
                                
				System.out.println(vNo+"\t"+vType+"\t"+arrivalTime+"\t"+departuretime+"\t"+totalFee+"\t"+parkedTime+"\t"+payment);
			}
			
		}catch(ClassNotFoundException ex){
			System.out.println("Driver not found...");
			System.out.println(ex.getMessage());
			return;
		}catch(SQLException ex){
			System.out.println(ex.getMessage());
		} 
    
    }
}
    

