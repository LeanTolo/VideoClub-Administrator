package com.company.Employee;

public class ConstructionMaster extends Employee implements PrintWork {

        private int age;

        public ConstructionMaster(String name, String dni, String phone, boolean isWorking,int age) {
                super(name, dni, phone, isWorking);
                this.age = age;
                super.setSalary(1800);
        }


        @Override
        public String print(){
                return "Im Construction Master and I supervise buildings";
        }

        @Override
        public String toString() {
                return "\nConstruction Master: " +
                        "\nName=" + getName() + "\nDni=" + getDni() +
                        "\nPhone=" + getPhone() + "\nAge=" + age +
                        "\nSalary=" + getSalary();
        }


}
