package com.jacobs.designPatterns;

public class XboxOne implements Console{
    public void on() {
        System.out.println("XboxOne is turned on.");
    }


    public void off() {
        System.out.println("XboxOne is turned off.");
    }


    public void gameInsert(String gameName) {
        System.out.println("XboxOne: Game inserted - " + gameName);
    }
}
