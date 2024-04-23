package Uke15oppgave2.src.no.hvl.dat102;

import java.util.Iterator;

public interface SoektreADT <T extends Comparable<? super T>> {
	
	/** Søker etter et gitt element i treet.
	 * 
	 * @param element elementet vi søker etter.
	 * @return true om elementet finst, false elles.
	 */
	boolean inneholder(T element);

	/** Henter et element i treet.
	 * 
	 * @param element elementet vi leiter etter.
	 * @return elementet dersom det finst, elles null.
	 */
	T finn(T element);

	/**
	 * Legg eit element til treet dersom det ikkje finst frå før. Det betyr
	 * at a.compareTo(b) != 0. Elles blir det gamle elementet erstatta med det nye.
	 * 
	 * @param nyElement elementet som skal leggast til
	 * @return null om elementet ikkje finst frå før. Elles det element som
	 * var i treet frå før.
	 */
	T leggTil(T nyElement);

	/** Fjernar eit element frå treet.
	 * 
	 * @param element elementet som skal fjernast.
	 * @return elementet som vart fjerna eller null om det ikkje finst.
	 */
	T fjern(T element);
	
	/** Lagar ein iterator som går gjennom alle element i treet i inorden.
	 *  
	 * @return ein iterator som elementa i sortert rekkefølge.
	 */
	Iterator<T> getInordenIterator();
}
