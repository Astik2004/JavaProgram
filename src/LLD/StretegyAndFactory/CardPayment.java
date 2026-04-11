package LLD.StretegyAndFactory;

public class CardPayment implements PaymentStretegy {
    @Override
    public void pay(long amount) {
        System.out.println("Payment using Card Payment : "+amount);
    }
}
