package com.company.Construction;

public class Hotels extends Commercial {

    private double numberOfFloors;


    public Hotels(String address, double mt2, int estimatedTime, double $mt2, String jobName,double numberOfFloors) {
        super(address, mt2, estimatedTime, $mt2, jobName);
        this.numberOfFloors = numberOfFloors;
    }

    @Override
    public String toString() {
        return "\nHotel: " +
                "\nJob Name= " + getJobName()+
                "\nNumber of Floors = " + numberOfFloors+
                "\nAddress = " + getAddress()+
                "\nMt2 = " + getMt2()+
                "\nEstimated Time = " + getEstimatedTime()+
                "\nPrice per Mt2 = $" + get$mt2();

    }
}
