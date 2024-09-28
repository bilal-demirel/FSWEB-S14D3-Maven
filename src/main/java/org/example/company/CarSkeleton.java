package org.example.company;

public class CarSkeleton {
    private String name;
    private String description;

    public CarSkeleton() {
    }

    public CarSkeleton(String name, String description) {
        this.name = name;
        this.description = description;
    }
    public void startEngine(){
        System.out.println();
    }
    protected void runEngine(){

    }
    public void drive(){
        this.runEngine();
    }
}
