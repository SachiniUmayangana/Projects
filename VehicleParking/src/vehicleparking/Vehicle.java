
package vehicleparking;
public class Vehicle {
    private String vType;
    private String ownerName;

    public Vehicle() {
    }

    public Vehicle(String vType, String ownerName) {
        this.vType = vType;
        this.ownerName = ownerName;
    }

    /**
     * @return the vType
     */
    public String getvType() {
        return vType;
    }

    /**
     * @param vType the vType to set
     */
    public void setvType(String vType) {
        this.vType = vType;
    }

    /**
     * @return the ownerName
     */
    public String getOwnerName() {
        return ownerName;
    }

    /**
     * @param ownerName the ownerName to set
     */
    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

  
    
}
