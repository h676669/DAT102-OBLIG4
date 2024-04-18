package uke16_oppgave1;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InsertionSort<T extends Comparable<? super T>> {

    public List<T> finMin(T[] arr, int n) {
        aughSort(arr, n);
        return new ArrayList<>(Arrays.asList(arr).subList(0, n));
    }

    public void aughSort(T[] arr, int c) {
            for (int x = 0; x < arr.length; x++) {
                T key = arr[x];
                int j = x - 1;
                while (j >= 0 && key.compareTo(arr[j]) < 0) {
                    arr[j + 1] = arr[j];
                    j = j - 1;
                }
                arr[j + 1] = key;
            }
        }

}
