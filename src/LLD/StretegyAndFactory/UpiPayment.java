package LLD.StretegyAndFactory;

public class UpiPayment implements PaymentStretegy {
    @Override
    public void pay(long amount) {
        System.out.println("Payment using UPI Payment : "+amount);
    }
}
