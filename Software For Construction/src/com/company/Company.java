package com.company;

import com.company.Construction.Commerces;
import com.company.Construction.Construction;
import com.company.Employee.Employee;

import java.util.ArrayList;
import java.util.List;

public class Company {

    private String companyName;
    private List<Employee> employees;
    private List<Construction> constructions;

    public Company(){}

    public Company(String companyName){
        this.companyName = companyName;
        employees = new ArrayList<Employee>();
        constructions = new ArrayList<Construction>();
    }


    public void addEmployees (Employee employee){
        this.employees.add(employee);
    }

    public void addConstructions (Construction construction){
        this.constructions.add(construction);
    }

    public void showCompanyEmployees(){
        for (Employee employee:employees){
           System.out.println(employee.toString());
        }
    }

    public void showConstructionsAndEmployees(){
        for (Construction construction:constructions){
            System.out.println(construction.toString());
            construction.showEmployeesOfConstruction();
        }
    }

    public void showConstructions(){
        for (Construction construction:constructions){
            System.out.println(construction.toString());
            System.out.println("\nEstimated Price: $"+construction.estimatedPrice());
        }
    }


}
