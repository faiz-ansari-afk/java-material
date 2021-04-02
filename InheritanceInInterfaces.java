package com.company;
interface sampleInterface{
    void meth1();
    void meth2();
}
interface childSampleInterface extends sampleInterface{
    void meth3();
    void meth4();
}
class mySampleClass implements childSampleInterface{
    public void meth1(){
        System.out.println("meth1");
    }
    public void meth2(){
        System.out.println("meth2");
    }
    public void meth3(){
        System.out.println("meth3");
    }
    public void meth4(){
        System.out.println("meth4");
    }

}
public class InheritanceInInterfaces {
    public static void main(String[] args) {
    mySampleClass ms = new mySampleClass();
    ms.meth1();
    ms.meth2();
    ms.meth3();
    ms.meth4();
    }
}
