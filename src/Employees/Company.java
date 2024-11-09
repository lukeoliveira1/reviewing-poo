package Employees;

import java.util.ArrayList;

class Company<T extends Employee> {
    private ArrayList<T> employees = new ArrayList<>();

    public void addEmployee(T employee) {
        employees.add(employee);
    }

    public void removeEmployee(T employee) {
        employees.remove(employee);
    }

    public void listEmployees() {
        employees.forEach((employee) -> {
            System.out.println(employee.getName() + " - Salário Final: R$ " + employee.calculateSalary());
        });
    }
}
