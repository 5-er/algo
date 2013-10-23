
import java.util.ArrayList;
import java.util.List;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author krystian
 */
public class QuickSort extends SortBase {

    private List<Integer> ar;
    private long comp = 0;

    public QuickSort(int n) {
        super(n);
    }

    @Override
    public List<Integer> sort(List<Integer> arr) {
        ar = new ArrayList(arr);
        quickSort(ar, 0, ar.size() - 1);
        setComparsions(comp);
        return ar;
    }

    private void quickSort(List<Integer> array, int start, int end) {
        if (start < end) {
            int q = partition(array, start, end);
            quickSort(array, start, q - 1);
            quickSort(array, q + 1, end);
        }
    }

    private int partition(List<Integer> arr, int start, int end) {
        int x = arr.get(end), i = start-1;
        for (int j = start; j <= end - 1; j++) {
            comp++;
            if (arr.get(j) < x) {
                i++;
                swap(i, j);
            }
        }
        swap(i + 1, end);
        return i + 1;
    }

    private void swap(int i, int j) {
        int temp = ar.get(i);
        ar.set(i, ar.get(j));
        ar.set(j, temp);
    }
}
