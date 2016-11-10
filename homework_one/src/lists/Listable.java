package lists;

/**
 * Created by marvinpiekarek on 07.11.16.
 */
public interface Listable<T> {

    /**
     * Adds an element <b>type T</b> at the end of the list
     * @param data
     */
    void add(T data);

    /**
     * Removes a certain element from the list
     * @param index which item should get removed
     */
    void remove(int index);

    /**
     * Gets a certain element from the list on a specific index
     * @param index which specific item should be returned
     * @return element of <b>type T</b>
     */
    T get(int index);

    /**
     * Clear the whole list from all it's elements.
     */
    void clear();

    /**
     * Check's if the list is currently empty.
     * @return boolean if empty or not.
     */
    boolean isEmpty();

    /**
     * Get the size/length of the current list.
     * @return Integer as length of the list.
     */
    int getLength();

    /**
     * Prints out all elements on the console.
     */
    void printAll();

    /**
     * Inserts a certain new element on a specific index.
     * @param index where the item should be placed
     * @param data which data it should contain.
     */
    void insertAt(int index, T data);

}
