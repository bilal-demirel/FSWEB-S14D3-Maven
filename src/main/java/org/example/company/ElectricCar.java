package org.example.company;

public class ElectricCar extends CarSkeleton{
    private double avgKmPerCharge;
    private int batterySize;

    public ElectricCar(double avgKmPerCharge, int batterySize) {
        this.avgKmPerCharge = avgKmPerCharge;
        this.batterySize = batterySize;
    }
    @Override
    public void startEngine(){
        System.out.println("Electric car's engine is starting");
        System.out.println(getClass().getSimpleName());
    }
    @Override
    public void drive(){
        System.out.println("Electric car is driving");
        System.out.println(getClass().getSimpleName());
    }
}
