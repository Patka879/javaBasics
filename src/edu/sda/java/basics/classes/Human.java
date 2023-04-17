package edu.sda.java.basics.classes;

public class Human {

    public static String classInfo = "Human class";
    private String name;
    private String surname;
    private int age;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSurname() {
        return name;
    }
    public void setSurname(String surname) {
        this.surname = surname;
        info();
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
        info();
    }

    // some print info method
    public String printInfo() {
        return "Name: " + name + " surname: " + surname + "and age " + age;
    }

    // private method - to be used only inside the class
    private void info() {
        System.out.print("working in setter");
    }

}
