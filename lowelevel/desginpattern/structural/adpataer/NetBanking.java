package lowelevel.desginpattern.structural.adpataer;

public class NetBanking implements PaymentSytem {

    @Override
    public void makePayment(double amount) {
        System.out.println("Netbanking payment");
    }
}
