package javaUpdate8_21.java8.lambda;

import java.util.Arrays;
import java.util.function.Predicate;

public class LambdaPractice {
    static void main() {
//        String [] arr={"Astik","Ayush","Ram","Shyam"};
//        Predicate<String>p=s->s.charAt(0)=='A';
//
//        for(String s:arr)
//        {
//            if(p.test(s))
//            {
//                System.out.println(s);
//            }
//        }

        Person p1 = new Person("John", 25);
        Person p2 = new Person("Smith", 16);
        Person p3 = new Person("Raja", 36);
        Person p4 = new Person("Rani", 6);

        var persons= Arrays.asList(p1,p2,p3,p4);

        Predicate<Person>ageT=p->p.age>18;

        for(Person p:persons)
        {
            if(ageT.test(p))
            {
                System.out.println(p.name);
            }
        }


    }
}
