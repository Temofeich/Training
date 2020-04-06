package oop3.entity;

import java.util.ArrayList;
import java.util.List;

public class Group {

    private List<Student> students;
    private int groupSize;

    public Group(int groupSize){
        this.groupSize = groupSize;
        students = new ArrayList<>(groupSize);
    }

    public boolean add(Student student) {
        if (students.size() >= groupSize){
            return false;
        }
        students.add(student);
        return true;
    }

    public void remove(Student student) {
        students.remove(student);
    }

    public List<Student> getStudents() {
        return students;
    }

    public int getGroupSize() {
        return groupSize;
    }
}
