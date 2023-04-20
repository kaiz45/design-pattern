package singletonPattern;

public class School {
    private static School instance = null;

    private String name;

    private String address;

    private School(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public static School getInstance(String name, String address) {
        if (instance == null) {
            instance = new School(name, address);
        }
        return instance;
    }

    public String getName() {
        return this.name;
    }

    public String getAddress() {
        return this.address;
    }
}
