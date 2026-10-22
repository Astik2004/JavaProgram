package javaUpdate8_21.java8.FiAndLambda;

import java.util.function.BiFunction;
import java.util.function.Function;

public class FunctionFi {
    static void main(String[] args) {
        Function<String ,Integer>f=s->s.length();
        System.out.println(f.apply("Astik"));

        BiFunction<Integer,Integer,Integer>bf=(a,b)->a+b;
        System.out.println(bf.apply(1,2));
    }
}
