package ua.ithillel.oop.employee;

public class Employee {

    private String name;
    private String position;
    private  String email;
    private int telNumber;
    private  int age;

    public Employee (String name, String position, String email, int telNumber, int age){
        this.name = name;
        this.position = position;
        this.email = email;
        this.telNumber = telNumber;
        this.age = age;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getTetNumber() {
        return telNumber;
    }

    public void setTetNumber(int tetNumber) {
        this.telNumber = tetNumber;
    }

    public int getAge() {
        return age;
    }


    public void setAge(int age) {
        if (age < 0){
            throw new IllegalArgumentException();
        }
        this.age = age;
    }

}
