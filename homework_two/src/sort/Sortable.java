package sort;

import comparator.Comparator;
import lists.Listable;

/**
 * Created by marvinpiekarek on 21/11/2016.
 */
public interface Sortable<T> {

    void sort(Listable<T> list, Comparator<T> comparator);

}
