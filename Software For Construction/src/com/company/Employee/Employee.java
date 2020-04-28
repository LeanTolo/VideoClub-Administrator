package com.company.Employee;

public abstract class Employee implements PrintWork {

        private String name;
        private String dni;
        private String phone;
        private double salary;
        private boolean isWorking;

        public Employee(String name, String dni, String phone, boolean isWorking) {
                this.name = name;
                this.dni = dni;
                this.phone = phone;
                this.isWorking = isWorking;
        }

        public void printWork(){
                if (this.isWorking == true) {
                        System.out.println(print());
                }else{
                        System.out.println("Im not working right now");
                }
        }


        public String getName() {
                return name;
        }


        public double getSalary() {
                return salary;
        }

        public void setSalary(double salary) {
                this.salary = salary;
        }

        public String getDni() {
                return dni;
        }

        public String getPhone() {
                return phone;
        }
}
