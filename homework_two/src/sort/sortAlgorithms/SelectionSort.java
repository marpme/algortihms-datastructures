package sort.sortAlgorithms;

import comparator.Comparator;
import lists.Listable;
import sort.Sortable;


/**
 * Created by marvinpiekarek on 21/11/2016.
 */
public class SelectionSort<T> implements Sortable<T> {

    @Override
    public void sort(Listable<T> list, Comparator<T> comparator) {
        int minimum; // 1 OP
        for (int i = 0; i < list.getLength(); i++) { // n OP
            minimum = i; // 1 OP
            for (int e = i + 1; e < list.getLength(); e++) { // N/2
                if (comparator.compare(list.get(e), list.get(minimum)) < 0) { // 1 OP
                    minimum = e; // 1 OP
                }
            }
            swap(list, i, minimum); // 3 OP
        }
    }

    private void swap(Listable<T> list, int i, int e) {
        T memorizedObj = list.get(i);
        list.set(i, list.get(e));
        list.set(e, memorizedObj);
    }

}
