package com.jacobs.designPatterns;

public class GameDisplay implements GameVisitor {

    public GameDisplay()
    {

    }

    public void visit(Game game)
    {
        System.out.println("Game: ");
    }

    public void visit(GameName gameName)
    {
        System.out.println("Name: ");
    }

    public void visit(Platform platform)
    {
        System.out.println("Platform: ");
    }


}
