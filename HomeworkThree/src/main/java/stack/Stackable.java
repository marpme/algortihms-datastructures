package stack;

/**
 * Stack interface for dynamic/array stacks.
 * Included in stack
 *
 * @author Marvin Piekarek (s0556014)
 * @version 1.0
 * @since 13. Jan 2017
 */
public interface Stackable<E> {

    /**
     * Pushes one Object on the top of the stack
     * @param data data that gets pushed
     */
    void push(E data);

    /**
     * Pop gets the top object of
     * the stack and removes it.
     * @return the object
     */
    E pop();

    /**
     * Views and returns the top object of
     * the stack and put it back.
     * @return the object.
     */
    E peek();

    /**
     * Removes a given object inside the stack.
     * (must not be on top!)
     * @param index the index.
     * @return the object.
     */
    E removeAtIndex(int index);

    /**
     * Adds an object to an specific position inside the stack.
     * @param data the object.
     * @param index the index.
     */
    void addAtIndex(E data, int index);

}
