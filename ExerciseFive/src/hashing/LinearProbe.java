package hashing;

/**
 * Class description ...
 * Included in hashing
 *
 * @author Marvin Piekarek (s0556014)
 * @version 1.0
 * @since 05. Dec 2016
 */
public class LinearProbe implements IProbing {

    @Override
    public int probe(int j, int k, int m2) {
        return j;
    }

}
