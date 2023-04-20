package edu.sda.java.advanced.trainingTask;

public class Desktop extends Computer {

    public Desktop(String type, ConnectionType connectionType) {
        super(type, connectionType);
    }


    @Override
    public String connect() {
        if(getConnectionType() == null) {
            return "No connection available";
        } else {
            return "Connection granted";
        }
    }
}
