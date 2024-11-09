package Employees;

class Manager extends Employee implements Bonus {

    public Manager(String name, double basicSalary) {
        super(name, basicSalary);
    }

    @Override
    public double calculateBonus(double percentage) {
        return (percentage / 100) * this.getBasicSalary();
    }

    @Override
    public double calculateSalary() {
        return calculateBonus(10) + this.getBasicSalary();
    }
}
