package com.jacobs.designPatterns;

public class Xbox implements GamePlayer{

    public void play(String fileName)
    {
        System.out.println("Loading Xbox game " + fileName);
    }

}
