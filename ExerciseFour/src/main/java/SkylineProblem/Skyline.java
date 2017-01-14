package SkylineProblem;

import java.util.*;

/**
 * Skyline calculating class with given Buildings
 * Included in PACKAGE_NAME
 *
 * @author Marvin Piekarek (s0556014)
 * @version 1.0
 * @since 06. Jan 2017
 */
public class Skyline {

    /**
     * List of critical points where buildings changes
     */
    private List<Point> criticalPoints = new LinkedList<>();

    /**
     * Skyline buildings
     */
    private Building[] buildings;

    /**
     * List of skyline points
     */
    private List<Point> skyline = new LinkedList<>();

    /**
     * Ctor with Buildings[]
     * @param buildings all skyline buildings
     */
    public Skyline(Building[] buildings) {
        this.buildings = buildings;
        prepareBuilding();
    }

    /**
     * convert buildings into critical points
     */
    private void prepareBuilding(){
        // one sort is enough ;)
        //Arrays.sort(buildings, (o1, o2) -> o1.getStart() - o2.getStart());
        criticalPoints.add(0, new Point(0, 0, false));
        for (Building build : buildings) {
            criticalPoints.add(new Point(build.getStart(), build.getHeight(), false));
            criticalPoints.add(new Point(build.getEnd(), build.getHeight(), true));
        }
        criticalPoints.sort((o1, o2) -> o1.getX() - o2.getX());
        Point last = criticalPoints.get(criticalPoints.size()-1);
        criticalPoints.add(new Point(last.getX(), 0, false));
    }

    /**
     * Calculating the skyline by going through the critical points.
     * @return List of changing points for the skyline.
     */
    public List<Point> calculateSkyline(){
        // create priority queue
        PriorityQueue<Point> prq = new PriorityQueue<>((x, y) -> y.getY() - x.getY());
        System.out.println(criticalPoints);

        for (Point c : criticalPoints) {
            if(!c.isLeft()) {
                prq.add(c);
                if(!skyline.isEmpty() && !skyline.get(skyline.size()-1).equals(c))
                    skyline.add(prq.peek());
                if(skyline.isEmpty())
                    skyline.add(prq.peek());
            }else{
                prq.remove(c);
                if(!prq.isEmpty() && !skyline.get(skyline.size()-1).equals(prq.peek()))
                    skyline.add(new Point(c.getX(), prq.peek().getY(), true));
            }
            System.out.println(prq);
        }
        return skyline;
    }

    /**
     * ToString method
     * @return String of object
     */
    @Override
    public String toString() {
        if(skyline.size() == 0) return "Skyline:Empty";
        StringBuilder kk = new StringBuilder("Skyline => ");
        for (Point line : skyline) {
            kk.append("x:" + line.getX() + " y:" + line.getY() + " | ");
        }
        kk.append("end...");
        return kk.toString();
    }
}
