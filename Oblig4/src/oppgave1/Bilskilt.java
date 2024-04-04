package oppgave1;

import java.util.Hashtable;
import java.util.LinkedList;

public class Bilskilt {

    private static String[] bilSkilt = {"EL65431", "TA14374", "ZX87181", "EL47007", "VV50000", "UV14544", "EL32944"};
    public static void main(String[] args) {
        openAdrLinProbe();
        kjedetListe();
        //f();
    }


    // load factor 0.7
    private static void openAdrLinProbe() {
        System.out.println("Open adressering med linear probing, steglengde alltid 1");
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
        System.out.println();
    }

    // load factor 0.4
    private static void kjedetListe() {
        System.out.println("Kjeda lister – tabell med 10 posisjonar");
        Hashtable<Integer, LinkedList<String>> bilLink = new Hashtable<>(10);
        for (String s : bilSkilt) {
            int indx = hash(s);
            if (bilLink.get(indx) == null) {
                bilLink.put(indx, new LinkedList<>());
                bilLink.get(indx).add(s);
            }
            else {
                bilLink.get(indx).add(s);
            }
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(bilLink.get(i));
        }
        System.out.println();
    }

    private static void f() {
        System.out.println("press f to pay respect");
        Hashtable<Integer, String> bilHasj = new Hashtable<>(20);
        for (String s : bilSkilt) {
            int indx = nyHash(s);
            if (bilHasj.get(indx) == null) {
                bilHasj.put(indx, s);
            } else {
                while (bilHasj.get(indx + 1) != null) {
                    indx++;
                }
                bilHasj.put(indx + 1, s);
            }
        }
        for (int i = 0; i < 20; i++) {
            System.out.println(bilHasj.get(i));
        }
        System.out.println();
    }


    private static int hash(String string) {
        return Integer.parseInt(String.valueOf(string.charAt(string.length() - 1))) ;
    }

    // ?????????
    private static int nyHash(String string) {
        int hash = 0;
        int n = string.length();
        for (int i = 0; i < n; i++) {
            hash = 31 * hash + string.charAt(i);
        }

        return hash;
    }
}


