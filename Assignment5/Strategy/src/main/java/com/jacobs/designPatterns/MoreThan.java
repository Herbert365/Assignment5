package com.jacobs.designPatterns;

public class MoreThan implements Strat{

    public MoreThan()
    {

    }

    public boolean checkScore(double score) {
        if (score > 10000)
            return true;
        else
            return false;
    }
}
