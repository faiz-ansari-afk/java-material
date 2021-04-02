package com.company;
abstract class Pen{
    abstract void write();
    abstract void refill();
}
class Fpen extends Pen{
    void write(){
        System.out.println("Writing...");
    }
    void refill(){
        System.out.println("Refilling");
    }
}
class Monkey{
    void jump(){
        System.out.println("Jumping..");
    }
    void bite(){
        System.out.println("Biting...");
    }
}
interface BasicAnimal{
    void eat();
    void sleep();
}
class Human extends Monkey implements BasicAnimal{
    void speak(){
        System.out.println("Hello sir , hello sir");
    }
    public void eat() {
        System.out.println("Eating..");
    }
    public void sleep() {
        System.out.println("sleeping...");
    }
}
public class HardPractice {
    public static void main(String[] args) {
        Fpen p = new Fpen();
        Human harry = new Human();
        harry.sleep();
        Monkey n = new Human();
        n.bite();

    }
}
