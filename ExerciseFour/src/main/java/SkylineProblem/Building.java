package SkylineProblem;

/**
 * Building class for storing initial Buildings
 * Included in SkylineProblem
 *
 * @author Marvin Piekarek (s0556014)
 * @version 1.0
 * @since 06. Jan 2017
 */
public class Building {

    /**
     * the start value
     */
    private int start;

    /**
     * The end value
     */
    private int end;

    /**
     * The height value
     */
    private int height;

    /**
     * Ctor with start, end and height parameter
     * @param start the start parameter
     * @param end the end parameter
     * @param height the height
     */
    public Building(int start, int end, int height) {
        this.start = start;
        this.end = end;
        this.height = height;
    }

    /**
     * Gets the start value
     * @return int of start
     */
    public int getStart() {
        return start;
    }

    /**
     * Gets the end value
     * @return int of end
     */
    public int getEnd() {
        return end;
    }

    /**
     * Gets the height
     * @return int of height
     */
    public int getHeight() {
        return height;
    }

    /**
     * toString method
     * @return String of object
     */
    @Override
    public String toString() {
        return "SkylineProblem.Building{" +
                "start=" + start +
                ", end=" + end +
                ", height=" + height +
                '}';
    }

}
