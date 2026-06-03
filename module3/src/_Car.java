// Q17 - Class and Object Creation
public class _Car {
    String make;
    String model;
    int year;

    _Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    void displayDetails() {
        System.out.println(year + " " + make + " " + model);
    }

    public static void main(String[] args) {
        _Car car1 = new _Car("Toyota", "Camry", 2022);
        _Car car2 = new _Car("Honda", "Civic", 2021);

        car1.displayDetails();
        car2.displayDetails();
    }
}
