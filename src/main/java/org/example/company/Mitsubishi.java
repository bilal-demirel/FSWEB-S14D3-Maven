package org.example.company;

public class Mitsubishi extends Car{
    public Mitsubishi(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public void startEngine(){
        System.out.println("Mitsubishi's engine is starting");
        System.out.println(getClass().getSimpleName());
    }
    @Override
    public void accelerate(){
        System.out.println("Mitsubishi is accelerating");
        System.out.println(getClass().getSimpleName());
    }
    @Override
    public void brake(){
        System.out.println("Mitsubishi is braking");
        System.out.println(getClass().getSimpleName());
    }
}
