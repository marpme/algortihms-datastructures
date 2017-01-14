package stack;

import lists.SinglyLinkedList;

/**
 * Class description ...
 * Included in stack
 *
 * @author Marvin Piekarek (s0556014)
 * @version 1.0
 * @since 13. Jan 2017
 */
public class Stack<E> extends SinglyLinkedList<E> implements Stackable<E>  {


    /**
     * Ctor for Stack without parameters
     */
    public Stack(){
        super();
    }

    /**
     * Pushes one Object on the top of the stack
     *
     * @param data data that gets pushed
     */
    public void push(E data) {
        this.insertAtFirst(data);
    }

    /**
     * Pop gets the top object of
     * the stack and removes it.
     *
     * @return the object
     */
    public E pop() {
        return this.removeAtIndex(0);
    }

    /**
     * Views and returns the top object of
     * the stack and put it back.
     *
     * @return the object.
     */
    public E peek() {
        return this.get(0);
    }

    /**
     * Removes a given object inside the stack.
     * (must not be on top!)
     *
     * @param index the index.
     * @return the object.
     */
    public E removeAtIndex(int index) {
        E data = this.get(index);
        this.remove(index);
        return data;
    }

    /**
     * Adds an object to an specific position inside the stack.
     *
     * @param data  the object.
     * @param index the index.
     */
    public void addAtIndex(E data, int index) {
        this.insertAt(index, data);
    }

    public void printSize(){
        System.out.printf("%s [Size: %s] %n", this.getClass().getSimpleName(),this.getLength());
    }

    public void printStack(){
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        String k = String.format("%s [Size: %s] %n", this.getClass().getSimpleName(),this.getLength());
        k += String.format("{ %n");
        for (int i = 0; i < this.getLength(); i++) {
            if(i == this.getLength() - 1)
                k += String.format("  %s%n", this.get(i).toString());
            else
                k += String.format("  %s,%n", this.get(i).toString());
        }
        k += String.format("} %n ");
        return k;
    }
}

