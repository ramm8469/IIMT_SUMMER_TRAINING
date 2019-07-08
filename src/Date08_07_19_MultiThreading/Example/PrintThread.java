package com.rammohan.IIMT_SUMMER_TRAINING.Basic.Day1.Date08_07_19_MultiThreading.Example;

public class PrintThread extends Thread {
    private String a;
    private String b;

    public PrintThread(String a, String b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public void run() {
       // PrintString.print(a,b);
        PrintString.prints(a,b);
    }
}
