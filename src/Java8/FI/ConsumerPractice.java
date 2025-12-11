package Java8.FI;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerPractice {
    public static void main(String[] args) {
        List<String>names=List.of("Astik","Yadav","Prayag");
        Consumer<String> c1=(name)-> System.out.println(name.length());
        Consumer<String>c2=(name)-> System.out.println(name.toUpperCase());

        c1.accept("Astik");
        c2.accept("Astik");
        names.forEach(c2.andThen(c1));
    }
}
