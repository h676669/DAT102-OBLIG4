package uke16_oppgave1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SelectionSort<T extends Comparable<? super T>>{

    public List<T> finMin(T[] array, int n) {
        selectionSort(array, n);
        return new ArrayList<>(Arrays.asList(array).subList(0, n));
    }

    public static <T extends Comparable<? super T>> void selectionSort(T[] array, int n) {
        for (int i = 0; i < n; i++) {
            int min = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[min].compareTo(array[j]) > 0) {
                    min = j;
                }
            }
            T temp = array[min];
            array[min] = array[i];
            array[i] = temp;
        }
    }

}
