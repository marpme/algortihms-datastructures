package main;

import lists.Listable;
import lists.SinglyLinkedList;
import resources.Gender;
import resources.Student;
import sort.Sortable;
import sort.comparator.GenderComparator;
import sort.comparator.IDComparator;
import sort.comparator.SurnameComparator;
import sort.sortAlgorithms.QuickSort;
import sort.sortAlgorithms.SelectionSort;

/**
 * Created by marvinpiekarek on 09/11/2016.
 */
public class Main {

    public static void main(String[] args) {
        Student a = new Student("Marvin", "Piekarek", "AI", 21, 35315, Gender.MALE);
        Student b = new Student("Mareike", "Munce", "BWL", 22, 15262, Gender.FEMALE);
        Student c = new Student("Ali", "Baba", "AI",12, 15325235, Gender.OTHER);
        Student d = new Student("Ali", "kachba", "AI",12, 15325235, Gender.MALE);

        Listable<Student> list = new SinglyLinkedList<Student>();
        list.add(a);
        list.add(b);
        list.add(c);
        list.add(d);

        //list.printSingle(2);
        //list.insertAtFirst(d);
        //list.insertAt(2, d);

        //Sortable<Student> kk = new SelectionSort<>();
        Sortable<Student> lol = new QuickSort<>();

        lol.sort(list, new SurnameComparator());
        //kk.sort(list, new GenderComparator());

        list.printAll();
    }

}
