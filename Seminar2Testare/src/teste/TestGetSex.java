package teste;

import clase.Persoana;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestGetSex {

    //RIGHT BICEP & CORRECT

    @Test
    public void testRightSexM() {
        Persoana persoana = new Persoana("Ion", "3001112350021");
        assertEquals("M", persoana.getSex());

    }

    @Test
    public void testRightSexF() {
        Persoana persoana = new Persoana("Diana", "2001112350021");
        assertEquals("F", persoana.getSex());

    }

    @Test
    public void testBounderySexInferior() {
        Persoana persoana = new Persoana("Ion", "10001012123456");
        assertEquals("M", persoana.getSex());

    }

    @Test
    public void testBounderySexSuperior() {
        Persoana persoana = new Persoana("Anamaria", "60001012123456");
        assertEquals("F", persoana.getSex());

    }

    @Test
    public void testCrossCheckSex() {
        Persoana persoana = new Persoana("Anamaria", "50001012123456");
        int cifra = persoana.CNP.charAt(0);
        assertEquals(cifra%2 != 0?"M":"F", persoana.getSex());

    }

    @Test
    public void testCorectitudineSex() {
        Persoana persoana = new Persoana("Anamaria", "60001012123456");
        assertEquals("F", persoana.getSex());

    }

    @Test(expected = CnpIncorect.class)
    public void testErrorSex() {
        Persoana persoana = new Persoana("Anamaria", "00001012123456");
        persoana.getSex();
    }

    @Test(timeout = 100)
    public void testPerformanceSex() {
        Persoana persoana = new Persoana("Anamaria", "60001012123456");
        persoana.getSex();
    }


    // Aici incepe Correct

    @Test
    public void testFormatSex() {
        Persoana persoana = new Persoana("Anamaria", "60001012123456");
        assertEquals(1, persoana.getSex().length());
    }

    @Test(expected = NullPointerException.class)
    public void testExistenceSex() {
        Persoana persoana = new Persoana("Ana", null);
        persoana.getSex();
    }

}