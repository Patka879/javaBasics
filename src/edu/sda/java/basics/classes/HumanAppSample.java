package edu.sda.java.basics.classes;

public class HumanAppSample {
    public static void main(String[] args) {
        Human human1 = new Human();
        human1.setAge(18);
        human1.setName("Agnieszka");
        human1.setSurname("Wolska");

        Human human2 = new Human();
        human2.setAge(25);
        human2.setName("Olgierd");
        human2.setSurname("Kowalski");

        System.out.println(human1.printInfo());

        System.out.println(human2.printInfo());
        System.out.println(Human.classInfo);

    }
}
