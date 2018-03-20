package com.jacobs.designPatterns;

public class Proxy {
    EFT eft;

    public Proxy(){
        System.out.println("Creating proxy...");
    }

    public void deposit() {
        if (eft == null)
            eft = new EFT();
        eft.deposit();
    }

}
