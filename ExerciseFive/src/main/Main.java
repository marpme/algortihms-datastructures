package main;

import hashing.*;
import resources.Student;

/**
 * Class description ...
 * Included in main
 *
 * @author Marvin Piekarek (s0556014)
 * @version 1.0
 * @since 05. Dec 2016
 */
public class Main {

    public static void main(String[] args) {
        IProbing p = new QuadraticProbe();
        HashMap<Student> k = new HashMap<>(3, p);
        Student a = new Student("Piekarek", "Marvin", 1234, 21, 0);
        Student b = new Student("Hans", "Peter", 19241, 21, 0);
        Student c = new Student("Kokos", "Schaum", 287134, 21, 0);
        k.add(a.getMn(), a);
        k.add(b.getMn(), b);
        k.add(c.getMn(), c);
        System.out.println(k);
        System.out.println(k.get(19241));
    }

}
