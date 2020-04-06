package oop1;

public class StudentLogic {

    public boolean isHonoursPupil(Student student){
        int [] marks = student.getMarks();
        for (int mark : marks){
            int minMarkForHonoursPupil = 9;
            if (mark < minMarkForHonoursPupil){
                return false;
            }
        }
        return true;
    }
}
