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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Company company = (Company) o;
        return address.equals(company.address) &&
                state.equals(company.state) &&
                phone.equals(company.phone);
    }

}
