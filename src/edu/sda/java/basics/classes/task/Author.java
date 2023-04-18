package edu.sda.java.basics.classes.task;

import java.time.LocalDate;

public class Author {
    private String surname;
    private String nationality;
    private LocalDate dateOfBirth;

    public Author(String surname, String nationality, LocalDate dateOfBirth) {
        this.surname = surname;
        this.nationality = nationality;
        this.dateOfBirth = dateOfBirth;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getNationality() {
        return nationality;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }
}
