package com.rammohan.IIMT_SUMMER_TRAINING.Basic.Day1.Date08_07_19_MultiThreading;

import com.rammohan.IIMT_SUMMER_TRAINING.Basic.Day1.Date08_07_19_MultiThreading.ViaRunnableInterface.Mythread;
import com.rammohan.IIMT_SUMMER_TRAINING.Basic.Day1.Date08_07_19_MultiThreading.ViaThreadClass.MyNThread;

public class Main {
    public static void main(String[] args) {
        // Via Interface
//        Mythread r = new Mythread();
//        Thread t = new Thread(r);
//        t.start();

        // Via ThreadClass..
        MyNThread t = new MyNThread();
        //MyNThread t1 = new MyNThread();
        t.start();
        //t1.start();
        for (int i = 0; i <55; i++) {
            System.out.println("Main Method");

        }

    }
}
