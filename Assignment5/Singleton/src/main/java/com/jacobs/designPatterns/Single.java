package com.jacobs.designPatterns;

public class Single {

    private static Single instance;

    private Single()
    {

    }

    static{
        try {
            instance = new Single();
        }catch (Exception a)
        {
            throw new RuntimeException("Failed creating singleton instance");
        }
    }
    public static Single getInstance()
    {
        return instance;
    }
    public void message()
    {
        System.out.println("Successful instance creation");
    }
}
