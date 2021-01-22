/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehicleparking;

/**
 *
 * @author User
 */
public class Parking {
    private String vNo;
    private String vType;
    private Double arrivalTime;
    private String arrivalDate;

    public Parking() {
    }

    public Parking(String vNo, String vType, Double arrivalTime, String arrivalDate) {
        this.vNo = vNo;
        this.vType = vType;
        this.arrivalTime = arrivalTime;
        this.arrivalDate = arrivalDate;
    }

    /**
     * @return the vNo
     */
    public String getvNo() {
        return vNo;
    }

    /**
     * @param vNo the vNo to set
     */
    public void setvNo(String vNo) {
        this.vNo = vNo;
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
     * @return the arrivalTime
     */
    public Double getArrivalTime() {
        return arrivalTime;
    }

    /**
     * @param arrivalTime the arrivalTime to set
     */
    public void setArrivalTime(Double arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    /**
     * @return the arrivalDate
     */
    public String getArrivalDate() {
        return arrivalDate;
    }

    /**
     * @param arrivalDate the arrivalDate to set
     */
    public void setArrivalDate(String arrivalDate) {
        this.arrivalDate = arrivalDate;
    }

    
}
