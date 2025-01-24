package com.lti;

import java.util.*;

public class TestJava {

    public static void main(String[] args) {
        List<Employee> employeeList = Arrays.asList(new Employee("N1", 10.0), new Employee("N2", 15.0));
        Optional<Employee> employee = employeeList.stream().max(Comparator.comparing(Employee::getSalary)).stream().findAny();
        System.out.println(employee.get().name);
    }

    static class Employee{

        private String name;
        private Double salary;

        Employee(String name, Double salary){
            this.name = name;
            this.salary = salary;
        }

        public Double getSalary() {
            return salary;
        }

        public void setSalary(Double salary) {
            this.salary = salary;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
