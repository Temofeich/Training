package oop3;

import oop3.entity.Group;
import oop3.entity.Student;
import oop3.logic.GroupLogic;
import oop3.logic.StudentLogic;

public class Main {
    public static void main(String[] args) {

        Student student1 = new Student("Olga", 20, new int[] {5,5,5,5,5});
        Student student2 = new Student("Petr", 19, new int[] {5,5,4,5,5});
        Student student3 = new Student("Masha", 20, new int[] {5,5,5,5,5});
        Student student4 = new Student("Pavel", 21, new int[] {5,5,5,3,5});
        Student student5 = new Student("Sasha", 19, new int[] {5,2,5,3,5});

        StudentLogic stLog = new StudentLogic();
        GroupLogic grLog = new GroupLogic(stLog);

        Group gr1 = new Group(10);

        gr1.add(student1);
        gr1.add(student2);
        gr1.add(student3);
        gr1.add(student4);
        gr1.add(student5);

        System.out.println(grLog.countOfALevelStudents(gr1));
    }
}
