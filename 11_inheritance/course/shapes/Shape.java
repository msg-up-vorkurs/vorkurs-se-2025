package course.shapes;

/**
 * This class defines a shape.
 * <p>
 * A shape can, for instance, be drawn to the screen.
 * Every shape has a color and needs to be positioned somewhere.
 */
public class Shape {
    private String color;

    private double posX;
    private double posY;

    /**
     * Instantiates a new shape.
     * <p>
     * This constructor must not be called explicitly as AbstractShape is
     * abstract. Instead, it shall be used in subclasses inheriting
     * from AbstractShape.
     *
     * @param color Color of the shape.
     * @param posX  Position of the shape on the x-axis.
     * @param posY  Position of the shape on the y-axis.
     */
    public Shape(String color, double posX, double posY) {
        this.color = color;
        this.posX = posX;
        this.posY = posY;
    }

    /**
     * Returns the color of this shape.
     *
     * @return Color of this shape.
     */
    public String getColor() {
        return this.color;
    }

    /**
     * Sets the color of this shape.
     *
     * @param color Color this shape should be set to.
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * Gets the current x-position of this AbstractShape.
     *
     * @return The current position on the x-axis.
     */
    public double getPosX() {
        return posX;
    }

    /**
     * Sets the position of this AbstractShape on the x-axis.
     *
     * @param posX New position on the x-axis.
     */
    public void setPosX(double posX) {
        this.posX = posX;
    }

    /**
     * Gets the current y-position of this AbstractShape.
     *
     * @return The current position on the y-axis.
     */
    public double getPosY() {
        return posY;
    }

    /**
     * Sets the position of this AbstractShape on the y-axis.
     *
     * @param posY New position on the y-axis.
     */
    public void setPosY(double posY) {
        this.posY = posY;
    }

    /**
     * Calculates the circumference of this shape.
     * Since the formula is different for every type of shape, it needs
     * to be implemented in the respective subclasses.
     *
     * @return The circumference of this shape.
     */
    public double getCircumference() {
        throw new UnsupportedOperationException("Cannot calculate circumference from unknown shape.");
    }

    /**
     * Calculates the area of this shape.
     * Since the formula is different for every type of shape, it needs
     * to be implemented in the respective subclasses.
     *
     * @return The total area encompassed of this shape.
     */
    public double getArea() {
        throw new UnsupportedOperationException("Cannot calculate area from unknown shape.");
    }
}