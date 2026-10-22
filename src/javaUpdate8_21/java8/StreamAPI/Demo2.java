package javaUpdate8_21.java8.StreamAPI;

import java.util.Arrays;
import java.util.List;

public class Demo2 {
    static void main() {
        List<String> javacourses = Arrays.asList("corejava", "advjava", "springboot", "restapi", "microservices");
        System.out.println("----Limit Method----");
        javacourses.stream()
                .limit(2)
                .forEach(System.out::println);
        System.out.println("----Skip Method----");
        javacourses.stream()
                .skip(2)
                .forEach(System.out::println);

        List<String> names = Arrays.asList("raja", "rani", "raja", "rani", "guru");
        names.stream()
                .distinct()
                .forEach(System.out::println);

    }
}
