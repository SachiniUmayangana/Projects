package vehicleparking;

public class Lorry extends VehiclePark{
      int[] lorry=new int[10];
    Lorry(String vNo){
		super(vNo);
	}

    Lorry() {
    }
   
    public String park(){  
        String vehicle="Lorry";
        for(int i=0;i<lorry.length;i++){
                System.out.println("Slot"+(i+1)+" of Lorry Parking..");
        }
        return vehicle;
    }
    /*
     public void payment(){
        double cost=150.00;
         double a1=Double.parseDouble(timeText.getText());
         double total=cost*a1;
         feeText.setText(Double.toString(total));
    }
*/
}
