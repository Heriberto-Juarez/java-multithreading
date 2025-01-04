package com.heribertojuarezjaimes.main;

import com.heribertojuarezjaimes.classes.MultiThreadThing;
import com.heribertojuarezjaimes.classes.PrinterThread;

public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            MultiThreadThing myThing = new MultiThreadThing(i);
            Thread myThread = new Thread(myThing);

            PrinterThread printerThread = new PrinterThread();
            Thread myPrinterThread = new Thread(printerThread);


            myThread.start();
            myPrinterThread.start();
        }
    }
}
