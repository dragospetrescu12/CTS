package testare.dubluri;

import clase.persoana.IPersoana;

public class PersoanaFake implements IPersoana {

    private int valoareGetVarsta;
    private String valoareGetSex;
    private boolean valoareCheckCnp;

    public void setValoareGetVarsta(int valoareGetVarsta) {
        this.valoareGetVarsta = valoareGetVarsta;
    }

    public void setValoareGetSex(String valoareGetSex) {
        this.valoareGetSex = valoareGetSex;
    }

    public void setValoareCheckCnp(boolean valoareCheckCnp) {
        this.valoareCheckCnp = valoareCheckCnp;
    }

    @Override
    public String getSex() {
        return valoareGetSex;
    }

    @Override
    public int getVarsta() {
        return valoareGetVarsta;
    }

    @Override
    public boolean checkCNP() {
        return valoareCheckCnp;
    }
}
