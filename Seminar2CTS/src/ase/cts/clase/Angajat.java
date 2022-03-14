package ase.cts.clase;

public class Angajat extends Aplicant {
    private String ocupatie;
    private int salariu;

    public void setOcupatie(String ocupatie) {
        this.ocupatie = ocupatie;
    }

    public void setSalariu(int salariu) {
        this.salariu = salariu;
    }

    public Angajat() {
        super();
    }

    @Override
    public String toString() {
        return "Angajat: " + super.toString() + "Ocupatie=" + ocupatie + ", salariu=" + salariu;
    }

}
