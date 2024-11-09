package Employees;

class Analyst extends Employee implements Bonus {

    public Analyst(String name, double basicSalary) {
        super(name, basicSalary);
    }

    @Override
    public double calculateBonus(double percentage) {
        return (percentage / 100) * this.getBasicSalary();
    }

    @Override
    public double calculateSalary() {
        return calculateBonus(5) + this.getBasicSalary();
    }
}
