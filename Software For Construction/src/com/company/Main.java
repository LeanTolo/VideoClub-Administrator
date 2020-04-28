package com.company;


import com.company.Construction.Commerces;
import com.company.Construction.Construction;
import com.company.Construction.Domestic;
import com.company.Construction.Hotels;
import com.company.Employee.Architect;
import com.company.Employee.ConstructionMaster;
import com.company.Employee.Worker;

public class Main {

    public static void main(String[] args) {

        //CREATING COMPANY
        Company company = new Company("Tolo");

        //CREATING EMPLOYEES
        //ARCHITECTS
        Architect arch1 = new Architect("Carl","20303030","22312345",true,001);
        Architect arch2 = new Architect("Thomas","20456789","22332154",true,002);
        Architect arch3 = new Architect("Mark","40405050","22333345",true,003);
        Architect arch4 = new Architect("Joseph","30302020","22312585",true,004);
        //WORKERS
        Worker worker1 = new Worker("Bryan","30303030","1112233",true,18);
        Worker worker2 = new Worker("Peter","50505050","1111233",true,19);
        Worker worker3 = new Worker("Jhona","40404040","1113233",true,20);
        Worker worker4 = new Worker("Junior","10101010","1142233",true,21);
        Worker worker5 = new Worker("Diego","41414141","1115233",true,22);
        Worker worker6 = new Worker("Kevin","42424242","1116233",true,23);
        Worker worker7 = new Worker("Christian","43434343","7112233",true,24);
        Worker worker8 = new Worker("Dylan","44444444","1112833",true,18);
        //CONSTRUCTION MASTERS
        ConstructionMaster cMaster1 = new ConstructionMaster("Lucas", "51515151","22334455",true,40);
        ConstructionMaster cMaster2 = new ConstructionMaster("Eduard", "52525252","22334785",true,38);
        ConstructionMaster cMaster3 = new ConstructionMaster("Richard", "53535353","22339555",true,29);
        ConstructionMaster cMaster4 = new ConstructionMaster("Albert", "54545454","22334345",true,55);
        ConstructionMaster cMaster5 = new ConstructionMaster("Gerard", "55555555","22334615",true,58);
        //PRINTING EMPLOYEES WORK
        arch2.printWork();
        worker1.printWork();
        cMaster1.printWork();
        //ADDING EMPLOYEES TO COMPANY
        company.addEmployees(arch1);
        company.addEmployees(arch2);
        company.addEmployees(worker1);
        company.addEmployees(worker2);
        company.addEmployees(worker3);
        company.addEmployees(cMaster1);
        company.addEmployees(cMaster2);
        company.addEmployees(cMaster3);
        //CREATING CONSTRUCTIONS
        //COMMERCIALS
        Commerces clothingStore = new Commerces("New York 215",100,300,1500,"New York 215 Store","Clothes");
        Hotels fiveStarsHotel = new Hotels("Florida 100",200,650,3000,"Florida 100 Hotel",23);
        //DOMESTIC
        Domestic kameHouse = new Domestic("Fake Street 123",50,200,1000,3);
        Domestic testEmployeesHouse = new Domestic("Trump",500,100,100,20);
        //ADDING EMPLOYEES TO CONSTRUCTIONS
        //Clothing Store
        clothingStore.addEmployee(arch2);
        clothingStore.addEmployee(cMaster1);
        clothingStore.addEmployee(worker1);
        clothingStore.addEmployee(worker2);
        //Five Stars Hotel
        fiveStarsHotel.addEmployee(arch2);
        fiveStarsHotel.addEmployee(cMaster1);
        fiveStarsHotel.addEmployee(cMaster2);
        fiveStarsHotel.addEmployee(worker3);
        fiveStarsHotel.addEmployee(worker2);
        //Domestic house
        kameHouse.addEmployee(arch1);
        kameHouse.addEmployee(cMaster1);
        kameHouse.addEmployee(worker1);
        kameHouse.addEmployee(worker2);
        //TEST WITH EMPLOYEES
        testEmployeesHouse.addEmployee(cMaster1);
        testEmployeesHouse.addEmployee(worker1);
        testEmployeesHouse.addEmployee(worker2);
        //ADDING CONSTRUCTIONS TO COMPANY
        company.addConstructions(clothingStore);
        company.addConstructions(fiveStarsHotel);
        company.addConstructions(kameHouse);
        company.addConstructions(testEmployeesHouse);

        //SHOW COMPANY CONSTRUCTIONS WITH ESTIMATED PRICE
        //company.showConstructions();
        //YOU CAN SEE THAT TEST EMPLOYEES ESTIMATED PRICE ITS 0 BECAUSE THEY PRINT NEED ONLY 1 ARCHITECT AND DON'T HAVE ANYONE

        //SHOW COMPANY EMPLOYEES
        //company.showCompanyEmployees();

        //SHOW COMPANY CONSTRUCTIONS WITH EMPLOYEES
        //company.showConstructionsAndEmployees();
        
    }
}
