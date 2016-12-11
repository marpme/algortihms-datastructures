package sort.SelectionSort;

import sort.Comparator.Comparator;
import sort.Sortable;

import java.util.List;

/**
 * Created by marvinpiekarek on 21/11/2016.
 */
public class SelectionSort<T> implements Sortable<T> {


    @Override
    public void sort(List<T> list, Comparator<T> comparator) {
        int minimum;
        for (int i = 0; i < list.size(); i++) {
            minimum = i;
            for (int e = i + 1; e < list.size(); e++) {
                if(comparator.compare(list.get(e), list.get(minimum)) < 0){
                    minimum = e;
                }
            }
            swap(list, i, minimum);
        }
    }

    public void swap(List<T> list, int i, int e){
        T memorizedObj = list.get(i);
        list.set(i, list.get(e));
        list.set(e, memorizedObj);
    }
}
