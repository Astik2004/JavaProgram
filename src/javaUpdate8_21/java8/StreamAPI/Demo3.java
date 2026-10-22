package javaUpdate8_21.java8.StreamAPI;

import java.util.Arrays;
import java.util.List;

public class Demo3 {
    static void main(String[] args) {
        Person p1 = new Person("John", "USA");
        Person p2 = new Person("Steve", "JAPAN");
        Person p3 = new Person("Ashok", "INDIA");
        Person p4 = new Person("Ching", "CHINA");
        Person p5 = new Person("Astik","INDIA");

        List<Person> people = Arrays.asList(p1,p2,p3,p4,p5);

        boolean status=people.stream().anyMatch(p->p.country.equals("USA"));
        System.out.println(status);

        boolean status2=people.stream().allMatch(p->p.country.equals("USA"));
        System.out.println(status2);

        boolean status3=people.stream().noneMatch(p->p.country.equals("AB"));
        System.out.println(status3);

    }
}
