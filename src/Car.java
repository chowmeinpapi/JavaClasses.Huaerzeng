public class Car {
    //Properties
    private int year;
    private String make;
    private int miles;
    private String model;

    //Constructor
    public Car(int year, String make, int miles, String model) {
        this.year = year;
        this.make = make;
        this.miles = miles;
        this.model = model;
    }

    //Methods
    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void drive(int miles){
        this.miles += miles;
    }

    public int getMiles() {
        return miles;
    }

    public void setMiles(int miles) {
        this.miles = miles;
    }

    @Override
    public String toString() {
        return "Car{" +
                "year=" + year +
                ", make='" + make + '\'' +
                ", miles=" + miles +
                ", model='" + model + '\'' +
                '}';
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }



}
