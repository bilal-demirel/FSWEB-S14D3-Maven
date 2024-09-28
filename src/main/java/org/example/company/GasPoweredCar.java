package org.example.company;

public class GasPoweredCar extends CarSkeleton{
    private double avgKmPerLitre;
    private int cylinders;

    public GasPoweredCar(double avgKmPerLitre, int cylinders) {
        this.avgKmPerLitre = avgKmPerLitre;
        this.cylinders = cylinders;
    }
    @Override
    public void startEngine(){
        System.out.println("Gas car's engine is starting");
        System.out.println(getClass().getSimpleName());
    }
    @Override
    public void drive(){
        System.out.println("Gas car is driving");
        System.out.println(getClass().getSimpleName());
    }
}
