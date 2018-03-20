package com.jacobs.designPatterns;

public class RunFactory {
    public static void main(String[] args)
    {
        AbstractFactory gameFactory = FactoryProducer.getFactory("Game");

        Game gm = gameFactory.getGame("Xbox");
        gm.gameType();
    }
}
