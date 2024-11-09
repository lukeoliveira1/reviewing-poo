package Orders;

class CardPayment implements Payment {

    @Override
    public boolean processPayment() {
        System.out.println("Pagamento no cartão realizado com sucesso!");
        return true;
    }
}
