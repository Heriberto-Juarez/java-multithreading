package com.heribertojuarezjaimes.main;

import com.heribertojuarezjaimes.classes.MultiThreadThing;

public class Main {
    public static void main(String[] args){

        MultiThreadThing myThing = new MultiThreadThing();
        MultiThreadThing myThing2 = new MultiThreadThing();

        myThing.start();
        myThing2.start();

    }
}
