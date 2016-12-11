package main;

import resource.Student;

import sort.Comparator.MatrikulationNumberComparator;
import sort.Comparator.NameComparator;
import sort.SelectionSort.SelectionSort;
import sort.Sortable;

import java.util.Arrays;
import java.util.List;

/**
 * Created by marvinpiekarek on 07.11.16.
 */
public class Main {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {

        Student s1 = new Student("Kevin", "Piekarek", 3, 111, 2);
        Student s2 = new Student("Maria", "Cooper", 5, 233, 2);
        Student s3 = new Student( null, "Mr. Robot", 1, 133, 1);
        Student s4 = new Student("Zoe", "Sparks", 1324, 43, 2);

        List<Student> a = Arrays.asList(s1, s2, s3, s4);

        System.out.println("unsortiert:");
        printStudents(a);

        Sortable<Student> doSort = new SelectionSort<>();
        doSort.sort(a, new MatrikulationNumberComparator());
        System.out.println("Sortiert nach MN:");
        printStudents(a);

        doSort.sort(a, new NameComparator());
        System.out.println("Sortiert nach Prename:");
        printStudents(a);



    }

    /**
     *
     * @param a
     */
    public static void printStudents(List<Student> a){
        for (Student student : a) {
            System.out.println(student.getMn() + " - " + student.getName());
        }
    }

}
