package comparator;

import resources.Student;

/**
 * Created by marvinpiekarek on 21/11/2016.
 */
public class GenderComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return o1.getGender().ordinal() - o2.getGender().ordinal();
    }

}
