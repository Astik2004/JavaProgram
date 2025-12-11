package Java8.functionalInterface;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.function.Supplier;

public class SupplierPractice {
    public static void main(String[] args) {
        Supplier<String>dateTime=()->"Current Time "+ LocalDateTime.now();

        System.out.println(dateTime.get());
    }
}
