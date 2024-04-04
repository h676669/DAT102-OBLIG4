package oppgave1;

import java.util.LinkedList;

public class LinkedHash {

    private LinkedList<String> linkedList;
    
    public LinkedHash() {
        linkedList = new LinkedList<String>();

    }

    public void leggTil(String ord){
        linkedList.add(ord);
    }

    public void skrivUt(){
        for (String ord : linkedList){
            System.out.println(ord);
        }
    }
}
