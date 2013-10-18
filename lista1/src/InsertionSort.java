
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
public class InsertionSort extends SortBase {

    public InsertionSort(int n) {
        super(n);
    }

    @Override
    public List<Integer> sort(List<Integer> arr) {
        int tmp;
        long comp = 0;
        List<Integer> temparr = new ArrayList<>(arr);

        for (int i = 1; i < temparr.size(); i++) {
            int j = i;
            tmp = temparr.get(i);
            while (j > 0 && tmp < temparr.get(j - 1)) {
                temparr.set(j, temparr.get(j - 1));
                j--;
                comp++;
            }
            temparr.set(j, tmp);
        }
        setComparsions(comp);
        return temparr;
    }
}
