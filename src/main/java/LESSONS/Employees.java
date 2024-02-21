package LESSONS;

import java.util.*;


public class Employees implements Comparable<Employees> {
    protected int salary;
    protected String name;
    protected int id;

    public Employees(int salary, String name, int id) {
        this.salary = salary;
        this.name = name;
        this.id = id;
    }

    @Override
    public int compareTo(Employees anotherEmp) {
        int result = this.id - anotherEmp.id;
        if (result == 0) {
            result = this.salary - anotherEmp.salary;
        }
        if (result == 0) {
            result = this.name.compareTo(anotherEmp.name);
        }
        return result;
    }


    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Employees e = ((Employees) obj);
        return Objects.equals(name, e.name) && salary == e.salary && id == e.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, salary);
    }

    @Override
    public String toString() {
        return "{Employee №" + id +
                " With the name: " + name +
                " Worker's salary is " + salary + "$}";
    }

    public static void sortingArrays() {
        Employees emp4 = new Employees(4500, "Tark", 4);
        Employees emp5 = new Employees(4500, "Turk", 4);
        List<Employees> employeesList = new ArrayList<>();

        employeesList.add(emp4);
        employeesList.add(emp5);

        System.out.println(employeesList);
        Collections.sort(employeesList);
        System.out.println(employeesList);


    }




    public static void bubbleSorting(int[] numberArray){
        int[] array = Arrays.stream(numberArray).sorted().toArray();
        for(int number : array){
            System.out.println(number);
        }
    }

    public static void main(String[] args) {
        int[] numbersForSorting = {1,5,8,10,22,15,0,44};
        bubbleSorting(numbersForSorting);

    }

}


