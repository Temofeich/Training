package oop1;

import java.util.ArrayList;
import java.util.List;

public class Team {

    private List<Student> students;
    private int teamSize;

    public Team(int teamSize){
        this.teamSize = teamSize;
        students = new ArrayList<>(teamSize);
    }

    public boolean add(Student student){
        if (students.size() >= teamSize){
            return false;
        }
        students.add(student);
        return true;
    }

    public List<Student> getStudents() {
        return students;
    }
}
