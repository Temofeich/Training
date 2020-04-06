package oop1;

import java.util.Arrays;
import java.util.Objects;

public class Student {

    private String surname;
    private int numberGroup;
    private int[] marks;

    public Student (String surname, int numberGroup, int[] marks){
        this.surname = surname;
        this.numberGroup = numberGroup;
        this.marks = marks;
    }

    public String getSurname() {
        return surname;
    }

    public int getNumberGroup() {
        return numberGroup;
    }

    public int[] getMarks() {
        return marks;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return numberGroup == student.numberGroup &&
                surname.equals(student.surname) &&
                Arrays.equals(marks, student.marks);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(surname, numberGroup);
        result = 31 * result + Arrays.hashCode(marks);
        return result;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() +
                "{surname='" + surname + '\'' +
                ", numberGroup=" + numberGroup +
                ", marks=" + Arrays.toString(marks) +
                '}';
    }
}
