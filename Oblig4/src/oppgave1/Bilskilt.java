package oppgave1;

import java.util.HashSet;
import java.util.Set;

public class Bilskilt {
    //

    private static final Set<String> BILSKILT = Set.of("EL65431, TA14374, ZX87181, EL47007, VV50000, UV14544, EL32944");
    private static HashSet<String> hasj = HashSet.newHashSet(10);

    public static void main(String[] args) {
        hasj.add(BILSKILT.stream().toString());
    }



}


