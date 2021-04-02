package com.company;
class tread extends Thread{
    public void run(){
        while (true){
            try {
                Thread.sleep(400);
            }
            catch (Exception e){
                System.out.println(e);
            }
            System.out.println("Welcome.......");
        }
    }
}
class tread2 extends Thread{
    public void run(){
        while(true){
            try {
                Thread.sleep(400);
            }
            catch(Exception e){
                System.out.println(e);
            }
            System.out.println("Good morning");
        }
    }
}
public class ThreadP {
    public static void main(String[] args) {
        tread t = new tread();
        tread2 t2 = new tread2();
        t.setPriority(3);
        t2.setPriority(10);
        t.start();
        t2.start();
    }
}
