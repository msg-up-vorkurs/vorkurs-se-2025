package course.shapes;

/**
 * This class defines a simple rectangle.
 */
public class Rectangle extends Shape {
    private double width;
    private double height;

    /**
     * Instantiates a new Rectangle.
     * 
     * @param color Color of the rectangle.
     * @param posX Position of the rectangle on the x-axis.
     * @param posY Position of the rectangle on the y-axis.
     * @param width Width of the rectangle.
     * @param height Height of the rectangle.
     */
    public Rectangle(String color, double posX, double posY, double width, double height) {
        super(color, posX, posY);
        this.width = width;
        this.height = height;
    }

    /**
     * Gets the width of this Rectangle.
     *
     * @return With of this Rectangle.
     */
    public double getWidth() {
        return width;
    }

    /**
     * Sets the width of this Rectangle to a new value.
     *
     * @param width New width of this Rectangle.
     */
    public void setWidth(double width) {
        this.width = width;
    }

    /**
     * Gets the height of this Rectangle.
     *
     * @return Height of this Rectangle.
     */
    public double getHeight() {
        return height;
    }

    /**
     * Sets the height of this Rectangle to a new value.
     *
     * @param height New height of this Rectangle.
     */
    public void setHeight(double height) {
        this.height = height;
    }

    /**
     * Calculates the circumference of this rectangle.
     * 
     * @return Returns the circumference of this rectangle.
     */
    @Override
    public double getCircumference() {
        return 2 * width + 2 * height;
    }

    /**
     * Calculates the area of this rectangle.
     * 
     * @return Returns the total area encompassed by this rectangle.
     */
    @Override
    public double getArea() {
        return width * height;
    }
}