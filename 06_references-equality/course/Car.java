package course;

public class Car {
    private final String manufacturer;
    private final String model;
    private final String vin;
    private String color;
    private Engine engine;

    public Car(String manufacturer, String model, String vin) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.vin = vin;
    }

    public void applyColor(String color) {
        this.color = color;
    }

    public void installEngine(Engine engine) {
        this.engine = engine;
    }


    public void start() {
        engine.start();
    }

    public void printDetails() {
        IO.println("Car(manufacturer=" + this.manufacturer + ", model=" + this.model
            + ", color=" + this.color + ", vin=" + this.vin + ", engine=" + this.engine + ")");
    }
}
