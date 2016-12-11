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
     * Gets raised by adding elements, gets lowered by removing elements.
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

        if(index > getLength())
            return;

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
     * @param index which specific item should be returned
     * @return element of <b>type T</b>
     */
    @Override
    public T get(int index) {
        Node temp = head;
        int co = 0;
        while (temp != null) {
            if (co == index) {
                return temp.data;
            }
            co++;
            temp = temp.next;
        }
        return null;
    }

    /**
     * Sets a specific data at a given index.
     *
     * @param index where the data should be set
     * @param data  what data should be set
     */
    @Override
    public void set(int index, T data) {
        Node temp = head;
        int co = 0;
        while (temp != null) {
            if (co == index) {
                temp.data = data;
                return;
            }
            co++;
            temp = temp.next;
        }
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
     * @return boolean if empty or not.
     */
    @Override
    public boolean isEmpty() {
        return (head == null);
    }

    /**
     * Get the size/length of the current list.
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
     * Prints out one specific element on the console.
     */
    @Override
    public void printSingle(int index) {
        if(isEmpty() || getLength() < index || index <= 0) {
            System.out.printf("{ Element not found. }%n");
            return;
        }

        System.out.printf("Element@[index:%s] => %s %n", index, get(index));
    }

    /**
     * Inserts a certain new element on a specific index.
     * @param index where the item should be placed
     * @param data  which data it should contain.
     */
    @Override
    public void insertAt(int index, T data) {
        if(index > counter){
            return;
        }else if(index == 0){
            this.insertAtFirst(data);
            return;
        }else if(index == counter){
            this.insertAtLast(data);
            return;
        }else if(index < 0){
            return;
        }

        Node newNode = new Node();
        newNode.data = data;
        newNode.next = null;

        int count = 0;
        Node temp = head;

        while(temp != null){
            if(index == count){
                newNode.next = temp.next;
                temp.next = newNode;
                counter++;
            }
            count++;
            temp = temp.next;
        }
    }


    @Override
    public void insertAtFirst(T data) {
        if(data == null)
            return;

        Node newNode = new Node();
        newNode.data = data;
        newNode.next = this.head;
        this.head = newNode;
    }

    @Override
    public void insertAtLast(T data) {
        this.add(data);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SinglyLinkedList)) return false;

        SinglyLinkedList<?> that = (SinglyLinkedList<?>) o;

        if (counter != that.counter) return false;
        return head != null ? head.equals(that.head) : that.head == null;
    }

    /**
     * Nested private class NODE for saving every
     * Data package in a single Node which knows the next node, only.
     */
    public class Node {
        T data;
        Node next;

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            try{
                Node node = (Node) o;

                if (!data.equals(node.data)) return false;
                return next.equals(node.next);
            }catch(Exception e){
                return false;
            }
        }

    }


}
