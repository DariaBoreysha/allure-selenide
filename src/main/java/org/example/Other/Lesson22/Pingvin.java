package org.example.Other.Lesson22;

public class Pingvin extends Bird {
    public Pingvin(String name) {
        super(name);
        this.name = name;
    }
    @Override
    public void eat(){
        System.out.println("eat ryba");
    }
    @Override
    public void sleep(){
        System.out.println("Spyat vmeste");
    }
    @Override
    public void fly(){
        System.out.println("ne letayet");
    }
    @Override
    public void speak(){
        System.out.println("Nie umeet pet'");
    }
}
