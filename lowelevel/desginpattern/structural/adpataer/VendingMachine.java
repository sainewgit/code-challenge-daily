package lowelevel.desginpattern.structural.adpataer;

public class VendingMachine {
    private PaymentProcessor paymentProcessor;

    public void setPaymentMethod(PaymentProcessor processor) {
        this.paymentProcessor = processor;
    }

    public void purchaseProduct(double price) {
        paymentProcessor.processPayment(price);
        dispenseProduct();
    }

    private void dispenseProduct() {
        System.out.println("Dispensing product...");
    }
}
