package course.shapes;

/**
 * This class defines a simple rectangle.
 */
public class Rectangle {
    private String color;

    private double posX;
    private double posY;
    private double width;
    private double height;

    /**
     * Instantiates a new Rectangle.
     *
     * @param color  Color of the rectangle.
     * @param posX   Position of the rectangle on the x-axis.
     * @param posY   Position of the rectangle on the y-axis.
     * @param width  Width of the rectangle.
     * @param height Height of the rectangle.
     */
    public Rectangle(String color, double posX, double posY, double width, double height) {
        this.color = color;
        this.posX = posX;
        this.posY = posY;
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
    public double getCircumference() {
        return 2 * width + 2 * height;
    }

    /**
     * Calculates the area of this rectangle.
     *
     * @return Returns the total area encompassed by this rectangle.
     */
    public double getArea() {
        return width * height;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPosX() {
        return posX;
    }

    public void setPosX(double posX) {
        this.posX = posX;
    }

    public double getPosY() {
        return posY;
    }

    public void setPosY(double posY) {
        this.posY = posY;
    }
}