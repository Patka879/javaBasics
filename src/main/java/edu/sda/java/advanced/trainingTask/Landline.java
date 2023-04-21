package edu.sda.java.advanced.trainingTask;

public class Landline extends Phone {


    public Landline(String type) {
        super(type);
    }

    @Override
    public String connect() {
        return "Internet connection is not possible";
    }
}
