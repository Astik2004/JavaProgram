package javaUpdate8_21.java8.StreamAPI;

import java.util.Arrays;
import java.util.List;

public class StreamAPI {
    static void main(String[] args) {
        Employee e1 = new Employee("John", 35, 55000.00);
        Employee e2 = new Employee("David", 25, 45000.00);
        Employee e3 = new Employee("Buttler", 35, 35000.00);
        Employee e4 = new Employee("Steve", 45, 65000.00);

        List<Employee> employees = Arrays.asList(e1,e2,e3,e4);

        employees.stream()
                .filter(e->e.age>25 && e.salary>5500)
                .map(e->e.name+"--"+e.age+"--"+e.salary)
                .forEach(e->System.out.println(e));


    }
}
