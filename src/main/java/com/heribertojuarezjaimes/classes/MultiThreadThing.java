package com.heribertojuarezjaimes.classes;

public class MultiThreadThing extends Thread {

    @Override
    public void run(){

        try {
            for(int i = 1; i<=5; i++){
                System.out.println(i);
                Thread.sleep(1000);
            }
        }catch (InterruptedException e){
            System.out.println(e.getMessage());
        }

    }
}
