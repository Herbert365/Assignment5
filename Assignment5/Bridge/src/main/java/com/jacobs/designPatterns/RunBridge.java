package com.jacobs.designPatterns;

public class RunBridge {
    public static void main(String[] args){
        Console con = new XboxOne();
        Controller c = new Controller(con);
        c.takeGame("Fallout 4");
    }
}
