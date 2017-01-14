package lists;

/**
 * Created by marvinpiekarek on 07.11.16.
 */
public abstract class Listable<T> {

    /**
     * a background counter for all elements inside the list.
     * Gets raised by adding elements, gets lowered by removing elements.
     * No direct getters or setters needed. Just the getLength function.
     */
    int length;

    /**
     * Adds an element <b>type T</b> at the end of the list
     *
     * @param data
     */
    public abstract void add(T data);

    /**
     * Removes a certain element from the list
     *
     * @param index which item should get removed
     */
    public abstract void remove(int index);

    /**
     * Gets a certain element from the list on a specific index
     *
     * @param index which specific item should be returned
     * @return element of <b>type T</b>
     */
    public abstract T get(int index);

    /**
     * Clear the whole list from all it's elements.
     */
    public abstract void clear();

    /**
     * Check's if the list is currently empty.
     *
     * @return boolean if empty or not.
     */
    public abstract boolean isEmpty();

    /**
     * Get the size/length of the current list.
     *
     * @return Integer as length of the list.
     */
    public abstract int getLength();

    /**
     * Prints out the current length of the list
     */
    public abstract void printLength();

    /**
     * Prints out all elements on the console.
     */
    public abstract void printAll();

    /**
     * Prints a single value at a given index.
     *
     * @param index
     */
    public abstract void printSingle(int index);

    /**
     * Sets a specific data at a given index.
     *
     * @param index where the data should be set
     * @param data  what data should be set
     */
    public abstract void set(int index, T data);

    /**
     * Inserts a certain new element on a specific index.
     *
     * @param index where the item should be placed
     * @param data  which data it should contain.
     */
    public abstract void insertAt(int index, T data);

    /**
     * Inserts a Node at First index
     *
     * @param data contains the data
     */
    public abstract void insertAtFirst(T data);

    /**
     * Inserts a Node at after last index
     *
     * @param data contains the data
     */
    public abstract void insertAtLast(T data);


}
