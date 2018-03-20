package com.jacobs.designPatterns;

public class GameFactory extends AbstractFactory{

    public Game getGame(String gameType)
    {
        if(gameType == null)
            return null;
        else if(gameType == "Xbox")
            return new Xbox();
        else if (gameType == "Playstation")
            return new Playstation();

        return null;
    }
}
