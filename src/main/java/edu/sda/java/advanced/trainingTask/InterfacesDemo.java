package edu.sda.java.advanced.trainingTask;
public class InterfacesDemo {
    public static void main(String[] args) {

        //Computer
        Computer computer = new Computer("Computer", ConnectionType.ETHERNET);
        Computer otherComputer = new Computer("Other Computer", "W");
        Laptop laptop = new Laptop("Laptop", ConnectionType.WIFI);
        Desktop desktop = new Desktop("Desktop", ConnectionType.ETHERNET);

        //Phone
        Phone phone = new Phone("Samsung", "G");
        Phone phone2 = new Phone("Nokia", "G");
        CellPhone cellPhone = new CellPhone("Iphone", ConnectionType.GSM);
        Landline landline = new Landline("landlinePhone");

        //Computer
        System.out.println(computer.connect() +" " +  computer.getConnectionType());
        System.out.println(computer.connect() + " " + computer.getConnectionType().getShortcut());
        System.out.println(otherComputer.connect() + otherComputer.getConnectionType());
        System.out.println(desktop.connect() + " " + desktop.getConnectionType());
        System.out.println(laptop.connect());

        //Phone
        System.out.println(phone.connect() + phone.getConnectionType());
        System.out.println(phone2.connect() + phone.getConnectionType().getShortcut());
        System.out.println(cellPhone.connect() + cellPhone.getConnectionType());
        System.out.println(landline.connect() + landline.getConnectionType().getShortcut());
    }
}
