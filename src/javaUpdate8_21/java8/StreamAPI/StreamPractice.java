package javaUpdate8_21.java8.StreamAPI;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamPractice {
    static void main() {
//        List<Integer> salaries = List.of(
//                50000, 70000, 60000, 70000, 40000, 60000
//        );
//        salaries.stream()
//                .distinct()
//                .sorted(Comparator.reverseOrder())
//                .skip(1)
//                .limit(1)
//                .forEach(System.out::println);

        List<Integer> numbers = List.of(
                10, 20, 30, 20, 40, 10, 50, 20
        );

        Map<Integer,Long>m=numbers.stream()
                .collect(Collectors.groupingBy(
                        Integer::intValue,
                        Collectors.counting()
                ));
        m.forEach((k,v)->{
            if(v>1)
            {
                System.out.println(k);
            }
        });
    }
}
