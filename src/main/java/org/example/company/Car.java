package org.example.company;

public class Car {
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public Car(int cylinders, String name) {
        this.engine = true;
        this.wheels = 4;
        this.cylinders = cylinders;
        this.name = name;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }
    @Override
    public String toString(){
        return this.name;
    }
    @Override
    public boolean equals(Car car){
        return car.getName().equals(this.name) && car.getCylinders() == this.cylinders;
    }
    public void startEngine(){
        System.out.println("the car's engine is starting");
        System.out.println(getClass().getSimpleName());
    }
    public void accelerate(){
        System.out.println("the car is accelerating");
        System.out.println(getClass().getSimpleName());
    }
    public void brake(){
        System.out.println("the car is braking");
        System.out.println(getClass().getSimpleName());
    }
}
