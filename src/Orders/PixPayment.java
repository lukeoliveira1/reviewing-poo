package Orders;

class PixPayment implements Payment {

    @Override
    public boolean processPayment() {
        System.out.println("Pagamento no pix realizado com sucesso!");
        return true;
    }
}
