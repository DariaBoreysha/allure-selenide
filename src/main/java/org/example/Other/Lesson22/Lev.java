package org.example.Other.Lesson22;

public class Lev extends Mammal{
    public Lev(String name) {
        super(name);
        this.name = name;
    }
    @Override
    public void eat(){
        System.out.println("est myaso");
    }
    @Override
    public void sleep(){
        System.out.println("chast dnya spit");
    }
    @Override
    public void run(){
        System.out.println("nie bystryi");
    }
}
