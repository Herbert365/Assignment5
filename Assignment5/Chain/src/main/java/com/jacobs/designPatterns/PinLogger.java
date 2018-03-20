package com.jacobs.designPatterns;

public class PinLogger extends TransactionLogger{

    public PinLogger()
    {

    }

    public PinLogger(int process)
    {
        this.process = process;
    }

    protected void write(String message)
    {
        System.out.println("Pin Logger " + message);
    }
}
