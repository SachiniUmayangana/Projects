package vehicleparking;

public class Van extends VehiclePark{
    int[] van=new int[30];
    Van(String vNo){
		super(vNo);
	}

    Van() {
      
    }
  
    public String park(){ 
        String vehicle="Van";
        for(int i=0;i<van.length;i++){
                System.out.println("Slot"+(i+1)+" of Van Parking..");
        }       
        return vehicle;
    }
  
   
}
