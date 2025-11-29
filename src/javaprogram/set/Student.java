package javaprogram.set;

public class Student implements Comparable<Student>{
    private String id;
    private String name;
    private String college;

    public Student(String id, String name, String college) {
        this.id = id;
        this.name = name;
        this.college = college;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    @Override
    public int compareTo(Student o) {
        return this.id.compareTo(o.id);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", college='" + college + '\'' +
                ", id='" + id + '\'' +
                '}';
    }
}
