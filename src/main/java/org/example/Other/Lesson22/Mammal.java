package org.example.Other.Lesson22;

abstract class Mammal extends Animal implements Speakable{
    public Mammal(String name) {
        super(name);
        this.name = name;
    }
    abstract void run();
}
