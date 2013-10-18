
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
public class MergeSort extends SortBase {

    public MergeSort(int n) {
        super(n);
    }

    @Override
    public List<Integer> sort(List<Integer> arr) {
        List left, right, result, x;
        x = new ArrayList(arr);
        int split;

        if (x.size() == 1) {
            return x;
        } else {
            split = (int) Math.floor((x.size() / 2));
            left = x.subList(0, split);
            right = x.subList(split, x.size());
            left = sort(left);
            right = sort(right);
            result = merge(left, right);
            return result;
        }
    }

    private List<Integer> merge(List<Integer> left, List<Integer> right) {
        List<Integer> temp = new ArrayList<>();
        
        while (left.size() > 0 && right.size() > 0) {
            if (left.get(0) <= right.get(0)) {
                temp.add(left.get(0));
                left = left.subList(1, left.size());
            } else {
                temp.add(right.get(0));
                right = right.subList(1, right.size());
            }
        }
        if (left.size() > 0) {
            for (int i = 0; i < left.size(); i++) {
                temp.add(left.get(i));
            }
        }
        if (right.size() > 0) {
            for (int i = 0; i < right.size(); i++) {
                temp.add(right.get(i));
            }
        }
        return temp;
    }
}
