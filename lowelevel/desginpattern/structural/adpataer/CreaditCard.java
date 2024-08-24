package lowelevel.desginpattern.structural.adpataer;

public class CreaditCard implements PaymentSytem {

    @Override
    public void makePayment(double amount) {
        System.out.println("CreditCardPayment"+amount);
    }
}
