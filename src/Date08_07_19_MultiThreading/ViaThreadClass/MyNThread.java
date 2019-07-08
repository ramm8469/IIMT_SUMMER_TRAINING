package com.rammohan.IIMT_SUMMER_TRAINING.Basic.Day1.Date08_07_19_MultiThreading.ViaThreadClass;

public class MyNThread extends Thread {
    @Override
    public void run() {
        // For Scheduling the thread..
//        try {
//            Thread.sleep(30);
//        }catch (InterruptedException e){
//            System.out.println(e);
//        }
        for (int i = 0; i <55 ; i++) {
            System.out.println("Child thread");
        }
    }
}
