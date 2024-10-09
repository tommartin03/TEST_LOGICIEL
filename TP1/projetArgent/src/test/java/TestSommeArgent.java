import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.Assert.*;

public class TestSommeArgent {

    public SommeArgent obj1;
    public SommeArgent obj2;
    public static int nbPasseDansAfter =0;
    public static int nbPasseDansInit = 0;


    @BeforeEach
    public void mesInitialisations(){
         obj1 = new SommeArgent(15, "EUR");
         obj2 = new SommeArgent(60, "EUR");
        System.out.println(++nbPasseDansInit +"ime passage avant exécution" + "d'une méthode de test");
    }

    @AfterEach
    public void apresExecMethTest(){
        System.out.println(++nbPasseDansAfter +"ime passage apres exécution" + "d'une méthode de test");
    }


    @Test
    public void testAdd(){
        mesInitialisations();
        SommeArgent excepted = new SommeArgent(75,"EUR");
        SommeArgent result = obj1.add(obj2);
        Assertions.assertTrue(excepted.equals(result));
    }

    @Test
    public void testEquivalence(){
        SommeArgent obj3 = new SommeArgent(5, "USD");
        Assertions.assertTrue(!obj3.equals(obj1));
    }
}
