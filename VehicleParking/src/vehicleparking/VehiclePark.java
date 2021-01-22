/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehicleparking;

public class VehiclePark {
    private String vNo;
    int[] vehicle=new int[4];
    VehiclePark(String vNo){this.vNo=vNo;}
    VehiclePark(){}
    public String getvNo(){
        return vNo;
    }
    public void park(Object obj){
       for(int i=0;i<vehicle.length;i++){
                System.out.println("Slot"+(i+1)+" of Bus Parking..");
        }        
    }
    
}
