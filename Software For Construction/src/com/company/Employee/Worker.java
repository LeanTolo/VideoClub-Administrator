package com.company.Employee;

import com.company.Employee.Employee;
import com.company.Employee.PrintWork;

public class Worker extends Employee implements PrintWork {

        private int age;

        public Worker(String name, String dni, String phone, boolean isWorking, int age) {
                super(name, dni, phone, isWorking);
                this.age = age;
                super.setSalary(1500);
        }

        @Override
        public String print(){
                return "Im a worker and I build";
        }


        @Override
        public String toString() {
                return "\nWorker: " +
                        "\nName=" + getName() + "\nDni=" + getDni() +
                        "\nPhone=" + getPhone() + "\nAge=" + age +
                        "\nSalary=" + getSalary();
        }
}
