/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author krystian
 */
public class Menu {
    
    public static void main(String args[]) {
//        InsertionSort is = new InsertionSort(50);
//        is.setSorted(is.sort(is.getNumbers()));
//        is.showNumbers();
//        is.showSorted();
//        System.out.println("Inversions "+is.getInv()+" Comparisons "+is.getComparsions());
        MergeSort ms = new MergeSort(50);
        ms.setSorted(ms.sort(ms.getNumbers()));
        ms.showNumbers();
        ms.showSorted();
    }
}
