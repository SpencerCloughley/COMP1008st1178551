package com.example.comp1008st1178551;

import java.util.ArrayList;

public class Dealership {
    private ArrayList<Car> inventory;

    public Dealership(){
        this.inventory=new ArrayList<Car>();
    }

    public void addCar(Car car){
        inventory.add(car);
    }
    public void removeCar(Car car){
        inventory.remove(car);
    }

    public double getInventoryValue(){
        double sum=0;
        for(int i=0; i<inventory.size();i++){
            sum += inventory.get(i).getPrice();
        }
        return sum;
    }
    public ArrayList getCarsNewerThan(int year){
        ArrayList newer= new ArrayList<Car>();
        for(int i=0; i<inventory.size();i++){
            if(inventory.get(i).getYear()>=year){
                newer.add(inventory.get(i));
            }
        }
        return newer;
    }
    public Car getMostExpensiveCar(){
        Car temp=new Car();
        temp.setPrice(0);
        for(int i=0; i<inventory.size();i++){
            if(inventory.get(i).getPrice()>= temp.getPrice())
                temp=inventory.get(i);
        }
        return temp;
    }
}
