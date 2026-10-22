package javaUpdate8_21.java8.FiAndLambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class LambdaAndFI {
    public static void main(String[] args) {
        String str="astikyadav";
        StringProcessor sp=(s)->(s.toUpperCase());
        StringProcessor reverse = input -> new StringBuilder(input).reverse().toString();

        System.out.println(sp.process(str));
        System.out.println(reverse.process(str));

        int multiplier = 2;

        Function<Integer,Integer> f = (x)->{
            return 2*multiplier;
        };

        List<Integer> list= Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        Predicate<Integer>isEven=x->x%2==0;

        Consumer<Integer>printEven=(x)->{
            System.out.println(x);
        };

        for(Integer x:list)
        {
            if(isEven.test(x))
            {
                printEven.accept(x);
            }
        }


    }
}
