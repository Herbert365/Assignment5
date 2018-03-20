package com.jacobs.designPatterns;

public class Controller extends ControllerAbs{

    public Controller(Console con)
    {
        super(con);
    }

    public void takeGame(String gameName)
    {
        gameInsert(gameName);
    }

}
