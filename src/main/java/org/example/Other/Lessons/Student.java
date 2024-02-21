package org.example.Other.Lessons;

public class Student {
/*    int studentID;
    String name;
    String surname;
    int course;


    Student(){
    }
    Student(int id1, String name1, String surname1, int course1) {
      studentID = id1;
      name = name1;
      surname = surname1;
      course = course1;
    }*/

    StringBuilder name;
    int course;
    int grade;

    public Student(StringBuilder name, int course, int grade) {
        this.name = name;
        this.course = course;
        this.grade = grade;
    }

    public void showInfo(){
        StringBuilder a = getName();
        int b = getCourse();
        int c = getGrade();
        System.out.println("Student's name is: " + a);
        System.out.println("Student's course is: " + b);
        System.out.println("Student's grade is: " + c);

    }
    public StringBuilder getName() {
        return name;
    }

    public int getCourse() {
        return course;
    }

    public int getGrade() {
        return grade;
    }
}
