package com.jacobs.designPatterns;

public class GameAdapter implements GamePlayer{

    private GamePackage game;

    public GameAdapter(GamePackage g)
    {
        game = g;
    }

    public void play(String fileName)
    {
        System.out.print("Using Adapter...");
        game.playFile(fileName);
    }

}
