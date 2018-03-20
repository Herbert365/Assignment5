package com.jacobs.designPatterns;

public class GameName implements Visitable{

    private String name;
    public GameName(String name)
    {
        this.name = name;
    }

    public void accept(GameVisitor gameVisitor)
    {
        gameVisitor.visit(this);
    }

    public String getName()
    {
        return name;
    }

}
