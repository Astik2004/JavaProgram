package javaUpdate8_21.java8.FiAndLambda;

import java.util.function.Supplier;

public class SuplierFI {
    static void main() {
        Supplier<String>s=()->{
            String otp="";
            for(int i=1;i<=6;i++)
            {
                otp=otp+(int)(Math.random()*10);
            }
            return otp;
        };
        for(int i=1;i<=6;i++){
            System.out.println(s.get());
        }
    }
}
