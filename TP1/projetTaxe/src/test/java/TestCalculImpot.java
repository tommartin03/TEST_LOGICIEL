import org.testng.annotations.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Assertions;


import static org.junit.jupiter.api.Assertions.assertThrows;

public class TestCalculImpot {
    @Timeout(value=10)
    @Test
    public void testCalcul20000() throws ExceptionRevenuNegatif {
        CalculImpot calcul = new CalculImpot();
        Double res = calcul.calculerImpot(20000.0);
        System.out.println("Le resultat est " + res);
        Assertions.assertEquals(2000.0,res);
    }

    @Timeout(value=10)
    @Test
    public void testCalcul10000() throws ExceptionRevenuNegatif {
        CalculImpot calcul = new CalculImpot();
        Double res = calcul.calculerImpot(10000.0);
        System.out.println("Le resultat est " + res);
        Assertions.assertEquals(1000.0,res);
    }

    @Timeout(value=10)
    @Test
    public void testCalcul1999() throws ExceptionRevenuNegatif {
        CalculImpot calcul = new CalculImpot();
        Double res = calcul.calculerImpot(19999.0);
        System.out.println("Le resultat est " + res);
        Assertions.assertEquals(1999.9,res);
    }

    @Timeout(value=10)
    @Test
    public void testCalcul20001() throws ExceptionRevenuNegatif {
        CalculImpot calcul = new CalculImpot();
        Double res = calcul.calculerImpot(20001.0);
        System.out.println("Le resultat est " + res);
        Assertions.assertEquals(2000.20,res);
    }

    @Timeout(value=10)
    @Test
    public void testCalcul200000() throws ExceptionRevenuNegatif {
        CalculImpot calcul = new CalculImpot();
        Double res = calcul.calculerImpot(200000.0);
        System.out.println("Le resultat est " + res);
        Assertions.assertEquals(48000.0,res);
    }

    @Timeout(value=10)
    @Test
    public void testCalculnegatif(){
        ExceptionRevenuNegatif exc = assertThrows(ExceptionRevenuNegatif.class,()-> {
            CalculImpot calcul = new CalculImpot();
            Double res = calcul.calculerImpot(-1000.0);
            System.out.println("Le resultat est " + res);
        });
        Assertions.assertEquals("revenu négatif",exc.getMessage());
    }
}
