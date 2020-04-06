package oop3.logic;

import oop3.entity.Group;
import oop3.entity.Student;

import java.util.List;

public class GroupLogic {

    private StudentLogic studentLogic;

    public GroupLogic(StudentLogic studentLogic){
        this.studentLogic = studentLogic;
    }

    public int countOfALevelStudents(Group group){
        int countOfALevelStudents = 0;
        List<Student> students;

        students =group.getStudents();

        for (Student student : students){
            if (studentLogic.isALevelStudent(student)){
                countOfALevelStudents++;
            }

        }
        return countOfALevelStudents;
    }
}
