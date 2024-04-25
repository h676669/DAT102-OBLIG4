package Uke15_oppgave_3;

public class BinaerTreNode<T>{
    private T element;
    private BinaerTreNode<T> venstre;
    private BinaerTreNode<T>  hogre;
    private int hogdeU;

    BinaerTreNode (T el) {
        element = el;
        venstre = null;
        hogre   = null;
        hogdeU = 1;
    }

    // Flere konstruktører og objektmetoder

    public T getElement() {
        return element;
    }

    public BinaerTreNode<T> getVenstre() {
        return venstre;
    }

    public void setVenstre(BinaerTreNode<T> venstre) {
        this.venstre = venstre;
    }

    public BinaerTreNode<T> getHogre() {
        return hogre;
    }

    public void setHogre(BinaerTreNode<T> hogre) {
        this.hogre = hogre;
    }

    public void setElement(T element) {
        this.element = element;
    }

    public boolean harVenstreBarn() {
        return venstre != null;
    }

    public boolean harHogreBarn() {
        return hogre != null;
    }

    public boolean erLoev() {
        return (venstre == null) && (hogre == null);
    }
    public int getHogdeU() {
        return hogdeU;
    }
    public void setHogdeU(int hogdeU) {
        this.hogdeU = hogdeU;
    }
    public boolean erBalansert() {
        int venstreHoyde;
        int hogreHoyde;

        if (venstre == null) {
            venstreHoyde = -1;
        } else {
            venstreHoyde = venstre.getHogdeU();
        }

        if (hogre == null) {
            hogreHoyde = -1;
        } else {
            hogreHoyde = hogre.getHogdeU();
        }

        int hoydeForskjell = Math.abs(venstreHoyde - hogreHoyde);

        return hoydeForskjell <= 1;
    }

}
