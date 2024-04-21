package uke16_oppgave1;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

public class Test1 {

    Integer[] testTab = {15, 8, 1, 9, 11, 5, 10, 12};

    @BeforeEach
    void setUp() {
        testTab = new Integer[]{15, 8, 1, 9, 11, 5, 10, 12};
        System.out.println();
    }

    @Test
    void testInsertion() {
        System.out.println("InsertionSort");
        InsertionSort<Integer> insertionSort = new InsertionSort<>();
        List<Integer> list = insertionSort.finMin(testTab, 3);
        System.out.println(list);
        for (Integer i : testTab) {
            System.out.print(i + ", ");
        }
    }

    @Test
    void testSelection() {
        System.out.println("SelectionSort");
        SelectionSort<Integer> selectionSort = new SelectionSort<>();
        System.out.println(selectionSort.finMin(testTab, 3));
        for (Integer i : testTab) {
            System.out.print(i + ", ");
        }
        System.out.println();
    }


}
