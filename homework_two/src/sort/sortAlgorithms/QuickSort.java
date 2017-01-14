package sort.sortAlgorithms;

import comparator.Comparator;
import lists.Listable;
import sort.Sortable;

/**
 * QuickSort Algorithm
 *
 * @param <T> Data type
 */
public class QuickSort<T> implements Sortable<T> {

    /**
     * Main sort method wrapper
     *
     * @param list       list to be sorted
     * @param comparator comparator for compare operations
     */
    @Override
    public void sort(Listable<T> list, Comparator<T> comparator) {
        quickSort(list, comparator, 0, list.getLength() - 1);
    }

    /**
     * Recursive quick sort algorithm
     *
     * @param x          the list
     * @param comparator comparator for sorting
     * @param left       left border
     * @param right      right border
     */
    private void quickSort(Listable<T> x, Comparator<T> comparator, int left, int right) {
        if (left < right) {
            int i = partition(x, left, right, comparator);
            quickSort(x, comparator, left, i - 1);
            quickSort(x, comparator, i + 1, right);
        }
    }

    /**
     * Partition the list
     *
     * @param list       the list
     * @param left       left border
     * @param right      right border
     * @param comparator comparator for sorting
     * @return returns the pivot item index
     */
    private int partition(Listable<T> list, int left, int right, Comparator<T> comparator) {
        T pivot, help;
        int i, j;

        pivot = list.get(right);
        i = left;
        j = right - 1;

        while (i <= j) {
            if (comparator.compare(list.get(i), pivot) > 0) {
                help = list.get(i);
                list.set(i, list.get(j));
                list.set(j, help);
                j--;
            } else {
                i++;
            }
        }

        help = list.get(i);
        list.set(i, list.get(right));
        list.set(right, help);

        return i;
    }


}
