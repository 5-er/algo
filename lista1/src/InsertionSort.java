
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
        ArrayList<Integer> temparr = new ArrayList<>(arr);
        
        for(int i=0 ; i<temparr.size() ; i++) {
            for(int j=0 ; j<temparr.size() ; j++) {
                if(temparr.get(i) > temparr.get(j)){}
                else {
                    tmp = temparr.get(i);
                    temparr.set(i, temparr.get(j));
                    temparr.set(j, tmp);
                }
            }
        }
        return temparr;
    }
    
}
