package Java8.StreamAPI.Emp;

import java.util.Arrays;
import java.util.List;

public class EmployeeDatabase {

    public static List<Employee> getEmployees() {

        return Arrays.asList(
                new Employee(101, "Aman", "IT", 75000, 25, "Delhi"),
                new Employee(102, "Ravi", "HR", 55000, 30, "Mumbai"),
                new Employee(103, "Simran", "IT", 90000, 28, "Pune"),
                new Employee(104, "Karan", "Finance", 65000, 35, "Delhi"),
                new Employee(105, "Neha", "HR", 50000, 26, "Mumbai"),
                new Employee(106, "Vikas", "IT", 120000, 32, "Bangalore"),
                new Employee(107, "Priya", "Finance", 70000, 29, "Pune"),
                new Employee(108, "Amit", "IT", 85000, 27, "Delhi"),
                new Employee(109, "Sneha", "Marketing", 60000, 31, "Mumbai"),
                new Employee(110, "Rahul", "Marketing", 95000, 33, "Bangalore"),
                new Employee(111, "Aman", "IT", 75000, 25, "Delhi"),
                new Employee(112, "Suresh", "Sales", 58000, 29, "Chennai"),
                new Employee(113, "Pooja", "IT", 99000, 26, "Hyderabad"),
                new Employee(114, "Ritika", "Finance", 72000, 30, "Kolkata"),
                new Employee(115, "Ankit", "HR", 52000, 24, "Delhi"),
                new Employee(116, "Meena", "Marketing", 61000, 27, "Mumbai"),
                new Employee(117, "Deepak", "IT", 110000, 34, "Bangalore"),
                new Employee(118, "Nisha", "Sales", 57000, 28, "Pune"),
                new Employee(119, "Arjun", "Finance", 68000, 31, "Chennai"),
                new Employee(120, "Kriti", "IT", 88000, 25, "Hyderabad"),
                new Employee(121, "Manoj", "HR", 54000, 32, "Delhi"),

                new Employee(122, "Divya", "Marketing", 62000, 29, "Mumbai"),
                new Employee(123, "Harsh", "IT", 98000, 27, "Bangalore"),
                new Employee(124, "Sanjana", "Finance", 71000, 30, "Pune"),
                new Employee(125, "Yash", "Sales", 56000, 26, "Kolkata"),
                new Employee(126, "Komal", "HR", 53000, 28, "Delhi"),
                new Employee(127, "Rohan", "IT", 125000, 35, "Hyderabad"),
                new Employee(128, "Payal", "Marketing", 64000, 31, "Mumbai"),
                new Employee(129, "Varun", "Finance", 76000, 33, "Chennai"),
                new Employee(130, "Isha", "IT", 93000, 24, "Bangalore"),
                new Employee(131, "Tarun", "Sales", 59000, 29, "Pune"),
                new Employee(132, "Shreya", "HR", 51000, 27, "Delhi"),
                new Employee(133, "Nitin", "IT", 102000, 30, "Hyderabad"),
                new Employee(134, "Aarti", "Finance", 69000, 28, "Mumbai"),
                new Employee(135, "Lokesh", "Marketing", 67000, 32, "Kolkata"),
                new Employee(136, "Bhavna", "Sales", 60000, 26, "Chennai"),
                new Employee(137, "Kishore", "IT", 115000, 36, "Bangalore"),
                new Employee(138, "Tina", "HR", 55000, 25, "Pune"),
                new Employee(139, "Gaurav", "Finance", 74000, 34, "Delhi"),
                new Employee(140, "Sakshi", "Marketing", 66000, 29, "Mumbai")
        );
    }
}
