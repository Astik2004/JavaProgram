package Java8.StreamAPI;

import java.util.List;

public class Practice {
    public static void main(String[] args) {
        List<Integer>numbers=List.of(12,13,14,15,16,17,18,19,20,21);
        //numbers.stream().filter(n->n%2==0).forEach(n-> System.out.println(n));
        numbers.stream().map(n->n*n).forEach(n-> System.out.print(n+","));
        System.out.println("");
        long count=numbers.stream().filter(n->n>15).count();
        System.out.println(count);
        numbers.stream().sorted().forEach(n-> System.out.println(n));
    }
}
