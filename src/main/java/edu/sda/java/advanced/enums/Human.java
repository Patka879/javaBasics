package edu.sda.java.advanced.enums;

public class Human {

    /**
     * Final means that once we set a value
     * we won't change it.
     * If we have a class that does not allow  modification
     * of its fields - it's called IMMUTABLE
     *
     * Final fields can be set in constructor or when creating a class.
     */

    private final String name;
    private final String surname;
    private Gender gender;

    public Human(String name, String surname, Gender gender) {
        this.name = name;
        this.surname = surname;
        this.gender = gender;
    }

    public Human(String name, String surname, String genderAbbrev) {
        this.name = name;
        this.surname = surname;
        this.gender = Gender.findByAbbrev(genderAbbrev); // call to static method, on enum and not on instance
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Gender getGender() {
        return gender;
    }
}