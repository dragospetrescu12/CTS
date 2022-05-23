package teste;

import clase.Persoana;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TestGetVarsta {

    @Test
    public void testVarsta() {
        Persoana persoana = new Persoana("Ion", "6001112350021");
        assertEquals(21, persoana.getVarsta());

    }

    @Test
    public void testBounderyVarstaInferioara() {
        Persoana persoana = new Persoana("Ion", "30001012123456");
        assertEquals(222, persoana.getVarsta());

    }

    @Test
    public void testBounderySuperior() {
        Persoana persoana = new Persoana("Ana", "62201012123456");
        assertEquals(0, persoana.getVarsta());

    }

    @Test(expected = CnpIncorect.class)
    public void testErrorVarsta() {
        Persoana persoana = new Persoana("Anamaria", "62301012123456");
        persoana.getVarsta();
    }

    @Test(timeout = 200)
    public void testPerformanceVarsta() {
        Persoana persoana = new Persoana("Anamaria", "62010012123456");
        persoana.getVarsta();
    }

    @Test
    public void testOrder() {
        Persoana persoana1 =  new Persoana("Ana", "6001012123456");
        Persoana persoana2 = new Persoana("Andrei", "1991012123456");

        assertTrue(persoana1.getVarsta() < persoana2.getVarsta());
    }

    @Test(expected = NullPointerException.class)
    public void testExistence() {
        Persoana persoana = new Persoana("Ana", null);
        persoana.getVarsta();
    }

}
