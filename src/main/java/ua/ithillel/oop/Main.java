package ua.ithillel.oop;
import ua.ithillel.oop.car.Car;
import ua.ithillel.oop.employee.Employee;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("Ben", "Director", "mail@com.ua", 2343443, 35);

        Car car = new Car();
        car.start();
    }
}
