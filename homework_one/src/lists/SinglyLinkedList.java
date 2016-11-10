package lists;

/**
 * An singly linked list, which may contain any data you wish
 * linked with next node which has been added.
 * @param <T> the type of data you want to enter.
 */
public class SinglyLinkedList<T> implements Listable<T> {

    /**
     * The head of all Nodes, our main entry point to add,
     * remove, insert new elements.
     */
    private Node head;

    /**
     * a background counter for all elements inside the list.
     * Gets raised by adding elements, gets lowered by removing elemnts.
     * No direct getters or setters needed. Just the getLength function.
     */
    private int counter;

    /**
     * Adds an element <b>type T</b> at the end of the list
     * @param data as <b>type T</b>
     */
    @Override
    public void add(T data) {
        Node newNode = new Node();
        newNode.data = data;
        newNode.next = null;

        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
        counter++;
    }

    /**
     * Removes a certain element from the list
     *
     * @param index which item should get removed
     */
    @Override
    public void remove(int index) {
        if(index > getLength()) return;

        if(getLength() == 1){
            head = null;
            counter--;
            return;
        }

        int count = 0;
        Node temp = head;
        while(temp != null){
            if(count == index - 1){
                temp.next = temp.next.next;
                counter--;
                return;
            }
            temp = temp.next;
            count++;
        }
    }

    /**
     * Gets a certain element from the list on a specific index
     *
     * @param index which specific item should be returned
     * @return element of <b>type T</b>
     */
    @Override
    public T get(int index) {
        Node temp = head;
        int co = 0;
        while (temp != null) {
            co++;
            if (co == index) {
                return temp.data;
            }
            temp = temp.next;
        }
        return null;
    }

    /**
     * Clear the whole list from all it's elements.
     */
    @Override
    public void clear() {
        head = null;
        counter = 0;
    }

    /**
     * Check's if the list is currently empty.
     *
     * @return boolean if empty or not.
     */
    @Override
    public boolean isEmpty() {
        return (head == null);
    }

    /**
     * Get the size/length of the current list.
     *
     * @return Integer as length of the list.
     */
    @Override
    public int getLength() {
        return counter;
    }

    /**
     * Prints out all elements on the console.
     */
    @Override
    public void printAll() {
        System.out.printf(this.getClass().getSimpleName() + " [Size: %s] ", getLength());

        if(isEmpty()) {
            System.out.printf("{%n   => There are no items.%n}%n");
            return;
        }

        Node temp = head;
        String end = " { %n";
        while (temp != null) {
            if(temp.next != null){
                end += "   => " + temp.data.toString() + ", %n";
            }else {
                end += "   => " + temp.data.toString();
            }
            temp = temp.next;
        }
        System.out.printf(end + "%n}%n");
    }

    /**
     * Inserts a certain new element on a specific index.
     *
     * @param index where the item should be placed
     * @param data  which data it should contain.
     */
    @Override
    public void insertAt(int index, T data) {
        if(index >= counter) return;

        Node newNode = new Node();
        newNode.data = data;
        newNode.next = null;
        int count = 0;
        Node temp = head;

        while(temp != null){
            if(index - 1 == count){

                counter++;
            }
            count++;
        }
    }

    /**
     * Nested private class NODE for saving every
     * Data package in a single Node which knows the next node, only.
     */
    private class Node {
        T data;
        Node next;
    }


}
