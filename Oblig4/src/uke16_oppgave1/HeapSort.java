package uke16_oppgave1;

public class HeapSort <T extends Comparable<? super T>> {

    private static <T extends Comparable<? super T>> void reheap(T[] heap,int rootIndex, int lastIndex) {
        boolean done = false;
        T orphan = heap[rootIndex];
        int leftChildIndex = 2* rootIndex + 1;

        while(!done &&(leftChildIndex <= lastIndex)) {
            int lagerChildIndex = leftChildIndex;
            int rightChildIndex = leftChildIndex +1;
            if((rightChildIndex <= lastIndex) && (heap[lagerChildIndex].compareTo(heap[rightChildIndex]) < 0)) {
                lagerChildIndex = rightChildIndex;
            }
            if(orphan.compareTo(heap[lagerChildIndex]) < 0) {
                heap[rootIndex] = heap[lagerChildIndex];
                rootIndex = lagerChildIndex;
                leftChildIndex = 2 * rootIndex + 1;
            }else {
                done = true;
            }
        }
        heap[rootIndex] = orphan;
    }
    public static <T extends Comparable<? super T>> void heapSort(T[] array, int n) {
        for (int rootIndex = n / 2 -1; rootIndex >= 0; rootIndex--) {
            reheap(array, rootIndex, n - 1);
            swap(array, 0, n - 1);
        }
        for (int lastIndex = n -2; lastIndex > 0; lastIndex--) {
            reheap(array,0,lastIndex);
            swap(array,0,lastIndex);
        }
    }

    private static <T extends Comparable<? super T>> void swap(T[] array, int i, int j) {
        T temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
