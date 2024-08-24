package lowelevel.desginpattern.structural.adpataer;

public class PaymentAdpater implements PaymentProcessor {
    private PaymentSytem paymentSytem;

    public PaymentAdpater(PaymentSytem paymentSytem) {
        this.paymentSytem = paymentSytem;
    }

    @Override
    public void processPayment(double amount) {
        paymentSytem.makePayment(amount);
    }
}
