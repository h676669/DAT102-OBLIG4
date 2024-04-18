package uke16_oppgave1;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        Integer[] allah = {8,5,4,2,22,67,5,4,1};
        InsertionSort<Integer> k = new InsertionSort<>();
        List<Integer> toilet= k.finMin(allah,4);

        System.out.println(toilet);
    }


}
