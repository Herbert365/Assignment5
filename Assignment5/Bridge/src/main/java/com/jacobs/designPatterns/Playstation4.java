package com.jacobs.designPatterns;

public class Playstation4 implements Console{

    public void on() {
        System.out.println("Playstation4 is turned on.");
    }


    public void off() {
        System.out.println("Playstation4 is turned off.");
    }


    public void gameInsert(String gameName) {
        System.out.println("Playstation4: Game inserted - " + gameName);
    }

}
