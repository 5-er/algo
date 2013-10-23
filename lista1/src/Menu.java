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
        int trial[] = {10, 50, 100, 500, 1000};
        InsertionSort is;
        MergeSort ms;
        HeapSort hs;
        QuickSort qs;
        DataFile isData, msData, hsData, qsData;
        Draw isPlot, msPlot, hsPlot, qsPlot;
        for (int i = 0; i < 5; i++) {
            isData = new DataFile("insertionSort" + trial[i]);
            msData = new DataFile("mergeSort" + trial[i]);
            hsData = new DataFile("heapSort" + trial[i]);
            qsData = new DataFile("quickSort" + trial[i]);
            for (int j = 0; j < 300; j++) {
                is = new InsertionSort(trial[i]);
                is.setSorted(is.sort(is.getNumbers()));
                isData.write(is.getInv(), is.getComparsions());
                ms = new MergeSort(trial[i]);
                ms.setSorted(ms.sort(ms.getNumbers()));
                msData.write(ms.getInv(), ms.getComparsions());
                hs = new HeapSort(trial[i]);
                hs.setSorted(hs.sort(hs.getNumbers()));
                hsData.write(hs.getInv(), hs.getComparsions());
                qs = new QuickSort(trial[i]);
                qs.setSorted(qs.sort(qs.getNumbers()));
                qsData.write(qs.getInv(), qs.getComparsions());
            }
            isData.closeStream();
            msData.closeStream();
            hsData.closeStream();
            qsData.closeStream();
            isPlot = new Draw(isData.getFileName());
            msPlot = new Draw(msData.getFileName());
            hsPlot = new Draw(hsData.getFileName());
            qsPlot = new Draw(qsData.getFileName());
        }
    }
}
