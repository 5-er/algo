
import java.util.ArrayList;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author krystian
 */
public class InsertionSort extends SortBase{

    public InsertionSort(int n) {
        super(n);
    }
    
    @Override
    public ArrayList<Integer> sort(ArrayList<Integer> arr) {
        int tmp;
        
        for(int i=0 ; i<arr.size() ; i++) {
            for(int j=0 ; j<arr.size() ; j++) {
                if(arr.get(i) > arr.get(j)){}
                else {
                    tmp = arr.get(i);
                    arr.set(i, arr.get(j));
                    arr.set(j, tmp);
                }
            }
        }
        return arr;
    }
    
}
