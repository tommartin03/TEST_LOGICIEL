public class Maximum {
    int taille;

    public Maximum() {
        this.taille = 10;
    }

    public Maximum(int taille) {
        this.taille = taille;
    }

    public int maximumAleatoire() throws ExceptionPasDeNombrePaire{
        // qui retourne le plus grand entier pair d’un tableau construit avec des valeurs al´eatoires et
        //dont la taille est celle de l’objet appelant.
        int[] tab = new int[taille];
        int max = 0;
        for (int i = 0; i < tab.length; i++) {
            tab[i] = (int) (Math.random() * 100);
            if (tab[i] % 2 == 0 && tab[i] > max) {
                max = tab[i];
            }
        }
        if (max == 0) {
            throw new ExceptionPasDeNombrePaire("Pas de nombre pair dans le tableau");
        }
        return max;
    }

    public int maximum(){
        //qui retourne le plus grand entier pair d’un tableau de taille valant celle de l’objet appelant,
        //et dont les ´el´ements ont pour valeur leur indice.
        int[] tab = new int[taille];
        int max = 0;
        for (int i = 0; i < tab.length; i++) {
            tab[i] = i;
            if (tab[i] % 2 == 0 && tab[i] > max) {
                max = tab[i];
            }
        }
        return max;
    }

    public int maximumImpairs() throws ExceptionPasDeNombrePaire{
        //qui retourne le plus grand entier pair d’un tableau de taille valant celle de l’objet appelant,
        //et dont tout ´el´ement vaut soit son indice dans le tableau si celui-ci est impair soit son indice
        //dans le tableau +1 sinon
        int[] tab = new int[taille];
        int max = 0;
        for (int i = 0; i < tab.length; i++) {
            if (i % 2 == 0) {
                tab[i] = i + 1;
                if (tab[i] % 2 == 0 && tab[i] > max) {
                    max = tab[i];
                }
            } else {
                tab[i] = i;
                if (tab[i] % 2 == 0 && tab[i] > max) {
                    max = tab[i];
                }
            }
        }
        if (max == 0) {
            throw new ExceptionPasDeNombrePaire("Pas de nombre pair dans le tableau");
        }
        return max;
    }
}
