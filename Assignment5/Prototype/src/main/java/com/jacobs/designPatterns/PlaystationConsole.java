package com.jacobs.designPatterns;

public class PlaystationConsole implements CloneObject{

    private String console;

    public PlaystationConsole()
    {

    }

    public PlaystationConsole(String console)
    {
        this.console = console;
    }

    public CloneObject makeCopy()
    {
        return new PlaystationConsole(console);
    }

    public String toString()
    {
        return "Playstation Category: " + console;
    }
}
