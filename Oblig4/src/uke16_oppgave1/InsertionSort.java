package uke16_oppgave1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InsertionSort<T extends Comparable<? super T>> {

    public static void main(String[] args) {


    }

    public List<T> finMin(T[] array, int n) {
        insertionSort(array, n);
        return new ArrayList<>(Arrays.asList(array).subList(0, n));
    }

    public void insertionSort(T[] array, int n) {
        for (int i = 1; i < n; i++) {
            int j = i;
            while (j >= 1 && array[j - 1].compareTo(array[j]) > 0) {
                T temp = array[j];
                array[j] = array[j - 1];
                array[j - 1] = temp;
                j--;
            }
        }
        for (int i = n + 1; i < array.length; i++) {
            if (array[i].compareTo(array[n]) < 0) {
                T temp = array[i];
                array[i] = array[n];
                array[n] = temp;
                int j = n;
                while (j >= 1 && array[j - 1].compareTo(array[j]) > 0) {
                    temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                    j--;
                }
            }
        }
    }

}
