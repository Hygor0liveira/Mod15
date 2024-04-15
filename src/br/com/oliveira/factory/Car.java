package br.com.oliveira.factory;

public abstract class Car {

    private int horsePower;
    private String fuelSsouce;
    private String color;

    public Car (int horsePower, String fuelSsouce, String color){
        this.horsePower = horsePower;
        this.fuelSsouce = fuelSsouce;
        this.color = color;

    }
    public void startEngine(){
        System.out.println(getClass().getSimpleName());
        System.out.println("the " + fuelSsouce + "engine has been started " + horsePower + " horses");
    }
    public void clean(){
        System.out.println("car has been cleaned " + color.toLowerCase() + "colo shines");
    }
    public void mechanicCheck(){
        System.out.println("car has been checked by the machanic. ");
    }
    public void fuelCar() {
        System.out.println("car is being filles with " + fuelSsouce.toLowerCase());
    }
}
