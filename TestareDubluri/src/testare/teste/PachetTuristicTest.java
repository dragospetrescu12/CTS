package testare.teste;

import clase.agentie.PachetTuristic;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import testare.categorii.TesteAplicaDiscount;
import testare.categorii.TesteBoundary;
import testare.categorii.TesteCuFake;
import testare.categorii.TestePoateRezerva;
import testare.dubluri.PersoanaFake;

import static org.junit.Assert.*;

public class PachetTuristicTest {

    @Test
    @Category({TestePoateRezerva.class, TesteCuFake.class})
    public void testPoateRezerva() {
        PersoanaFake persoanaFake = new PersoanaFake();
        persoanaFake.setValoareGetVarsta(21);

        PachetTuristic pachetTuristic = new PachetTuristic(persoanaFake, "Bucuresti", 100.0);

        assertTrue(pachetTuristic.poateRezerva());
    }

    @Test
    @Category({TesteCuFake.class, TestePoateRezerva.class})
    public void testNuPoateRezerva() {
        PersoanaFake persoanaFake = new PersoanaFake();
        persoanaFake.setValoareGetVarsta(15);

        PachetTuristic pachetTuristic = new PachetTuristic(persoanaFake, "Bucuresti", 100.0);

        assertFalse(pachetTuristic.poateRezerva());
    }

    @Test
    @Category({TestePoateRezerva.class, TesteCuFake.class, TesteBoundary.class})
    public void testPoateRezervaBoundary(){
        PersoanaFake persoanaFake = new PersoanaFake();
        persoanaFake.setValoareGetVarsta(18);
        PachetTuristic pachetTuristic = new PachetTuristic(persoanaFake, "Bucuresti", 100.0);
        assertTrue(pachetTuristic.poateRezerva());
    }

    @Test
    @Category({TesteCuFake.class, TesteAplicaDiscount.class})
    public void testRightAplicaDiscount() {
        PersoanaFake persoanaFake = new PersoanaFake();
        persoanaFake.setValoareGetVarsta(70);
        PachetTuristic pachetTuristic = new PachetTuristic(persoanaFake, "Caciulata", 500.0);
        pachetTuristic.aplicaDiscountVarstnici(50);

        assertEquals(250, pachetTuristic.getPret(), 0.01);
    }


    @Test
    @Category({TesteCuFake.class, TesteAplicaDiscount.class})
    public void testRightAplicaDiscountTanar() {
        PersoanaFake persoanaFake = new PersoanaFake();
        persoanaFake.setValoareGetVarsta(21);
        PachetTuristic pachetTuristic = new PachetTuristic(persoanaFake, "Caciulata", 500.0);
        pachetTuristic.aplicaDiscountVarstnici(50);

        assertEquals(500.0, pachetTuristic.getPret(), 0.01);
    }


}
