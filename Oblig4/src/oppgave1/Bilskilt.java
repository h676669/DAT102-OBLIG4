package oppgave1;

import java.util.Hashtable;
import java.util.LinkedList;

public class Bilskilt {

    private static String[] bilSkilt = {"EL65431", "TA14374", "ZX87181", "EL47007", "VV50000", "UV14544", "EL32944"};
    public static void main(String[] args) {
    }


    private static void openAdrLinProbe() {
        Hashtable<Integer, String> bilHasj = new Hashtable<>(10);
        for (String s : bilSkilt) {
            int indx = hash(s);
            if (bilHasj.get(indx) == null) {
                bilHasj.put(indx, s);
            } else {
                while (bilHasj.get(indx + 1) != null) {
                    indx++;
                }
                bilHasj.put(indx + 1, s);
            }
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(bilHasj.get(i));
        }
    }

    private static void kjedetListe() {
        Hashtable<Integer, LinkedList<String>> bilLink = new Hashtable<>();
        for (String s : bilSkilt) {
            int indx = hash(s);
            if (bilLink.get(indx) == null) {
                bilLink.put(indx, new LinkedList<>());
                bilLink.get(indx).add(s);
            }
            bilLink.get(indx).add(s);
        }
    }

    public static int hash(String string) {
        return Integer.parseInt(String.valueOf(string.charAt(string.length() - 1))) ;
    }
}


