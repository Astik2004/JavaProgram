package Java8.FI;

import java.util.function.Function;

public class FunctionPractice {
    public static void main(String[] args) {
        Function<String,Integer>lengthOfName=(name)->name.length();

        System.out.println(lengthOfName.apply("Astik"));
        Employee e1=new Employee(111,"Astik",56997.0);
        Employee e2=new Employee(112,"Astik",76997.0);


        Function<Employee, Double> extractSalary = Employee::getSalary;
        Function<Double,Double>tax=sal->sal*0.15;
        Function<Employee,Double>totalTax=extractSalary.andThen(tax);
        System.out.println(totalTax.apply(e1));
        System.out.println(extractSalary.apply(e2));
    }
}
