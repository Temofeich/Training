package oop1;

public class Main {
    public static void main(String[] args) {

        Student student1 = new Student("Ivanov", 4,new int[] {9,10,10,9,10});
        Student student2 = new Student("Petrov", 4,new int[] {9,10,8,9,10});
        Student student3 = new Student("Sidorov", 4,new int[] {9,7,10,9,7});
        Student student4 = new Student("Lukashenko", 3,new int[] {5,3,8,4,6});
        Student student5 = new Student("Tramp", 3,new int[] {3,3,5,8,9});
        Student student6 = new Student("Putin", 3,new int[] {5,4,4,7,5});
        Student student7 = new Student("Ekkel", 5,new int[] {10,10,10,10,10});
        Student student8 = new Student("Ganz", 5,new int[] {9,10,10,9,10});
        Student student9 = new Student("Sellenger", 1,new int[] {9,7,10,9,10});
        Student student10 = new Student("Norris", 2,new int[] {9,10,10,9,10});

        StudentLogic stLog = new StudentLogic();
        TeamLogic tLog = new TeamLogic(stLog);

        Team team1 = new Team(15);

        team1.add(student1);
        team1.add(student2);
        team1.add(student3);
        team1.add(student4);
        team1.add(student5);
        team1.add(student6);
        team1.add(student7);
        team1.add(student8);
        team1.add(student9);
        team1.add(student10);

        tLog.printIsHonoursPupil(team1);
    }
}
