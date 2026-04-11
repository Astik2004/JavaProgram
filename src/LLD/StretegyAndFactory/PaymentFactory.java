package LLD.StretegyAndFactory;

public class PaymentFactory {
    public static PaymentStretegy getPaymentStretegy(String type){
        if("UPI".equalsIgnoreCase(type)){
            return new UpiPayment();
        }
        else if("CARD".equalsIgnoreCase(type)){
            return new CardPayment();
        }
        else if("PAYPAL".equalsIgnoreCase(type)){
            return new PayPal();
        }
        else
        {
            throw new IllegalArgumentException("Invalid payment type");
        }
    }
}
