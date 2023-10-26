package ua.ithillel.oop.car;

public class Car {
    private void startElectricity() {
        System.out.println("Electricity is on");
    }
    private void  startCommand(){
        System.out.println("Command is on");
    }
    private void startFuelSystem(){
        System.out.println("FuelSystem is on");
    }
    public void start(){
        startElectricity();
        startCommand();
        startFuelSystem();
    }
}
