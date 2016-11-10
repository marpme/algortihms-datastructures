package lists;

import org.junit.Before;
import org.junit.Test;
import resources.Gender;
import resources.Student;

import static org.junit.Assert.*;

/**
 * Created by marvinpiekarek on 10/11/2016.
 */
public class SinglyLinkedListTest {

    private Listable<Student> list;

    @Before
    public void setUp() throws Exception {
        Student a = new Student("Marvin", "Piekarek", 21, 35315, Gender.MALE);
        Student b = new Student("Mareike", "Munce", 22, 15262, Gender.FEMALE);
        Student c = new Student("Ali", "Baba", 12, 15325235, Gender.OTHER);

        list = new SinglyLinkedList<Student>();
        list.add(a);
        list.add(b);
        list.add(c);
    }

    @Test
    public void add() throws Exception {
        assertEquals("Should be a size of 3", 3, list.getLength());
    }

    @Test
    public void remove() throws Exception {

    }

    @Test
    public void get() throws Exception {

    }

    @Test
    public void clear() throws Exception {

    }

    @Test
    public void isEmpty() throws Exception {

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

}