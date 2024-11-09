package Employees;

public class Main {
    public static void main(String[] args) {
        Company<Employee> company = new Company<>();

        Employee manager = new Manager("Carlos", 5000);
        Employee analyst = new Analyst("Ana", 3000);

        company.addEmployee(manager);
        company.addEmployee(analyst);

        System.out.println("Lista de Funcionários:");
        company.listEmployees();

        company.removeEmployee(analyst);

        System.out.println("Lista de Funcionários:");
        company.listEmployees();

    }
}
