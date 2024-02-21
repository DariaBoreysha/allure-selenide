package org.example.Other.Lesson22;

public class Mechenosec extends Fish{
    public Mechenosec(String name) {
        super(name);
        this.name = name;
    }
    @Override
    public void swim(){
        System.out.println("Mechenosec krasivo plavayet");
    }
    @Override
    public void eat(){
        System.out.println("Mechenosec est ribiy korm");
    }
}
