package com.jacobs.designPatterns;

public class LessThan implements Strat{

    public LessThan()
    {

    }

    public boolean checkScore(double score) {
        if (score < 10000)
            return true;
        else
            return false;
    }
}
