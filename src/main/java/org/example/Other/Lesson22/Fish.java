package org.example.Other.Lesson22;

abstract class Fish extends Animal {
    String name;

    @Override
    public void sleep(){
        System.out.println("watch it sleeping");
    }

    abstract void swim();
    public Fish(String name) {
        super(name);
        this.name = super.name;
    }

}
