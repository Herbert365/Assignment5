package com.jacobs.designPatterns;

public class Context {

    double score;
    Strat strategy;

    public Context()
    {

    }

    public Context(double score, Strat strategy)
    {
        this.score = score;
        this.strategy = strategy;
    }

    public double getScore()
    {
        return score;
    }
    public boolean getAnswer()
    {
        return strategy.checkScore(score);
    }
}
