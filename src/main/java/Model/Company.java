package Model;

public class Company {
    private String address;
    private String state;
    private String phone;

    // Getter Methods
    public String getAddress() {
        return address;
    }

    public String getState() {
        return state;
    }

    public String getPhone() {
        return phone;
    }

    // Setter Methods

    public void setAddress(String address) {
        this.address = address;
    }
    public void setState(String state) {
        this.state = state;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
