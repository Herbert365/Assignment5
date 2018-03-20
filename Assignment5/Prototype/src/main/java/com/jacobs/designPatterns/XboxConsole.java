package com.jacobs.designPatterns;

public class XboxConsole implements CloneObject{
    private String ConsoleType;

    public XboxConsole()
    {

    }

    public XboxConsole(String ConsoleType)
    {
        this.ConsoleType = ConsoleType;
    }

    public CloneObject makeCopy()
    {
        return new XboxConsole(ConsoleType);
    }

    public String toString()
    {
        return "Xbox Category: " + ConsoleType;
    }
}
