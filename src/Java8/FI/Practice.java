package Java8.FI;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Practice {
    public static void main(String[] args) {
        List<Integer>data= List.of(12,13,1,4,15,16,17,18);

        Consumer<String>names=name-> System.out.println(name);
        names.accept("Astik");

        Predicate<Integer>isEven=(n)->n%2==0;
        System.out.println(isEven.test(12));

        Function<List<Integer>,Integer>getEvenList=(n)->n.size();
        System.out.println(getEvenList.apply(data));

        Supplier<Double>number=(Math::random);
        System.out.println(number.get());

    }
}
