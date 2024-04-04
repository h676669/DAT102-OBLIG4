package oppgave1;

import java.util.LinkedList;

public class Bilskilt {

    private String[] HashListe;

    public Bilskilt() {
        HashListe = new String[10];
    }

    private char HashFunksjon(String ord) {
        int pos = reknePos(ord);

        if (HashListe[pos] == null) {
            HashListe[pos] = ord;
            return ord.charAt(ord.length() - 1);
        } else {
            HashFunksjon(ord, pos + 1);
        }
        return '-';
    }

    private int reknePos(String ord) {
        return Character.getNumericValue(ord.charAt(ord.length() - 1));
    }

    private void HashFunksjon(String ord, int pos) {
        if (HashListe[pos] == null) {
            HashListe[pos] = ord;
        } else {
            HashFunksjon(ord, pos + 1);
        }
    }

    public void leggTil(String ord) {
        HashFunksjon(ord);
    }

    public void skrivUt() {
        for (String ord : HashListe) {
            System.out.println(ord);
        }
    }
}