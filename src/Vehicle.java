public class Vehicle {

    public String make;
    public String model;

    public Vehicle(String make, String model) {
        this.make = make;
        this.model = model;
    }


    public String getMake() {
        return make;
    }


    public String getModel() {
        return model;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
