package org.example.company;

public class Holden extends  Car{
    public Holden(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public void startEngine(){
        System.out.println("Holden's engine is starting");
        System.out.println(getClass().getSimpleName());
    }
    @Override
    public void accelerate(){
        System.out.println("Holden is accelerating");
        System.out.println(getClass().getSimpleName());
    }
    @Override
    public void brake(){
        System.out.println("Holden is braking");
        System.out.println(getClass().getSimpleName());
    }
}
