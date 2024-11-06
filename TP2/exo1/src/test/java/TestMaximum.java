import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestMaximum {

    @Test
    public void testMaximumAleatoire() throws ExceptionPasDeNombrePaire {
        Maximum maximum = new Maximum(5);
        int res = maximum.maximumAleatoire();
        System.out.println("Le resultat de maximumAleatoire() est : " + res);
        assertTrue(res % 2 == 0);
    }

    @Test
    public void testMaximum() {
        Maximum maximum = new Maximum(5);
        int res = maximum.maximum();
        System.out.println("Le resultat de maximum() est : " + res);
        if (res % 2 == 0) {
            assertEquals(maximum.taille - 1, res);
        } else {
            assertEquals(maximum.taille , res);
        }

    }

    @Test
    public void testMaximumImpairs() throws ExceptionPasDeNombrePaire {
        ExceptionPasDeNombrePaire exception = assertThrows(ExceptionPasDeNombrePaire.class, () -> {
            Maximum maximum = new Maximum(5);
            int res = maximum.maximumImpairs();
            System.out.println("Le resultat de maximumImpairs() est : " + res);
        });
        assertEquals("Pas de nombre pair dans le tableau", exception.getMessage());
    }
}
