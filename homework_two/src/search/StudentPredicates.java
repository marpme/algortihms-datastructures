package search;

import lists.Listable;
import lists.SinglyLinkedList;
import resources.Gender;
import resources.Student;

/**
 * Class description ...
 * Included in search
 *
 * @author Marvin Piekarek (s0556014)
 * @version 1.0
 * @since 21. Dec 2016
 */
public class StudentPredicates {

    public static Predicate<Student> namePredicate(String name){
        return s -> s.getName().equals(name);
    }

    public static Predicate<Student> surenamePredicate(String surname){
        return s -> s.getSurname().equals(surname);
    }

    public static Predicate<Student> olderThan(int age){
        return s -> s.getAge() > age;
    }

    public static Predicate<Student> yungerThan(int age){
        return s -> s.getAge() < age;
    }

    public static Predicate<Student> ageEquals(int age){
        return s -> s.getAge() == age;
    }

    public static Predicate<Student> genderPredicate(Gender gender){
        return s -> s.getGender() == gender;
    }

    public static Predicate<Student> fieldOfStudiesPredicate(String field){
        return s -> s.getFieldOfStudies().equals(field);
    }

    public static Predicate<Student> mnBiggerThan(int mn){
        return s -> s.getMn() > mn;
    }

    public static Predicate<Student> mnLowerThan(int mn){
        return s -> s.getMn() < mn;
    }

    public static Predicate<Student> mnEquals(int mn){
        return s -> s.getMn() == mn;
    }

    /**
     * Sequential Search for student
     * @param p
     * @param list
     * @return
     */
    public static Listable<Student> sequentialSearch(Predicate<Student> p, Listable<Student> list){
        Listable<Student> listy = new SinglyLinkedList<>();
        for (int i = 0; i< list.getLength(); i++){
            Student a = list.get(i);
            if(p.matches(a)) {
                listy.add(a);
            }
        }
        return listy;
    }

}
