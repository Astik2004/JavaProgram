package LLD.StretegyAndFactory;

public class MainLLD {
    static void main(String[] args) {
        PaymentStretegy paymentStretegy = PaymentFactory.getPaymentStretegy("Paypal");
        paymentStretegy.pay(10);
    }
}
