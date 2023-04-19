package edu.sda.java.basics.classes.task;

import java.time.LocalDate;

public class Publication {
    private LocalDate localDate;
    private int numberOfPublications;
    private Poem poem;

    public Publication(LocalDate localDate, int numberOfPublications, Poem poem) {
        this.localDate = localDate;
        this.numberOfPublications = numberOfPublications;
        this.poem = poem;
    }

    public LocalDate getLocalDate() {
        return localDate;
    }
    public int getNumberOfPublications() {
        return numberOfPublications;
    }

    public Poem poem() {
        return poem;
    }

}
