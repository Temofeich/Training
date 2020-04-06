package oop3.entity;

import java.util.Arrays;
import java.util.Objects;

public class Student {

    private String name;
    private int age;
    private int[] marks;

    public Student(String name, int age, int[] marks){
        this.name = name;
        this.age = age;
        this.marks = marks;
    }

    public int[] getMarks() {
        return marks;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age &&
                name.equals(student.name) &&
                Arrays.equals(marks, student.marks);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(name, age);
        result = 31 * result + Arrays.hashCode(marks);
        return result;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", marks=" + Arrays.toString(marks) +
                '}';
    }
}
