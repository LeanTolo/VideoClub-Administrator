package com.company.Construction;

public class Commercial extends Construction {

    private String jobName;


    public Commercial(String address, double mt2, int estimatedTime, double $mt2,String jobName) {
        super(address, mt2, estimatedTime, $mt2);
        this.jobName = jobName;
    }

    public String getJobName() {
        return jobName;
    }


}
