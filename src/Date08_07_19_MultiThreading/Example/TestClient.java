package com.rammohan.IIMT_SUMMER_TRAINING.Basic.Day1.Date08_07_19_MultiThreading.Example;

public class TestClient {
    public static void main(String[] args) {
        PrintThread t1 = new PrintThread("a","b");
        PrintThread t2 = new PrintThread("c","d");
        PrintThread t3 = new PrintThread("e","f");
        t1.start();
        // t1.start();
        // if we start an already started thread then, we
        // get an error : IllegealStateException
        // Because we can't start again an already
        // started thread.

        /*Static Methods in  MultiTheading...
        Thread Class methods...
        * start();
        * run();
        * sleep();
        * yeild();
        * isAlive();
          join();
         setName();
         getName();
         currentThread(); : This will  return the current
          thread reference
         getPriority();
         setPriority();

         Thread Object Methods...
         toString();
         equal();
         wait();
         notify();
         notifyAll();

        *
        * */
        t2.start();
        t3.start();
    }
}
