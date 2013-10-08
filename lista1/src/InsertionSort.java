
import java.util.ArrayList;

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
    public ArrayList<Integer> sort(ArrayList<Integer> arr) {
        int tmp;
        ArrayList<Integer> temparr = new ArrayList<>(arr);

        for (int i = 1; i < temparr.size(); i++) {
            int j = i;
            tmp = temparr.get(i);
            while (j > 0 && tmp < temparr.get(j - 1)) {
                temparr.set(j, temparr.get(j - 1));
                j--;
            }
            temparr.set(j, tmp);
        }
        return temparr;
    }
    /*
     * for (int i = 1; i < n; i++){
     int j = i;
     int B = array[i];
     while ((j > 0) && (array[j-1] > B)){
     array[j] = array[j-1];
     j--;
     }
     array[j] = B;
     }
     }
     }
     */
}
