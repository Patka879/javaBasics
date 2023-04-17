package edu.sda.java.basics.classes.planes.inner;

public class Capacity {
   private int economy;
   private int business;
   private int first;

   public Capacity(int economy, int business, int first) {
       this.economy = economy;
       this.business = business;
       this.first = first;
   }

    public int getEconomy() {
        return economy;
    }

    public void setEconomy(int economy) {
        this.economy = economy;
    }

    public int getBusiness() {
        return business;
    }

    public void setBusiness(int business) {
        this.business = business;
    }

    public int getFirst() {
        return first;
    }
    public void setFirst(int first) {
       this.first = first;
    }

}
