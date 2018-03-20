package com.jacobs.designPatterns;

public class Platform implements Visitable{

    private String platform;

    public Platform(String platform)
    {
        this.platform = platform;
    }

    public void accept(GameVisitor gameVisitor)
    {
        gameVisitor.visit(this);
    }

    public String getPlatform()
    {
        return platform;
    }
}
