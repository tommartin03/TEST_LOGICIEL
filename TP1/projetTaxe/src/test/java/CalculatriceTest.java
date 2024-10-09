import org.junit.jupiter.api.Assertions;
import static org.testng.AssertJUnit.assertEquals;
import org.junit.jupiter.api.Test;

class CalculatriceTest {
    @Test
    void testConstructeur() {
        Calculatrice calc = new Calculatrice(4, 5);
        String resultatAttendu = "x = 4; y = 5";
        String resultatEffectif =calc.toString();
        System.out.println("Le resultat est " + resultatEffectif);
        assertEquals(resultatAttendu, resultatEffectif, "x = 4; y = 5");
    }

    @Test
    void testAjouter() {
        Calculatrice calc = new Calculatrice(4, 5);
        int resultatAttendu = 9;
        int resultatEffectif =calc.ajouter();
        System.out.println("Le resultat est " + resultatEffectif);
        assertEquals(resultatAttendu, resultatEffectif, '9');
    }
}