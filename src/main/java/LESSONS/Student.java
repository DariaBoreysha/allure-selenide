package LESSONS;

import java.util.ArrayList;
import java.util.List;

public class Student {
    String name;
    int mark;
    int course;

    public Student(String name, int mark, int course) {
        this.course = course;
        this.name = name;
        this.mark = mark;
    }

    @Override
    public String toString() {
        return "\n"+ "Student{" +
                "name='" + name + '\'' +
                ", mark=" + mark +
                ", course=" + course +
                '}' + "\n";
    }

    public static void main(String[] args) {
        Student student1 = new Student("Julie", 5, 1);
        Student student2 = new Student("Joseph", 1, 3);
        Student student3 = new Student("Mark", 4, 5);

        List<Student> studentsList = new ArrayList<>();
        studentsList.add(student1);
        studentsList.add(student2);
        studentsList.add(student3);

        studentsList.sort((o1, o2) -> {
                    if (o1.mark > o2.mark)
                        return -1;
                    else if (o1.mark < o2.mark)
                        return 1;
                    else return 0;
                }
        );

        System.out.println(studentsList);

    }

}

