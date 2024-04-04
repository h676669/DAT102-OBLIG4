package oppgave1;

import java.util.Hashtable;
import java.util.LinkedList;
import java.util.Set;

public class Bilskilt {
    //

    private static Hashtable<Integer, String> bilHasj = new Hashtable<>();
    private static String[] bilSkilt = {"EL65431", "TA14374", "ZX87181", "EL47007", "VV50000", "UV14544", "EL32944"};
    public static void main(String[] args) {
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
            if (bilHasj.get(i) != null) {
                System.out.println(bilHasj.get(i));
            }
        }
    }
    public static int hash(String string) {
        return Integer.parseInt(String.valueOf(string.charAt(string.length() - 1))) ;
    }
}


