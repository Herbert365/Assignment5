package com.jacobs.designPatterns;

public class Playstation implements GamePackage{

    public void playFile(String fileName)
    {
        System.out.println("Loading Playstation game " + fileName);
    }
}
