package oop3.logic;

import oop3.entity.Student;

public class StudentLogic {

    public boolean isALevelStudent (Student student) {
        int [] marks = student.getMarks();
        for (int mark : marks) {
            if (mark != 5) {
                return false;
            }
        }
        return true;
    }
}
