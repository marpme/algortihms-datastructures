package main;

import comparator.GenderComparator;
import comparator.SurnameComparator;
import lists.DoublyLinkedList;
import lists.Listable;
import lists.SinglyLinkedList;
import resources.Gender;
import resources.Student;
import sort.Sortable;
import sort.sortAlgorithms.QuickSort;
import sort.sortAlgorithms.SelectionSort;

import static search.StudentPredicates.olderThan;
import static search.StudentPredicates.sequentialSearch;

/**
 * Created by marvinpiekarek on 09/11/2016.
 */
public class Main {

    public static void main(String[] args) {
        System.out.println(Gender.FEMALE.ordinal());
        Student a = new Student("Marvin", "Piekarek", "AI", 21, 35315, Gender.MALE);
        Student b = new Student("Mareike", "Munce", "BWL", 5, 15262, Gender.FEMALE);
        Student c = new Student("Ali", "Baba", "AI", 30, 15325235, Gender.OTHER);
        Student d = new Student("Ali", "kachba", "AI", 47, 15325235, Gender.MALE);

        Listable<Student> list = new SinglyLinkedList<>();
        list.add(a);
        list.add(b);
        list.add(c);
        list.add(d);

        list.printSingle(2);
        list.insertAtFirst(d);
        list.insertAt(2, d);

        Sortable<Student> kk = new SelectionSort<>();
        Sortable<Student> lol = new QuickSort<>();

        //lol.sort(list, new SurnameComparator());
        //kk.sort(list, new GenderComparator());

        Listable<Student> kappa = sequentialSearch(olderThan(30), list);

        kappa.printAll();

        list.printAll();
    }

}
