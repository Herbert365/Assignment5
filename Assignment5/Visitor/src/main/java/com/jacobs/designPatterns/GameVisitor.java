package com.jacobs.designPatterns;

public interface GameVisitor {
    public void visit(Game game);
    public void visit(GameName name);
    public void visit(Platform platform);
}
