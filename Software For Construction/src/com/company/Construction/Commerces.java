package com.company.Construction;

public class Commerces extends Commercial {

    private String workArea;

    public Commerces(String address, double mt2, int estimatedTime, double $mt2, String jobName, String workArea) {
        super(address, mt2, estimatedTime, $mt2, jobName);
        this.workArea = workArea;
    }

    @Override
    public String toString() {
        return "\nCommerce: " +
                "\nJob Name= " + getJobName()+
                "\nWork Area = " + workArea+
                "\nAddress = " + getAddress()+
                "\nMt2 = " + getMt2()+
                "\nEstimated Time = " + getEstimatedTime()+
                "\nPrice per Mt2 = $" + get$mt2();
    }

}
