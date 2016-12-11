package sort.comparator;

import resources.Student;

/**
 * Created by marvinpiekarek on 21/11/2016.
 */
public class NameComparator implements Comparator<Student>{

    @Override
    public int compare(Student o1, Student o2) {
        if(o1.getName() == null && o2.getName() == null){
            return 0;
        }else if(o1.getName() == null){
            return 1;
        }else if(o2.getName() == null){
            return -1;
        }

        return o1.getName().compareTo(o2.getName());
    }

}
