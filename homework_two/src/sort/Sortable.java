package sort;

import lists.Listable;
import lists.SinglyLinkedList;
import sort.comparator.Comparator;

/**
 * Created by marvinpiekarek on 21/11/2016.
 */
public interface Sortable<T> {

    void sort(Listable<T> list, Comparator<T> comparator);

}
