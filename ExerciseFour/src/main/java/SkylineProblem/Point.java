package SkylineProblem;

/**
 * Point used for critical points
 * Included in SkylineProblem
 *
 * @author Marvin Piekarek (s0556014)
 * @version 1.0
 * @since 06. Jan 2017
 */
public class Point {

    /**
     * Storing the x value
     */
    private int x;

    /**
     * Storing the y value
     */
    private int y;

    /**
     * Storing if end of building
     */
    private boolean isLeft;

    /**
     * Checks if object is the same point, but just checking the Y value.
     * @param o an object
     * @return true if y is equal or false if not
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Point point = (Point) o;

        return y == point.y;
    }

    /**
     * Gets the isLeft value
     * @return return true if isLeft is true.
     */
    public boolean isLeft() {

        return isLeft;
    }

    /**
     * Ctor for the point with x,y and isLeft parameters
     * @param x the x
     * @param y the y
     * @param isLeft the isLeft boolean
     */
    public Point(int x, int y, boolean isLeft) {
        this.x = x;
        this.y = y;

        this.isLeft = isLeft;
    }

    /**
     * Gets the x value
     * @return value of x
     */
    public int getX() {
        return x;
    }

    /**
     * Gets the y value
     * @return the y value
     */
    public int getY() {
        return y;
    }

    /**
     * toString method
     * @return String of object.
     */
    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                ", " + isLeft +
                '}';
    }
}
