package com.example.comp1008st1178551;

public class Main {
    public static void main(String args[]){
        Car car1 = new Car("Ford","Elantra",60000,2010);
        Car car2 = new Car("BMW","Jetta",75000,2014);
        System.out.println(car1.toString());
        System.out.println(car2.toString());
        Dealership dealer =new Dealership();
        dealer.addCar(car1);
        dealer.addCar(car2);
        System.out.println("Inventory Value $" + dealer.getInventoryValue());
        System.out.println(dealer.getCarsNewerThan(2011));
        System.out.println(dealer.getMostExpensiveCar());
        System.out.println(dealer);
    }
}
