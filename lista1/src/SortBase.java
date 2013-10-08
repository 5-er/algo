
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author krystian
 */
abstract class  SortBase {
    private int maxInt;
    private ArrayList<Integer> numbers, sorted;
    private Random rand;
    
    /**
     * 
     * @param n maximum number which can be draw
     */
    public SortBase(int n) {
        maxInt = n;
        selectRandom();
    }
    //function filling numbers array with random numbers from 0 to maxInt
    private void selectRandom() {
        rand = new Random();
        numbers = new ArrayList<>(maxInt-1);
        for(int i=0 ; i<maxInt-1 ; i++)
            numbers.add(rand.nextInt(maxInt-1));
    }
    
    public abstract ArrayList<Integer> sort(ArrayList<Integer> arr);
    
    public void showNumbers() {
        System.out.println("Unsorted array");
        for(int i=0 ; i<numbers.size() ; i++)
            System.out.print(numbers.get(i));
        System.out.println();
    }
    
    public ArrayList<Integer> getNumbers() {
        return numbers;
    }
    
    public void showSorted() {
        System.out.println("Sorted array");
        for(int i=0 ; i<sorted.size() ; i++) {
            System.out.print(sorted.get(i)+" ");
        }
        System.out.println();
    }
    
    public void setSorted(ArrayList<Integer> arr) {
        sorted = arr;
    }
    
    public ArrayList<Integer> getSorted() {
        return sorted;
    }
}
