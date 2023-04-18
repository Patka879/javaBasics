package edu.sda.java.basics.classes.task;

public class Review {
    private int score;
    private Poem poem;
    public Review(int score, Poem poem) {
        this.score = score;
        this.poem = poem;
    }

    public int getScore() {
        return score;
    }
    public Poem poem() {
        return poem;
    }
}
