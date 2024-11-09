package Orders;

abstract class Product {
    private int id;
    private String name;
    private double value;

    public Product(int id, String name, double value) {
        this.id = id;
        this.name = name;
        this.value = value;
    }

    abstract double calculateDiscount();

    public String getName() {
        return name;
    }

    public double getValue() {
        return value;
    }
}
