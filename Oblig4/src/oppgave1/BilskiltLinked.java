package oppgave1;

import java.util.LinkedList;

public class BilskiltLinked {
    private LinkedHash[] HashListe = new LinkedHash[10];

    public BilskiltLinked(){
        HashListe = new LinkedHash[10];
    }

    private int HashFunksjon(String ord){
        int pos = reknePos(ord);
        HashListe[pos].leggTil(ord);
        return Integer.parseInt(Character.toString(ord.charAt(ord.length()-1)));
    }

    private int reknePos(String ord){
       return 1;
    }

    public void leggTil(String ord){
        HashFunksjon(ord);
    }

    public void skrivUt(){
        for (LinkedHash Ordliste : HashListe) {
            Ordliste.skrivUt();
        }

    }

}
