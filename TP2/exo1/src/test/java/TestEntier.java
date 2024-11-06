
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.Assert.*;

public class TestEntier {

    Entier entier;

    @BeforeEach
    void init() {
        entier = new Entier(5);
    }

    @Test
    public void testTriple() {
        assertEquals(15, entier.triple());
    }

    @Test
    public void testEntierTriple() {
        Entier expected = new Entier(15);
        assertTrue(expected.equals(entier.entierTriple()));
    }

    @Test
    public void testEquals() {
        Entier entier2 = new Entier(5);
        Entier entier3 = new Entier(6);
        assertTrue(entier.equals(entier2));
        assertFalse(entier.equals(entier3));
    }



}
