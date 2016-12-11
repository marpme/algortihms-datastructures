package sort.comparator;

import resources.Student;

/**
 * Created by marvinpiekarek on 21/11/2016.
 */
public class IDComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return o1.getMn() - o2.getMn();
    }

}
