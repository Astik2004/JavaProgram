package javaUpdate8_21.java8.lambda;

import java.util.Arrays;
import java.util.function.Predicate;

public class MainPractice {
    static void main(String[] args) {
        Employee e1 = new Employee("Anil", "Chennai", "DevOps");
        Employee e2 = new Employee("Rani", "Pune", "Networking");
        Employee e3 = new Employee("Ashok", "Hyd", "DB");
        Employee e4 = new Employee("Ganesh", "Hyd", "DB");

        var Employees = Arrays.asList(e1, e2, e3, e4);

        Predicate<Employee>p1=e->e.location.equals("Hyd");
        Predicate<Employee>p2=e->e.dept.equals("DB");
        Predicate<Employee>p3=e->e.name.startsWith("A");

        Predicate<Employee>p4=p1.and(p2);

        for(Employee e:Employees)
        {
            if(p4.test(e))
            {
                System.out.println(e.name);
            }
        }
    }
}
