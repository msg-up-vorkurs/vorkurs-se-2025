package course.shapes;

/**
 * This class defines a simple triangle.
 * It assumes an isosceles triangle.
 */
public class Triangle extends Shape {
    private double base;
    private double height;

    /**
     * Instantiates a new Triangle.
     *
     * @param color Color of the triangle.
     * @param posX Position of the triangle on the x-axis.
     * @param posY Position of the triangle on the y-axis.
     * @param base Baseline width of the triangle.
     * @param height Height of the triangle.
     */
    public Triangle(String color, double posX, double posY, double base, double height) {
        super(color, posX, posY);
        this.base = base;
        this.height = height;
    }

    /**
     * Gets the baseline width of this Triangle.
     *
     * @return Baseline width of this Triangle.
     */
    public double getBase() {
        return base;
    }

    /**
     * Sets the baseline width of this Triangle to a new value.
     *
     * @param base New baseline width of this Triangle.
     */
    public void setBase(double base) {
        this.base = base;
    }

    /**
     * Gets the height of this Triangle.
     *
     * @return Height of this Triangle.
     */
    public double getHeight() {
        return height;
    }

    /**
     * Sets the height of this Triangle to a new value.
     *
     * @param height New height of this Triangle.
     */
    public void setHeight(double height) {
        this.height = height;
    }

    /**
     * Calculates the circumference of this triangle.
     *
     * @return Returns the circumference of this triangle.
     */
    @Override
    public double getCircumference() {
        // Pythagoras: a^2 + b^2 = c^2
        double a = Math.sqrt(Math.pow((base / 2), 2) + Math.pow(height, 2));

        return 2 * a + base;
    }

    /**
     * Calculates the area of this triangle.
     *
     * @return Returns the total area encompassed by this triangle.
     */
    @Override
    public double getArea() {
        return 0.5 * base * height;
    }
}