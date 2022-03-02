package com.company.model;

public class TriangleModel {
    private int sideA;
    private int sideB;
    private int sideC;

    public TriangleModel(){

    }
    public TriangleModel(int sideA, int sideB, int sideC){
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }
    public int getSideA(){
        return sideA;
    }

    public void setSideA(int sideA) {
        this.sideA = sideA;
    }

    public int getSideB() {
        return sideB;
    }

    public void setSideB(int sideB) {
        this.sideB = sideB;
    }

    public int getSideC() {
        return sideC;
    }

    public void setSideC(int sideC) {
        this.sideC = sideC;
    }

    public int perimeter() {
        return sideA + sideB + sideC;
    }
    public int area(){
        double temp = perimeter() / 2;
        return (int) Math.sqrt(temp * (temp - sideA) * (temp - sideB) * (temp - sideC));
    }
}
