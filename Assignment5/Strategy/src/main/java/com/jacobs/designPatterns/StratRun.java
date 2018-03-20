package com.jacobs.designPatterns;

public class StratRun {

    public static void main(String[] args)
    {
        double score1 = 15000;
        double score2 = 5000;

        Strat lessThan = new LessThan();
        Strat moreThan = new MoreThan();

        Context con1 = new Context(score1, moreThan);
        Context con2 = new Context(score2, lessThan);
        Context con3 = new Context(score1, lessThan);

        System.out.println("Current high score : 10000");
        System.out.println("Is " + con1.getScore() + " more than the current high score? " + con1.getAnswer());
        System.out.println("Is " + con2.getScore() + " less than the current high score? " + con2.getAnswer());
        System.out.println("Is " + con3.getScore() + " less than the current high score? " + con3.getAnswer());
    }
}
