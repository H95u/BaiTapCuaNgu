package person;


public class Address {
    private static int idtemp = 1;

    private int id;
    private String address;

    public Address() {
        this.id = idtemp++;
    }

    public Address(String address) {
        this.id = idtemp++;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return id + "." + address;
    }
}
