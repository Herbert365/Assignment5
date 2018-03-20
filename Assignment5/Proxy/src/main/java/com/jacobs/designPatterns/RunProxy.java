package com.jacobs.designPatterns;

public class RunProxy {

    public static void main( String[] args )
    {
        Proxy proxy = new Proxy();

        InstantEFT iEFT = new InstantEFT();
        iEFT.deposit();

        proxy.deposit();
    }
}
