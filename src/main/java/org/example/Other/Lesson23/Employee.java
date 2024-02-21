package org.example.Other.Lesson23;

import java.util.ArrayList;
import java.util.function.Predicate;

public class Employee {
    String name;
    String department;
    int salary;

    public Employee(String name, String department, int salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }
}

class TestEmployee {

    private static Employee e1;

    static void printEmployee(Employee e) {
        System.out.println("Employee's name: " + e.name);
        System.out.println("Employee's department: " + e.department);
        System.out.println("Employee's salary: " + e.salary);
    }

    static void filtraciyaRabotnikov(ArrayList<Employee> al, Predicate<Employee> p) {
        for (Employee d : al) {
            if (p.test(d)) {
                printEmployee(d);
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<Employee> al = new ArrayList<>();
        Employee e1 = new Employee("Dom", "Dom", 450);
        Employee e2 = new Employee("John", "IT", 220);
        Employee e3 = new Employee("Elena", "Biology", 250);
        al.add(e1);
        al.add(e2);
        al.add(e3);
        filtraciyaRabotnikov(al, e -> e.department == "IT" && e.salary > 200);
        System.out.println("----------------------------------------------------------------");
        filtraciyaRabotnikov(al, e -> e.name.startsWith("E") && e.salary != 450);
        System.out.println("----------------------------------------------------------------");
        filtraciyaRabotnikov(al, e -> e.name.equals(e.department));
    }

}




