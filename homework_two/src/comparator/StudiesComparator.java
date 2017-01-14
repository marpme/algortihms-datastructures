package comparator;

import resources.Student;

/**
 * Created by marvinpiekarek on 21/11/2016.
 */
public class StudiesComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        if (o1.getFieldOfStudies() == null && o2.getFieldOfStudies() == null) {
            return 0;
        } else if (o1.getFieldOfStudies() == null) {
            return -1;
        } else if (o2.getFieldOfStudies() == null) {
            return 1;
        }

        return o1.getFieldOfStudies().compareTo(o2.getFieldOfStudies());
    }

}
