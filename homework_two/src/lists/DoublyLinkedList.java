package lists;

/**
 * Class description ...
 * Included in lists
 *
 * @author Marvin Piekarek (s0556014)
 * @version 1.0
 * @since 21. Dec 2016
 */
public class DoublyLinkedList<T> extends Listable<T> {

    /**
     * Tail of the dynamic list
     */
    private Node<T> tail;

    /**
     * Dynamic length counter
     */
    private int length;

    /**
     * Adds an element <b>type T</b> at the end of the list
     *
     * @param data required data to be stored inside the list
     */
    @Override
    public void add(T data) {

    }

    /**
     * Removes a certain element from the list
     *
     * @param index which item should get removed
     */
    @Override
    public void remove(int index) {

    }

    /**
     * Gets a certain element from the list on a specific index
     *
     * @param index which specific item should be returned
     * @return element of <b>type T</b>
     */
    @Override
    public T get(int index) {
        return null;
    }

    /**
     * Clear the whole list from all it's elements.
     */
    @Override
    public void clear() {
        head = tail = null;
        length = 0;
    }

    /**
     * Check's if the list is currently empty.
     *
     * @return boolean if empty or not.
     */
    @Override
    public boolean isEmpty() {
        return length == 0 && tail == null && head == null ;
    }

    /**
     * Get the size/length of the current list.
     *
     * @return Integer as length of the list.
     */
    @Override
    public int getLength() {
        return length;
    }

    /**
     * Prints out the current length of the list
     */
    @Override
    public void printLength() {
        System.out.printf("List length: %d %n", getLength());
    }

    /**
     * Prints a single value at a given index.
     *
     * @param index
     */
    @Override
    public void printSingle(int index) {

    }

    /**
     * Sets a specific data at a given index.
     *
     * @param index where the data should be set
     * @param data  what data should be set
     */
    @Override
    public void set(int index, T data) {

    }

    /**
     * Inserts a certain new element on a specific index.
     *
     * @param index where the item should be placed
     * @param data  which data it should contain.
     */
    @Override
    public void insertAt(int index, T data) {
        if(this.isEmpty()){
            Node<T> newTemp = new Node<>();
            newTemp.data = data;
            newTemp.next = null;
            this.head = newTemp;
            this.tail = head;
            this.length++;
        }else if(!this.isEmpty() && index == 0){ // first
            Node<T> newTemp = new Node<>();
            newTemp.data = data;
            newTemp.next = this.head;
            this.head = newTemp;
            this.length++;
        }else if(!this.isEmpty() &&  // somewhere in the middle :)
                index > 0 && index < this.length - 1){

        }else if(!this.isEmpty() &&  // somewhere between length and ++
                index >= this.length - 1){
            Node<T> newTemp = new Node<>();
            newTemp.data = data;
            newTemp.next = this.head;

        }
    }

    /**
     * Inserts a Node at First index
     *
     * @param data contains the data
     */
    @Override
    public void insertAtFirst(T data) {

    }

    /**
     * Inserts a Node at after last index
     *
     * @param data contains the data
     */
    @Override
    public void insertAtLast(T data) {

    }
}
