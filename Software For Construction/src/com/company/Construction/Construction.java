package com.company.Construction;


import com.company.Employee.Architect;
import com.company.Employee.ConstructionMaster;
import com.company.Employee.Employee;
import com.company.Employee.Worker;

import java.util.ArrayList;
import java.util.List;

public class Construction {

    private String address;
    private double mt2;
    private int estimatedTime;
    private double $mt2;
    private List<Employee> employees;

    public Construction(String address, double mt2, int estimatedTime, double $mt2) {
        this.address = address;
        this.mt2 = mt2;
        this.estimatedTime = estimatedTime;
        this.$mt2 = $mt2;
        employees = new ArrayList<Employee>();
    }

    public void showEmployeesOfConstruction(){
        for (Employee employee:employees){
            System.out.println(employee.toString());
        }
    }

    public void addEmployee (Employee employee){
        if (employee instanceof Architect) {
            if (howMuchArchitects() == 0 ) {
                this.employees.add(employee);
            } else {
                System.out.println("Need only 1 Architect");
            }
        }if (employee instanceof ConstructionMaster) {
            if (howMuchConstructorMasters() >= 3) {
                System.out.println("Need between 1 and 3 Constructor Masters");
            } else {
                this.employees.add(employee);
            }
        }
        if (employee instanceof Worker){
            this.employees.add(employee);
        }
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getMt2() {
        return mt2;
    }

    public void setMt2(double mt2) {
        this.mt2 = mt2;
    }

    public int getEstimatedTime() {
        return estimatedTime;
    }

    public void setEstimatedTime(int estimatedTime) {
        this.estimatedTime = estimatedTime;
    }

    public double get$mt2() {
        return $mt2;
    }

    public void set$mt2(double $mt2) {
        this.$mt2 = $mt2;
    }



    public double estimatedPrice(){
        double total = 0;
        double dailySalary = 0;
        if (howMuchArchitects() != 1){
            System.out.println("Need only 1 Architect");
        }else{
            if ((howMuchConstructorMasters() < 1) || (howMuchConstructorMasters() > 3) ){
                System.out.println("Need between 1 and 3 Constructor Masters");
            }else{
                if (howMuchWorkers() < 2){
                    System.out.println("Need at least 2 Workers");
                }else{
                    for (Employee employee : employees){
                        dailySalary += employee.getSalary();
                    }
                    total = ($mt2 * mt2) + (dailySalary * estimatedTime);
                }
            }
        }
        return total;
    }

    public int howMuchArchitects(){
        int amount = 0;
        for (Employee employee: employees){
            if (employee instanceof Architect){
                amount++;
            }
        }
        return amount;
    }

    public int howMuchConstructorMasters(){
        int amount = 0;
        for (Employee employee: employees){
            if (employee instanceof ConstructionMaster){
                amount++;
            }
        }
        return amount;
    }

    public int howMuchWorkers(){
        int amount = 0;
        for (Employee employee: employees){
            if (employee instanceof Worker){
                amount++;
            }
        }
        return amount;
    }

    @Override
    public String toString() {
        return "\nConstruction: " +
                "\nAddress=" + getAddress() + "\nMt2=" + getMt2() +
                "\nCost per Mt2=" + get$mt2() + "\nEstimated Time=" + getEstimatedTime();
    }

}
