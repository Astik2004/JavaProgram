package Java8.StreamAPI.Emp;

import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        List<Employee> employees = EmployeeDatabase.getEmployees();

        //employees.forEach(System.out::println);
//        employees.stream()
//                .filter(emp->emp.getDepartment().equals("HR"))
//                .map(Employee::getName)
//                .forEach(System.out::println);
//        List<EmployeeDTO>empDto=employees.stream()
//                .map(emp->new EmployeeDTO(emp.getId(),emp.getName(),emp.getDepartment(),emp.getSalary(),emp.getAge(),emp.getCity()))
//                .collect(Collectors.toList());
//        empDto.forEach(System.out::println);

        employees.stream()
                .map(Employee::getSalary)
                .sorted()
                .forEach(System.out::println);
    }
}
