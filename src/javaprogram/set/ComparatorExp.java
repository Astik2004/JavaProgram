package javaprogram.set;

import java.util.Set;
import java.util.TreeSet;

public class ComparatorExp {
    public static void main(String[] args) {

            Set<Student> sset=new TreeSet<>();
            Student s1=new Student("104","Astik","UCER");
            Student s2=new Student("102","Ankit","UCER");
            Student s3=new Student("103","Akarsh","UCER");
            sset.add(s1);
            sset.add(s2);
            sset.add(s3);
            for(Student s:sset)
            {
                System.out.println(s);
            }
    }
}
