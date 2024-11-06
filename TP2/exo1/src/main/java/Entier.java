public class Entier {

    int valeur;

    public Entier(int valeur) {
        this.valeur = valeur;
    }

    public int triple() {
        return valeur * 3;
    }

    public Entier entierTriple() {
        return new Entier(valeur * 3);
    }

    public boolean equals(Object o) {
        if (o == null) {
            return false;
        }
        if (o instanceof Entier) {
            Entier e = (Entier) o;
            return valeur == e.valeur;
        }
        return false;
    }

    public int getValeur() {
        return valeur;
    }

}
