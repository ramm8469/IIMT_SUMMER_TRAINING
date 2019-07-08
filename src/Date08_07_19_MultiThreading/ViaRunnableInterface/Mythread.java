package com.rammohan.IIMT_SUMMER_TRAINING.Basic.Day1.Date08_07_19_MultiThreading.ViaRunnableInterface;

public class Mythread implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i <30 ; i++) {
//            try{
//                Thread.sleep(50);
//            }catch(InterruptedException e){
//                System.out.println(e);
//            }
            System.out.println("Run Method");
        }
    }
}
