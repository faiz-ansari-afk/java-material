package com.company;
class MyThreadRunnable implements Runnable{
    public void run(){
        System.out.println("im a thread");
        System.out.println("im a thread");
        System.out.println("im a thread");
        System.out.println("im a thread");
        System.out.println("im a thread");
        System.out.println("im a thread");
        System.out.println("im a thread");
        System.out.println("im a thread");
        System.out.println("im a thread");
        System.out.println("im a thread");
        System.out.println("im a thread");
    }
}
class MyThread2 implements Runnable{
    @Override
    public void run() {
        System.out.println("im t2 thread");
        System.out.println("im t2 thread");
        System.out.println("im t2 thread");
        System.out.println("im t2 thread");
        System.out.println("im t2 thread");
        System.out.println("im t2 thread");
        System.out.println("im t2 thread");
        System.out.println("im t2 thread");;
        System.out.println("im t2 thread");
        System.out.println("im t2 thread");
        System.out.println("im t2 thread");
        System.out.println("im t2 thread");
        System.out.println("im t2 thread");
        System.out.println("im t2 thread");
        System.out.println("im t2 thread");
    }
}
public class ThreadWtInterface {
    public static void main(String[] args) {
        MyThreadRunnable t1 = new MyThreadRunnable();
        Thread t = new Thread(t1);
        MyThread2 t2 = new MyThread2();
        Thread t3 = new Thread(t2);
        t.start();
        t3.start();


    }
}
