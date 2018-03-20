package com.jacobs.designPatterns;

public abstract class ControllerAbs {
    private Console con;

    public ControllerAbs(Console con)
    {
        this.con = con;
    }
    public void turnOn(){
        con.on();
    }

    public void turnOff(){
        con.off();
    }

    public void gameInsert(String gameName){
        con.gameInsert(gameName);
    }
}
