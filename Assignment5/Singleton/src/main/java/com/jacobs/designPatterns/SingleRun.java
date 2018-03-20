package com.jacobs.designPatterns;

public class SingleRun {
    public static void main(String[] args)
    {
        Single sing = Single.getInstance();
        sing.message();
    }
}
