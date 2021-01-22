package vehicleparking;

public class Car extends VehiclePark {
    int[] car=new int[40];
   Car(String vNo){
		super(vNo);
	}
   Car(){}
   
    public String park(){    
        String vehicle="Car";
       for(int i=0;i<car.length;i++){
                System.out.println("Slot"+(i+1)+" of Car Parking..");
        }
       return vehicle;
    }
    /*
     public void payment(){
        double cost=50.00;
         double a1=Double.parseDouble(timeText.getText());
         double total=cost*a1;
         feeText.setText(Double.toString(total));
    }
*/
}
