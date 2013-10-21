
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
public class HeapSort extends SortBase {

    private List array = new ArrayList();
    private int heapSize = 0;

    public HeapSort(int n) {
        super(n);
    }

    private void swap(int i, int j) {
        int tmp;
        tmp = (int) array.get(i);
        array.set(i, array.get(j));
        array.set(j, tmp);
    }

    @Override
    public List<Integer> sort(List<Integer> arr) {
        array = new ArrayList(arr);
        buildHeap(array);
        for (int i = arr.size() - 1; i >= 1; i--) {
            swap(0, i);
            heapSize--;
            heapify(array, 0);
        }
        return array;
    }

    private void buildHeap(List<Integer> arr) {
        heapSize = arr.size()-1;
        for (int i = (int) Math.floor(arr.size() / 2) - 1; i >= 0; i--) {
            heapify(arr, i);
        }
    }

    private void heapify(List<Integer> arr, int index) {
        int r = 2 * index + 2, l = 2 * index + 1, largest;
        if (l <= heapSize && arr.get(l) > arr.get(index)) {
            largest = l;
        } else {
            largest = index;
        }
        if (r <= heapSize && arr.get(r) > arr.get(largest)) {
            largest = r;
        }
        if (largest != index) {
            swap(index, largest);
            heapify(arr, largest);
        }
    }
}
