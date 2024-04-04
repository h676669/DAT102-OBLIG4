package oppgave1;

public class Main {
    private static String[] skiltListe = {
            "EL65431", "TA14374", "ZX87181",
            "EL47007", "VV50000", "UV14544",
            "EL32944"};
    public static void main(String[] args) {
        /*
        Bilskilt bilskilt = new Bilskilt();
        for (String ord : skiltListe){
            bilskilt.leggTil(ord);
        }
        bilskilt.skrivUt();
        */
        BilskiltLinked bilskiltLinked = new BilskiltLinked();
        for (String ord : skiltListe) {
            bilskiltLinked.leggTil(ord);
        }
        bilskiltLinked.skrivUt();

    }
}