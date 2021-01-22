package vehicleparking;

public class Bus extends VehiclePark {
    int[] bus=new int[20];
    Bus(String vNo){
		super(vNo);
	}
    Bus(){}

    public String park(){       
        String vehicle="Bus";
        for(int i=0;i<bus.length;i++){
                System.out.println("Slot"+(i+1)+" of Bus Parking..");
        }
        return vehicle;
    }
    /*
    public void payment(){
        double cost=100.00;
         double a1=Double.parseDouble(timeText.getText());
         double total=cost*a1;
         feeText.setText(Double.toString(total));
    }
*/
}
