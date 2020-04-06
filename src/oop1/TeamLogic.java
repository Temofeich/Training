package oop1;

import java.util.List;

public class TeamLogic {

    private StudentLogic studentLogic;

    public TeamLogic(StudentLogic studentLogic){
        this.studentLogic = studentLogic;
    }

    public void printIsHonoursPupil(Team team){

        List<Student> students;
        students = team.getStudents();

        for (Student student : students)
        if (studentLogic.isHonoursPupil(student)){
            System.out.println(student.getSurname() + " , number of group: " + student.getNumberGroup());
        }
    }

}