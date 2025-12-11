package Java8.StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stream {
    public static void main(String[] args) {
        int[] a={12,13,14,15,2,3,4,5};
        Arrays.stream(a).filter(x->x%2==0).forEach(System.out::println);

        List<String> words = List.of("apple", "banana", "APPLE", "grape", "kiwi", "melon", "kiwi");

        List<String> result = words.stream()
                .distinct()                             // Intermediate 1: [apple, banana, APPLE, grape, kiwi, melon]
                .filter(w -> w.length() > 4)            // Intermediate 2 (Predicate): [apple, banana, APPLE, grape, melon]
                .map(String::toUpperCase)               // Intermediate 3 (Function): [APPLE, BANANA, APPLE, GRAPE, MELON]
                .distinct()                             // Intermediate 4: [APPLE, BANANA, GRAPE, MELON]
                .limit(3)                               // Intermediate 5: [APPLE, BANANA, GRAPE]
                .collect(Collectors.toList());          // Terminal: Collects the result into a List

        System.out.println(result); // Output: [APPLE, BANANA, GRAPE]
    }
}
