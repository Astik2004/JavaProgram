package Java8.StreamAPI;

import java.util.List;
import java.util.stream.Collectors;

public class StreamCode {
    public static void main(String[] args) {
        List<Employee>employees=List.of(
                new Employee(111,"Astik",25000.0),
                new Employee(112,"Ankit",50000.0),
                new Employee(113,"Prayag",40000.0),
                new Employee(114,"Ayush",20000.0),
                new Employee(115,"Akarsh",30000.0)
        );

        List<String>name=employees.stream().
                filter(e->e.getSalary()>25000).
                map(Employee::getName).
                map(String::toUpperCase).
                collect(Collectors.toList());

        for(String s:name)
        {
            System.out.println(s);
        }
    }
}
