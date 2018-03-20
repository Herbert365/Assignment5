package com.jacobs.designPatterns;

public class RunAdapter {

    public static void main(String[] args)
    {
        GamePlayer playGame = new Xbox();
        playGame.play("(Xbox game)");

        playGame = new GameAdapter(new Playstation());
        playGame.play("(Playstation Game)");

        playGame = new GameAdapter(new Pc());
        playGame.play("(Pc game)");

    }
}
