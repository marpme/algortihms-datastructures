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

    @Before
    public void setUp() throws Exception {
        Student a = new Student("Marvin", "Piekarek", "AI", 21, 35315, Gender.MALE);
        Student b = new Student("Mareike", "Munce", "BWL", 22, 15262, Gender.FEMALE);
        Student c = new Student("Ali", "Baba", "AI",12, 15325235, Gender.OTHER);

        list = new SinglyLinkedList<Student>();
        list.add(a);
        list.add(b);
        list.add(c);

        lost = new SinglyLinkedList<Student>();
        lost.add(a);
        lost.add(c);

    }

    @Test
    public void add() throws Exception {
        assertEquals("The list size should be 3.", 3, list.getLength());
    }

    @Test
    public void remove() throws Exception {
        list.remove(2);
        assertEquals("the size should be 2 after removing an element.", 2, list.getLength());
        list.remove(1);
        assertEquals("the size should be 1 right now.", 1, list.getLength());
        list.remove(1);
        assertEquals("This size should be zero right now.", 0, list.getLength());
    }

    @Test
    public void get() throws Exception {
        Student b = new Student("Mareike", "Munce", "BWL", 22, 15262, Gender.FEMALE);
        assertTrue("Objects aren't equal", list.get(2).equals(b));
        assertTrue("Hashcodes aren't equal", list.get(2).hashCode() == b.hashCode());
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
    public void insertAt() throws Exception {

    }

   @Test
    public void equals() throws Exception {
       assertTrue(!list.equals(lost));
       assertTrue(list.equals(list));
    }

}