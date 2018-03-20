package com.jacobs.designPatterns;

public class FactoryProducer {

    public static AbstractFactory getFactory(String choice)
    {
        if(choice.equalsIgnoreCase("Game"))
            return new GameFactory();

        return null;
    }
}
