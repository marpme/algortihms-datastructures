package lists;

import org.junit.Before;
import org.junit.Test;
import resources.Gender;
import resources.Student;

import static org.junit.Assert.*;

/**
 * Created by marvin piekarek on 10/11/2016.
 */
public class SinglyLinkedListTest {

    private Listable<Student> list;
    private Listable<Student> lost;
    private Student a;
    private Student b;
    private Student c;

    @Before
    public void setUp() throws Exception {
        a = new Student("Marvin", "Piekarek", "AI", 21, 35315, Gender.MALE);
        b = new Student("Mareike", "Munce", "BWL", 22, 15262, Gender.FEMALE);
        c = new Student("Ali", "Baba", "AI",12, 15325235, Gender.OTHER);

        list = new SinglyLinkedList<>();
        list.add(a);
        list.add(b);
        list.add(c);

        lost = new SinglyLinkedList<>();
        lost.add(a);
        lost.add(c);
    }

    @Test
    public void add() throws Exception {
        assertEquals("The list size should be 3.", 3, list.getLength());
    }

    @Test
    public void remove() throws Exception {
        // nothing should happen out of bounds ;)
        list.remove(99);
        list.remove(2);
        assertEquals("the size should be 2 after removing an element.", 2, list.getLength());
        list.remove(1);
        assertEquals("the size should be 1 right now.", 1, list.getLength());
        list.remove(1);
        assertEquals("This size should be zero right now.", 0, list.getLength());
    }

    @Test
    public void get() throws Exception {
        assertEquals("Objects aren't equal", c, list.get(2));
        assertEquals("Hashcodes aren't equal", c.hashCode(), list.get(2).hashCode());
    }

    @Test
    public void set() throws Exception {
        list.set(1, c);
        assertEquals("Objects after set aren't equal", c, list.get(1));
    }

    @Test
    public void clear() throws Exception {
        list.clear();
        assertEquals("There shouldn't be any items.",  0, list.getLength());
    }

    @Test
    public void isEmpty() throws Exception {
        assertTrue(!list.isEmpty());
        list.clear();
        assertTrue(list.isEmpty());

    }

    @Test
    public void getLength() throws Exception {
        assertEquals("Length is not equal", 3, list.getLength());
        assertEquals("Length is not equal", 2, lost.getLength());
    }

    @Test
    public void printLength() throws Exception {
        try{
            list.printLength();
        }catch (Exception e){
            assertTrue("Oh print length went wrong :( ", false);
        }

        assertTrue(true);
    }

    @Test
    public void printAll() throws Exception {
        try{
            list.printAll();
        }catch(Exception e){
            assertTrue(false);
        }
        assertTrue(true);
    }

    @Test
    public void noItemsPrintAll() throws Exception {
        Listable<Student> listTwo = new SinglyLinkedList<>();
        try{
            listTwo.printAll();
        }catch(Exception e){
            assertTrue(false);
        }
        assertTrue(true);
    }

    @Test
    public void printSingle() throws Exception {
        try{
            list.printSingle(3);
        }catch(Exception e){
            assertTrue("oh oh something went wrong :(", false);
        }
        assertTrue(true);
    }

    @Test
    public void insertAt() throws Exception {
        list.insertAt(2, c);
        assertEquals("Objects not correctly inserted.", c, list.get(2));
    }

    @Test
    public void insertAtLast() throws Exception {
        list.insertAtLast(a);
        assertEquals("Objects not correctly inserted.", a, list.get(list.getLength() - 1));
    }

    @Test
    public void insertAtFirst() throws Exception {
        list.insertAtFirst(c);
        assertEquals("Objects not correctly inserted.", c, list.get(0));
    }

   @Test
    public void equals() throws Exception {
       assertTrue(!list.equals(lost));
       assertTrue(list.equals(list));
    }

}