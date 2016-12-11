package sort;

import sort.Comparator.Comparator;

import java.util.List;

/**
 * Created by marvinpiekarek on 21/11/2016.
 */
public interface Sortable<T> {

    void sort(List<T> list, Comparator<T> comparator);

}
