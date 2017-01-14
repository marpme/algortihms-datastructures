package search;

import java.util.stream.Stream;

/**
 * Class description ...
 * Included in search
 *
 * @author Marvin Piekarek (s0556014)
 * @version 1.0
 * @since 21. Dec 2016
 */
public interface Predicate<T>{

    /**
     * Returns a stream consisting of the elements of this stream that match
     * the given predicate.
     *
     * <p>This is an <a href="package-summary.html#StreamOps">intermediate
     * operation</a>.
     *
     * @param obj a non-interfering stateless predicate to apply to each element to determine if it
     * should be included in the new returned stream.
     * @return the new stream
     */
    boolean matches(T obj);

}
