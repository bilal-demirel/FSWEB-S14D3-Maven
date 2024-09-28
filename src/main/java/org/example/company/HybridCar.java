package org.example.company;

public class HybridCar extends CarSkeleton{
    private double avgKmPerLitre;
    private int batterySize;
    private int cylinders;

    public HybridCar(double avgKmPerLitre, int batterySize, int cylinders) {
        this.avgKmPerLitre = avgKmPerLitre;
        this.batterySize = batterySize;
        this.cylinders = cylinders;
    }
    @Override
    public void startEngine(){
        System.out.println("Hybrid car's engine is starting");
        System.out.println(getClass().getSimpleName());
    }
    @Override
    public void drive(){
        System.out.println("Hybrid car is driving");
        System.out.println(getClass().getSimpleName());
    }
}
