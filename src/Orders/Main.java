package Orders;

public class Main {
    public static void main(String[] args) {

        Product electronic1 = new Eletronic(1, "Smartphone", 1000.0);
        Product clothing1 = new Clothing(2, "Shirt", 50.0);

        Payment cardPayment = new CardPayment();
        Payment pixPayment = new PixPayment();

        System.out.println("Processando pagamento para " + electronic1.getName() + "...");
        if (cardPayment.processPayment()) {
            System.out.println("Pagamento efetuado com sucesso! Valor: $" + electronic1.calculateDiscount());
        }

        System.out.println("\nProcessando pagamento para " + clothing1.getName() + "...");
        if (pixPayment.processPayment()) {
            System.out.println("Pagamento efetuado com sucesso! Valor: $" + clothing1.calculateDiscount());
        }

    }
}
