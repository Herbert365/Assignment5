package com.jacobs.designPatterns;

public class Pc implements GamePackage{

    public void playFile(String fileName)
    {
        System.out.println("Loading Pc game " + fileName);
    }
}
