package Java8.FI;

import java.util.List;
import java.util.function.Predicate;

public class PredicatePractice {
    public static void main(String[] args) {
        List<String>name= List.of("Astik","Yadav","Ankit","Yadav");
        Predicate<String>startWithA=(s)->s.startsWith("A");

        name.stream().filter(startWithA).forEach(System.out::println);

        Predicate<Integer> isEven = n -> n % 2 == 0;
        Predicate<Integer> isDivisibleByThree = n -> n % 3 == 0;
        Predicate<Integer> isGreaterThanTen = n -> n > 10;

// Condition 1: Number is Even AND Greater than 10
        Predicate<Integer> evenAndBig = isEven.and(isGreaterThanTen);

// Condition 2: Number is (Divisible by 3 OR Even)
        Predicate<Integer> divisibleOrEven = isDivisibleByThree.or(isEven);

// Condition 3: Number is NOT Even (i.e., it's Odd)
        Predicate<Integer> isOdd = isEven.negate();


        int number = 18;
        System.out.println("Even and Big (18): " + evenAndBig.test(number)); // true (18 is even and > 10)
        System.out.println("Divisible by 3 or Even (18): " + divisibleOrEven.test(number)); // true
        System.out.println("Is Odd (18): " + isOdd.test(number)); // false
    }
}
