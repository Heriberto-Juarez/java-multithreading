package com.heribertojuarezjaimes.classes;

public class MultiThreadThing implements Runnable {

    private final int threadNumber;

    public MultiThreadThing(int threadNumber){
        this.threadNumber = threadNumber;
    }

    @Override
    public void run(){
        try {
            for(int i = 1; i<=5; i++){
                System.out.println("Thread #" + this.threadNumber + " is: " + i);
                Thread.sleep(1000);
            }
        }catch (InterruptedException e){
            System.out.println(e.getMessage());
        }

    }
}
