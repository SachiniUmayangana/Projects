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
public class Payment {
    private String vNo;
    private double arrivalTime; 
    private double departureTime; 
    private double totalFee; 
    private double parkedTime; 
    private String payment;

    public Payment() {
    }

    public Payment(String vNo, double arrivalTime, double departureTime, double totalFee, double parkedTime, String payment) {
        this.vNo = vNo;
        this.arrivalTime = arrivalTime;
        this.departureTime = departureTime;
        this.totalFee = totalFee;
        this.parkedTime = parkedTime;
        this.payment = payment;
    }

    Payment(String string, double aDouble) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
     * @return the arrivalTime
     */
    public double getArrivalTime() {
        return arrivalTime;
    }

    /**
     * @param arrivalTime the arrivalTime to set
     */
    public void setArrivalTime(double arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    /**
     * @return the departureTime
     */
    public double getDepartureTime() {
        return departureTime;
    }

    /**
     * @param departureTime the departureTime to set
     */
    public void setDepartureTime(double departureTime) {
        this.departureTime = departureTime;
    }

    /**
     * @return the totalFee
     */
    public double getTotalFee() {
        return totalFee;
    }

    /**
     * @param totalFee the totalFee to set
     */
    public void setTotalFee(double totalFee) {
        this.totalFee = totalFee;
    }

    /**
     * @return the parkedTime
     */
    public double getParkedTime() {
        return parkedTime;
    }

    /**
     * @param parkedTime the parkedTime to set
     */
    public void setParkedTime(double parkedTime) {
        this.parkedTime = parkedTime;
    }

    /**
     * @return the payment
     */
    public String getPayment() {
        return payment;
    }

    /**
     * @param payment the payment to set
     */
    public void setPayment(String payment) {
        this.payment = payment;
    }

 

    
}
