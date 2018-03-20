package com.jacobs.designPatterns;

public class BalanceLogger extends TransactionLogger{

    public BalanceLogger()
    {

    }

    public BalanceLogger(int process)
    {
        this.process = process;
    }

    protected void write(String message)
    {
        System.out.println("Balance Logger " + message);
    }
}
