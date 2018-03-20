package com.jacobs.designPatterns;

public class RunVisitor {

    public static void main(String[] args)
    {
        Visitable vis = new Game();
        vis.accept(new GameDisplay());
    }
}
