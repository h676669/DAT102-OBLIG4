package uke16_oppgave1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HeapSort <T extends Comparable<? super T>> {


    private static <T extends Comparable<? super T>> void minHeapify(T[] heap, int rootIndex, int heapSize) {
        int smallest = rootIndex;
        int leftChildIndex = 2 * rootIndex + 1;
        int rightChildIndex = 2 * rootIndex + 2;

        if (leftChildIndex < heapSize && heap[leftChildIndex].compareTo(heap[smallest]) < 0)
            smallest = leftChildIndex;

        if (rightChildIndex < heapSize && heap[rightChildIndex].compareTo(heap[smallest]) < 0)
            smallest = rightChildIndex;

        if (smallest != rootIndex) {
            swap(heap, rootIndex, smallest);
            minHeapify(heap, smallest, heapSize);
        }
    }

    public static <T extends Comparable<? super T>> void MinHeap(T[] array) {
        int heapSize = array.length;
        for (int i = (heapSize / 2) - 1; i >= 0; i--) {
            minHeapify(array, i, heapSize);
        }
    }

    private static <T extends Comparable<? super T>> void swap(T[] array, int i, int j) {
        T temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public List<T> finMin(T[] array, int k) {
        MinHeap(array);
        List<T> result = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            result.add(array[0]);
            array[0] = array[array.length - i - 1];
            minHeapify(array, 0, array.length - i - 1);
        }
        return result;
    }
}

