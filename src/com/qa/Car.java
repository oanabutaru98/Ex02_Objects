package com.qa;

public class Car {
    private String make;
    private String color;
    private int fabricationYear;
    private int speed;

    public Car (String make, String color, int fabricationYear, int speed) {
        this.make = make;
        this.color = color;
        this.fabricationYear = fabricationYear;
        this.speed = speed;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getFabricationYear() {
        return fabricationYear;
    }

    public void setFabricationYear(int fabricationYear) {
        this.fabricationYear = fabricationYear;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", color='" + color + '\'' +
                ", fabricationYear=" + fabricationYear +
                ", speed=" + speed +
                '}';
    }

    public void accelerate(int amount) {
        this.speed += amount;
    }
}
