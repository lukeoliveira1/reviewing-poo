package Orders;

class Eletronic extends Product {

    public Eletronic(int id, String name, double value) {
        super(id, name, value);
    }

    @Override
    public double calculateDiscount() {
        return this.getValue() * 0.9;
    }
}
