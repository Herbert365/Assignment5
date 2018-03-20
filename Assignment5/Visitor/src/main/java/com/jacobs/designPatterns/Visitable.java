package com.jacobs.designPatterns;

public interface Visitable {
    public void accept(GameVisitor gameVisitor);
}
