package LLD.StretegyAndFactory;

public class PayPal implements PaymentStretegy {
    @Override
    public void pay(long amount) {
        System.out.println("Paypal Payment Stretegy: " + amount);
    }
}
