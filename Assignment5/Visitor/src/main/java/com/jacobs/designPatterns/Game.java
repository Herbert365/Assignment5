package com.jacobs.designPatterns;

public class Game implements Visitable{

    Visitable[] gameInfo;

    public Game()
    {
        gameInfo = new Visitable[]{new GameName("Far Cry Primal"), new Platform("Xbox 1")};
    }

    public void accept(GameVisitor gameVisitor)
    {

        for (int i = 0; i < gameInfo.length; i++)
            gameInfo[i].accept(gameVisitor);

        gameVisitor.visit(this);

    }


}
