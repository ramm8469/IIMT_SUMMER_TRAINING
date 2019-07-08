package com.rammohan.IIMT_SUMMER_TRAINING.Basic.Day1.Date08_07_19_MultiThreading.Example;

public class PrintString {
    // We are getting differ output so we need to
    // Unsynchronize the method
    public static void print(String A,String B){
        System.out.println(A);
        try{
            Thread.sleep(30);
        }catch (InterruptedException e){
            System.out.println(e);
        }
        System.out.println(B);
    }

    // Synchronized Method
    public  static synchronized void  prints(String A,
                                          String B){
        System.out.println(A);
        try{
            Thread.sleep(30);
        }catch (InterruptedException e){
            System.out.println(e);
        }
        System.out.println(B);
    }
}
