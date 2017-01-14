import SkylineProblem.Building;
import SkylineProblem.Skyline;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * Class description ...
 * Included in PACKAGE_NAME
 *
 * @author Marvin Piekarek (s0556014)
 * @version 1.0
 * @since 06. Jan 2017
 */
public class EntrySkyline {
    public static void main(String[] args) {
        Building a, b, c, d, e, f;
        a = new Building(0, 3, 50);
        b = new Building(2, 5, 30);
        c = new Building(6, 9, 10);
        d = new Building(7, 8, 70);
        e = new Building(8,12, 30);
        f = new Building(10, 14, 5);
        Building[] buildings = new Building[]{ a, b, c, d, e, f};
        Skyline sk = new Skyline(buildings);
        sk.calculateSkyline();
        System.out.println(sk);
    }
}
