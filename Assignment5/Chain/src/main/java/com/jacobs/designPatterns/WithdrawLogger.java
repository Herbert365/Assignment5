package com.jacobs.designPatterns;

public class WithdrawLogger extends TransactionLogger{

    public WithdrawLogger()
    {

    }

    public WithdrawLogger(int process)
    {
        this.process = process;
    }

    protected void write(String message)
    {
        System.out.println("Withdraw Logger " + message);
    }
}
