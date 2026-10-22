package javaUpdate8_21.java8.StreamAPI;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamAPI {
    static void main(String[] args) {
        List<Employee> employees = List.of(
                new Employee("Amit", "IT", 60000),
                new Employee("Rahul", "IT", 40000),
                new Employee("Priya", "HR", 70000),
                new Employee("Neha", "HR", 30000),
                new Employee("Vikas", "Finance", 80000)
        );

        Map<String,Integer> totalSalary=employees.stream()
                .collect(Collectors.groupingBy(
                        Employee::getDepartment,
                        Collectors.summingInt(Employee::getSalary)
                ));

        Map<String,Double>avgSalary=employees.stream()
                        .collect(Collectors.groupingBy(
                                Employee::getDepartment,
                                Collectors.averagingInt(Employee::getSalary)
                        ));

        Map<String,Long>countEmployee=employees.stream()
                .collect(Collectors.groupingBy(
                       Employee::getDepartment,
                       Collectors.counting()
                ));

        Map<String, Optional<Employee>> highestPaid =
                employees.stream()
                        .collect(Collectors.groupingBy(
                                Employee::getDepartment,
                                Collectors.maxBy(
                                        Comparator.comparingInt(Employee::getSalary)
                                )
                        ));

        Map<String,IntSummaryStatistics>result=employees.stream()
                .collect(Collectors.groupingBy(
                        Employee::getDepartment,
                        Collectors.summarizingInt(Employee::getSalary)
                ));
        IntSummaryStatistics data=result.get("IT");

        System.out.println(data.getMax());
        System.out.println(data.getMin());
        System.out.println(data.getSum());
        System.out.println(data.getAverage());
        System.out.println(data.getCount());


//        System.out.println("Total Salary : "+totalSalary);
//        System.out.println("Average Salary : "+avgSalary);
//        System.out.println("Employee Count : "+countEmployee);
//        System.out.println("Highest paid: " + highestPaid);
//        highestPaid.forEach((dep,emp)->{
//            emp.ifPresent(e-> System.out.println(dep+"-->"+e.getName()+","+e .getSalary()));
//        });

    }
}
