package lowelevel.desginpattern.structural.adpataer;

public class Client {

    public static void main(String[] args) {
        VendingMachine vm=new VendingMachine();

        //user choose to pay with card
         PaymentAdpater paymentAdpater=new PaymentAdpater(new CreaditCard());

        vm.setPaymentMethod(paymentAdpater);
        vm.purchaseProduct(1.0);

    }
}
