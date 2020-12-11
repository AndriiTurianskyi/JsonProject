package JsonTask.forCreateData;

public class Company {
    private final String companyName;
    private final String address;
    private final String state;
    private final int phone;


    public Company(String companyName, String address, String state, int phone) {
        this.companyName = companyName;
        this.address = address;
        this.state = state;
        this.phone = phone;
    }

    @Override
    public String toString() {
        return companyName + "={" +
                "\"address\":\"" + address +
                "\",\"phone\":\"" + phone +
                "\",\"state\":\"" + state + "\"}";

    }
}


