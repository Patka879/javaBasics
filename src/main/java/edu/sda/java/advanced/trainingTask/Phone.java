package edu.sda.java.advanced.trainingTask;

public class Phone implements InternetConnection {

    private String type;

    private ConnectionType connectionType;

    public Phone(String type, ConnectionType connectionType) {
        this.type = type;
        this.connectionType = connectionType;
    }

    public Phone(String type, String connectionShort) {
        this.type = type;
        this.connectionType = ConnectionType.findByShortcut(connectionShort);
    }

    public String getType() {
        return type;
    }

    public ConnectionType getConnectionType() {
        return connectionType;
    }

    public String connect() {
        return "Phone is connected to the internet";
    }
}
