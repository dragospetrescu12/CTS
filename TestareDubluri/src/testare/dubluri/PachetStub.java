package testare.dubluri;

import clase.agentie.IPachetTuristic;

public class PachetStub implements IPachetTuristic {

    @Override
    public boolean poateRezerva() {
        return false;
    }

    @Override
    public Double getPret() {
        return 100.0;
    }

    @Override
    public void aplicaDiscountVarstnici(int procent) {

    }
}
