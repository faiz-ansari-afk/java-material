package com.company;
class A{
    public int harry(){
        return 5;
    }
    public void meth2(){
        System.out.println("I m method 2 of class A");
    }
}
class B extends A{
    public void meth3(){
        System.out.println("Im method 3 of class B");
    }
    public void meth2(){

    }
}
public class MethodOverriding {
    public static void main(String[] args) {
        A a = new A();
        a.meth2();
    }
}
