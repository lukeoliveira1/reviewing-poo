package Employees;

abstract class Employee {
    private int id;
    private String name;
    private double basicSalary;

    public Employee(String name, double basicSalary) {
        this.name = name;
        this.basicSalary = basicSalary;
    }

    public String getName() {
        return name;
    }

    public abstract double calculateSalary();

    public double getBasicSalary() {
        return basicSalary;
    }
}
