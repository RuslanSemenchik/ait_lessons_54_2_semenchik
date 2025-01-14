package de.ait.homework27;

import java.util.ArrayList;
import java.util.Objects;

public class Department {
    private String name;
    private ArrayList<Employee> employees = new ArrayList<>();

    public Department(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Employee> getEmployees() {
        return employees;
    }

    public void addEmployee(Employee employee){
        if(employee == null){
            System.out.println("Employee is null");
        }
        else if(employee.getId() == null || employee.getName() == null
                || employee.getPosition() == null || employee.getSalary() <= 0){
            System.out.println("Employee is invalid");
        }
        else {
            employees.add(employee);
            System.out.println("Employee ID " + employee.getId() + " added");
        }
    }

    public void removeEmployee(String employeeId){
        boolean found = false;
        if(employeeId == null || employeeId.isEmpty()){
            System.out.println("Employee ID is null or empty");
        }
        else {
           for (Employee employee : employees) {
               if(employee.getId().equals(employeeId)){
                   employees.remove(employee);
                   System.out.println("Employee ID" + employeeId + " removed");
                   found = true;
                   break;
               }

           }
           if(!found) {
               System.out.println("Employee ID" + employeeId + " not found");
           }

        }
    }

    public Employee findEmployee(String employeeId){
        if(employeeId == null || employeeId.isEmpty()){
            System.out.println("Employee ID is null or empty");
        }
        else {
            for (Employee employee : employees) {
                if(employee.getId().equals(employeeId)){
                    return employee;
                }
            }
            System.out.println("Employee ID" + employeeId + " not found");
        }
        return null;
    }

    public double getTotalSalary(){
        double totalSalary = 0;
        if(employees.isEmpty()){
            System.out.println("No employees found");
            return totalSalary;
        }


        for(Employee employee : employees){
            totalSalary = totalSalary + employee.getSalary();
        }
        return totalSalary;
    }



    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Department that = (Department) o;
        return Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }
}
