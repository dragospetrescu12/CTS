package teste;

import clase.Matematica;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MatematicaTest {

    private Matematica mate;

    @Before
    public void setUp() {
        mate = Matematica.getInstance();
    }

    @Test
    public void testSumaCorecta() {
        int rezultatObtinut = mate.suma(7,5);
        assertEquals(12, rezultatObtinut);
    }

    @Test
    public void testRaportCorect() {
        double rezultatObtinut = mate.raport(24,6);
        assertEquals(4, rezultatObtinut, 0.01);
    }

    @Test
    public void testRaport2() {
        double rezultatObtinut = mate.raport(24,11);
        assertEquals(2.18, rezultatObtinut, 0.005);
    }

    @Test
    public void testRaport3() {
        double rezultatObtinut = mate.raport(24,-2);
        assertEquals(-12, rezultatObtinut, 0.005);
    }

    @Test
    public void testRaportShouldThrowException() { //pt impartirea la 0 (JUnit 3)
        try {
            mate.raport(57, 0);
            fail("Nu trebuia sa ajunga aici");
        } catch (IllegalArgumentException ert) {

        }
    }

    @Test(expected = IllegalArgumentException.class) //asta e acelasi lucru ca si sus (JUnit 4)
    public void testRaportShouldThrowException2() {
        mate.raport(23,0);
    }

    @Test
    public void testParitate() {
        boolean rezultat = mate.estePar(5);
        assertFalse(rezultat);
        assertTrue(mate.estePar(4));
        assertTrue(mate.estePar(6));
        assertFalse(mate.estePar(9));
    }

    @Test
    public void testNumerePare() {
        assertEquals(4, mate.nNumerePare(4).size());
        assertEquals(2, mate.nNumerePare(2).size());
        assertEquals(5, mate.nNumerePare(5).size());
    }

    @Test
    public void testNumerePare2() { // tot testu pt metoda cu nNumerePare, dar pt 0
        assertNull(mate.nNumerePare(0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIllegalArgumentException() {
        mate.nNumerePare(-3);
    }

    @Test
    public void testSingleton() {
        assertSame(Matematica.getInstance(), Matematica.getInstance());
    }

    @Test
    public void testRaport() {
        assertEquals(1, mate.raport(5,5), 0.05);
    }

}