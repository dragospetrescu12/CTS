package testare.dubluri;

import clase.agentie.IPachetTuristic;
import clase.persoana.IPersoana;

public class PachetDummy implements IPachetTuristic {

    @Override
    public boolean poateRezerva() {
        return false;
    }

    @Override
    public Double getPret() {
        return null;
    }

    @Override
    public void aplicaDiscountVarstnici(int procent) {

    }

}
