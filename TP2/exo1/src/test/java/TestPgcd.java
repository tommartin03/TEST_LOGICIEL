import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestPgcd {

    @Test
    public void testPgcd() {
        pgcd pgcd = new pgcd();
        int res = pgcd.pgcd(70, 42);
        System.out.println("Le resultat de pgcd(70, 42) est : " + res);
        assertEquals(14, pgcd.pgcd(70, 42 ));
    }

    @Test
    public void testPgcdArg1Null() {
        pgcd pgcd = new pgcd();
        int res = pgcd.pgcd(0, 42);
        System.out.println("Le resultat de pgcd(0, 42) est : " + res);
        assertEquals(42, pgcd.pgcd(0, 42 ));
    }

    @Test
    public void testPgcdArg2Null() {
        pgcd pgcd = new pgcd();
        int res = pgcd.pgcd(70, 0);
        System.out.println("Le resultat de pgcd(70, 0) est : " + res);
        assertEquals(70, pgcd.pgcd(70, 0 ));
    }

    @Test
    public void testPgcdArg1Arg2Null() {
        pgcd pgcd = new pgcd();
        int res = pgcd.pgcd(0, 0);
        System.out.println("Le resultat de pgcd(0, 0) est : " + res);
        assertEquals(0, pgcd.pgcd(0, 0 ));
    }

    @Test
    public void testPgcdMultiple() {
        pgcd pgcd = new pgcd();
        int res = pgcd.pgcd(50, 10);
        System.out.println("Le resultat de pgcd(50, 10) est : " + res);
        assertEquals(10, pgcd.pgcd(50, 10 ));
    }

    @Test
    public void testPgcdArgPremier(){
        pgcd pgcd = new pgcd();
        int res = pgcd.pgcd(2, 3);
        System.out.println("Le resultat de pgcd(2, 3) est : " + res);
        assertEquals(1, pgcd.pgcd(2, 3 ));
    }



}
