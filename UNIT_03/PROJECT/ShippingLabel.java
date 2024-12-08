public class ShippingLabel {

    // Instance Variables
    private String name;
    private String adress;
    private String city;
    private String state;
    private int postalCode;
    private double packageWeight;
    private double shippingCost;

    // Get Methods

    public String getName() {
        return this.name;
    }

    public String getAdress() {
        return this.adress;
    }

    public String getCity() {
        return this.city;
    }

    public String getState() {
        return this.state;
    }

    public int getPostalCode() {
        return this.postalCode;
    }

    public double getPackageWeight() {
        return this.packageWeight;
    }

    public double getShippingCost() {
        return this.shippingCost;
    }

    // Set Methods

    public void setName(String name) {
        this.name = name;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setPostalCode(int postalCode) {
        this.postalCode = postalCode;
    }

    public void setPackageWeight(double packageWeight) {
        this.packageWeight = packageWeight;
    }

    public void setShippingCost(double shippingCost) {
        this.shippingCost = shippingCost;
    }

    // setAll Method

    public void setAll(String name, String adress, String city, String state, int postalCode, double packageWeight, double shippingCost) {
        this.name = name;
        this.adress = adress;
        this.city = city;
        this.state = state;
        this.postalCode = postalCode;
        this.packageWeight = packageWeight;
        this.shippingCost = shippingCost;
    }

    // Full Constructor

    public ShippingLabel(String name, String adress, String city, String state, int postalCode, double packageWeight, double shippingCost) {
        this.name = name;
        this.adress = adress;
        this.city = city;
        this.state = state;
        this.postalCode = postalCode;
        this.packageWeight = packageWeight;
        this.shippingCost = shippingCost;
    }

    // Default Constructor

    public ShippingLabel() {
        name = "John Doe";
        adress = "1234 Elm Street";
        city = "Anywhere";
        state = "Kansas";
        postalCode = 00000;
        packageWeight = 0.00;
        shippingCost = 0.00;
    }

    // Equals Method

    public boolean equals(ShippingLabel other) {
        return this.name.equals(other.name) &&
        this.adress.equals(other.adress) &&
        this.city.equals(other.adress) &&
        this.state.equals(other.state) &&
        this.postalCode == other.postalCode &&
        this.packageWeight == other.packageWeight &&
        this.shippingCost == other.shippingCost;

    }

    // To String Method

    public String toString() {
        return String.format("%s, %s, %s, %s, %d, %f, %f", name, adress, city, state, postalCode, packageWeight, shippingCost);
    }

}
