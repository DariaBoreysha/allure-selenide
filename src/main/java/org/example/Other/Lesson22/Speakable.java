package org.example.Other.Lesson22;

interface Speakable {
    default void speak(){
        System.out.println("somebody speaks");
    };
}
