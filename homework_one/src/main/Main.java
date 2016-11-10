package main;

import lists.Listable;
import lists.SinglyLinkedList;
import resources.Gender;
import resources.Student;

/**
 * Created by marvinpiekarek on 09/11/2016.
 */
public class Main {

    public static void main(String[] args) {
        Student a = new Student("Marvin", "Piekarek", 21, 35315, Gender.MALE);
        Student b = new Student("Mareike", "Munce", 22, 15262, Gender.FEMALE);
        Student c = new Student("Ali", "Baba", 12, 15325235, Gender.OTHER);

        Listable<Student> list = new SinglyLinkedList<Student>();
        list.add(a);
        list.add(b);
        list.add(c);
        list.printAll();
    }

}
