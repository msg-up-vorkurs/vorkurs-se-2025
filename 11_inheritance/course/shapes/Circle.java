package course.shapes;

/**
 * This class defines a simple circle.
 */
public class Circle extends Shape {

    private double radius;

    /**
     * Instantiates a new Circle.
     *
     * @param color  Color of the circle.
     * @param posX   Position of the circle on the x-axis.
     * @param posY   Position of the circle on the y-axis.
     * @param radius Radius of the circle.
     */
    public Circle(String color, double posX, double posY, double radius) {
        super(color, posX, posY);
        this.radius = radius;
    }

    /**
     * Gets the radius of this Circle.
     *
     * @return Radius of this Circle.
     */
    public double getRadius() {
        return radius;
    }

    /**
     * Sets the radius of this Circle to a new value.
     *
     * @param radius New radius of this Circle.
     */
    public void setRadius(double radius) {
        this.radius = radius;
    }

    /**
     * Calculates the circumference of this circle.
     *
     * @return Returns the circumference of this circle.
     */
    @Override
    public double getCircumference() {
        return 2 * Math.PI * radius;
    }

    /**
     * Calculates the area of this circle.
     *
     * @return Returns the total area encompassed by this circle.
     */
    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

}