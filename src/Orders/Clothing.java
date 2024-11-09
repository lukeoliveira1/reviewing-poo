package Orders;

class Clothing extends Product {

    public Clothing(int id, String name, double value) {
        super(id, name, value);
    }

    @Override
    public double calculateDiscount() {
        return this.getValue() * 0.8;
    }
}
