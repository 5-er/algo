
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 *
 * @author krystian
 */
abstract class  SortBase {
    private int maxInt;
    private long inv, comp;
    private List<Integer> numbers, sorted;
    private Random rand;
    
    /**
     * 
     * @param n maximum number which can be draw
     */
    public SortBase(int n) {
        maxInt = n;
        numbers = new ArrayList<>(maxInt);
        perm();
//        selectRandom();
        countInv(numbers);
    }
    /**
     * function filling numbers array with random numbers from 0 to maxInt
     */
    private void selectRandom() {
        rand = new Random();
        for(int i=0 ; i<maxInt-1 ; i++)
            numbers.add(rand.nextInt(maxInt-1));
    }
    
    private void perm() {
        for(int i=0 ; i<maxInt ; i++)
            numbers.add(i);
        Collections.shuffle(numbers);
    }
    
    private void countInv(List<Integer> n) {
        inv = 0;
        for (int i = 0; i < n.size(); i++) {
            for (int j = i+1; j < n.size(); j++) {
                if (n.get(i) > n.get(j)) {
                    inv++;
                }
            }
        }
    }
    
    public long getInv() {
        return inv;
    }
    
    public abstract List<Integer> sort(List<Integer> arr);
    
    public void showNumbers() {
        System.out.println("Unsorted array");
        for(int i=0 ; i<numbers.size() ; i++)
            System.out.print(numbers.get(i)+" ");
        System.out.println();
    }
    
    public List<Integer> getNumbers() {
        return numbers;
    }
    
    public void showSorted() {
        System.out.println("Sorted array");
        for(int i=0 ; i<sorted.size() ; i++) {
            System.out.print(sorted.get(i)+" ");
        }
        System.out.println();
    }
    
    public void setSorted(List<Integer> arr) {
        sorted = arr;
    }
    
    public List<Integer> getSorted() {
        return sorted;
    }
    
    public void setComparsions(long n) {
        comp = n;
    }
    
    public long getComparsions() {
        return comp;
    }
}
