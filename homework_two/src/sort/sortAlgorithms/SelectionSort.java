package sort.sortAlgorithms;

import lists.Listable;
import sort.comparator.Comparator;
import sort.Sortable;

import lists.SinglyLinkedList;


/**
 * Created by marvinpiekarek on 21/11/2016.
 */
public class SelectionSort<T> implements Sortable<T> {

    @Override
    public void sort(Listable<T> list, Comparator<T> comparator) {
        int minimum;
        for (int i = 0; i < list.getLength(); i++) {
            minimum = i;
            for (int e = i + 1; e < list.getLength(); e++) {
                if(comparator.compare(list.get(e), list.get(minimum)) < 0){
                    minimum = e;
                }
            }
            swap(list, i, minimum);
        }
    }

    private void swap(Listable<T> list, int i, int e){
        T memorizedObj = list.get(i);
        list.set(i, list.get(e));
        list.set(e, memorizedObj);
    }

}
