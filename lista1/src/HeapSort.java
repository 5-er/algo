
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
public class HeapSort extends SortBase{
    private List array = new ArrayList();
    
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
        int n = arr.size()-1;
        return arr;
    }
}
