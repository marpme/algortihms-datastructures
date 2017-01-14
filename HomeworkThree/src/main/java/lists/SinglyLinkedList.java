package lists;

/**
 * An singly linked list, which may contain any data you wish
 * linked with next node which has been added.
 *
 * @param <T> the type of data you want to enter.
 */
public class SinglyLinkedList<T> extends Listable<T> {

    Node<T> head;

    /**
     * Adds an element <b>type T</b> at the end of the list
     *
     * @param data as <b>type T</b>
     */
    @Override
    public void add(T data) {
        Node<T> newNode = new Node<T>();
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
        length++;
    }

    /**
     * Removes a certain element from the list
     *
     * @param index which item should get removed
     */
    @Override
    public void remove(int index) {

        if (index >= getLength() || index < 0){
            System.out.println("Wrong index given to remove.");
        } else if (head != null && head.next == null) { // check if delete header ?!
            head = null;
            length--;
        }else if(head != null && index == 0){ // check if remove header special case!
            head = head.next;
            this.length--;
        }else if(head != null && index > 0 && index < this.length){ // between case.
            Node<T> temp = head;
            int count = 0;
            while(temp != null){
                if(count == index-1){
                   if(temp.next != null && temp.next.next != null){
                       temp.next = temp.next.next;
                       this.length--;
                   }else if(temp.next != null){
                       temp.next  = null;
                       this.length--;
                   }
                }
                temp = temp.next;
                count++;
            }
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
        Node<T> temp = head;
        int co = 0;
        while (temp != null) {
            if (co == index) {
                return temp.data;
            }
            temp = temp.next;
            co++;
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
        Node<T> temp = head;
        int co = 0;
        while (temp != null) {
            if (co == index) {
                temp.data = data;
                return;
            }
            temp = temp.next;
            co++;
        }
    }

    /**
     * Clear the whole list from all it's elements.
     */
    @Override
    public void clear() {
        head = null;
        length = 0;
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
     * Prints out all elements on the console.
     */
    public void printAll() {
        System.out.printf(this.getClass().getSimpleName() + " [Size: %s] ", this.getLength());

        if (isEmpty()) {
            System.out.printf("{%n   => There are no items.%n}%n");
            return;
        }

        Node<T> temp = head;
        String end = " { %n";
        while (temp != null) {
            if (temp.next != null) {
                end += "   => " + temp.data.toString() + ", %n";
            } else {
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
        if (isEmpty() || getLength() < index || index <= 0) {
            System.out.printf("{ Element not found. }%n");
            return;
        }

        System.out.printf("Element@[index:%s] => %s %n", index, get(index));
    }

    /**
     * Inserts a certain new element on a specific index.
     *
     * @param index where the item should be placed
     * @param data  which data it should contain.
     */
    @Override
    public void insertAt(int index, T data) {
        if (index > length) {
            return;
        } else if (index == 0) {
            this.insertAtFirst(data);
            return;
        } else if (index == length) {
            this.insertAtLast(data);
            return;
        } else if (index < 0) {
            return;
        }

        Node<T> newNode = new Node<T>();
        newNode.data = data;
        newNode.next = null;

        int count = 1;
        Node<T> temp = head;

        while (temp != null) {
            if (index == count) {
                newNode.next = temp.next;
                temp.next = newNode;
                length++;
                return;
            }
            temp = temp.next;
            count++;
        }
    }

    @Override
    public void insertAtFirst(T data) {
        if (data == null)
            return;

        Node<T> newNode = new Node<T>();
        newNode.data = data;
        newNode.next = this.head;
        this.head = newNode;
        this.length++;
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

        if (length != that.length) return false;
        return head != null ? head.equals(that.head) : that.head == null;
    }

    private class Node<T> {
        T data;
        Node<T> next;
    }

}
