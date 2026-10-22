package javaUpdate8_21.java8.StreamAPI;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FirstDemo {
    static void main(String[] args) {
        //List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        //List<String> names = Arrays.asList("John", "Anushka", "Anupama", "Smith", "Ashok");
        //names.stream().filter(s->s.startsWith("A")).forEach(System.out::println);
        //list.stream().filter(x->x%2==0).forEach(System.out::println);

        List<String> names = Arrays.asList("Ashok", "Anil", "Raju", "Rani", "John", "Akash", "Charles");
        names.stream()
                .filter(s->s.startsWith("A"))
                .map(name->name.toUpperCase()+"-"+name.length())
                .forEach(System.out::println);

    }
}
