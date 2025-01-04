package com.heribertojuarezjaimes.classes;

public class PrinterThread implements Runnable{
    @Override
    public void run(){
        System.out.println("Print job completed");
    }
}
