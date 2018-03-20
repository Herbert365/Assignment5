package com.jacobs.designPatterns;

public class RunPrototype {
    public static void main( String[] args )
    {
        XboxConsole Xbox1 = new XboxConsole("Shooter");
        System.out.println("Xbox 1: " + Xbox1);
        XboxConsole Xbox2 = (XboxConsole)Xbox1.makeCopy();
        System.out.println("Xbox 2: " + Xbox2);

        PlaystationConsole Playstation1 = new PlaystationConsole("Racing");
        System.out.println("Playstation 1: " + Playstation1);
        PlaystationConsole Playstation2 = (PlaystationConsole)Playstation1.makeCopy();
        System.out.println("Playstation 2: " + Playstation2);
    }
}
