package javaUpdate8_21.java8.StreamAPI;

class Employee {
    private final String name;
    private final String department;
    private final int salary;

    Employee(String name, String department, int salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public int getSalary() {
        return salary;
    }
}
