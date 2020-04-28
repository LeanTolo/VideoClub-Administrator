package com.company.Employee;


public class Architect extends Employee implements PrintWork {

        private double registrationNumber;

        public Architect(String name, String dni, String phone, boolean isWorking,double registrationNumber) {
                super(name, dni, phone, isWorking);
                this.registrationNumber = registrationNumber;
                super.setSalary(2000);
        }


        @Override
        public String print(){
                return "Creating My Next Architectural Plan";
        }

        @Override
        public String toString() {
                return "\nArchitect: " +
                        "\nName=" + getName() + "\nDni=" + getDni() +
                        "\nPhone=" + getPhone() + "\nRegistration Number=" + registrationNumber +
                        "\nSalary=" + getSalary();
        }


}
