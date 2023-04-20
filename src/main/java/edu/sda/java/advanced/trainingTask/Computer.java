package edu.sda.java.advanced.trainingTask;

public class Computer implements InternetConnection {
    private String type;
    private ConnectionType connectionType;

    public Computer(String type, ConnectionType connectionType) {
        this.type = type;
        this.connectionType = connectionType;
    }

    public Computer(String type, String connectionShort) {
        this.type = type;
        this.connectionType = ConnectionType.findByShortcut(connectionShort);
    }

    public String getType() {
        return type;
    }
    public ConnectionType getConnectionType() {
        return connectionType;
    }

    @Override
    public String connect() {
        return "Computer has Network Adapter";
    }
}
