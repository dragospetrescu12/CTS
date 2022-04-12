package clase;

public class Linie {

    private int nrLinie;
    private String primaStatie;
    private String ultimaStatie;

    public Linie(int nrLinie, String primaStatie, String ultimaStatie) {
        this.nrLinie = nrLinie;
        this.primaStatie = primaStatie;
        this.ultimaStatie = ultimaStatie;
    }

    public int getNrLinie() {
        return nrLinie;
    }

    public void setNrLinie(int nrLinie) {
        this.nrLinie = nrLinie;
    }

    public String getPrimaStatie() {
        return primaStatie;
    }

    public void setPrimaStatie(String primaStatie) {
        this.primaStatie = primaStatie;
    }

    public String getUltimaStatie() {
        return ultimaStatie;
    }

    public void setUltimaStatie(String ultimaStatie) {
        this.ultimaStatie = ultimaStatie;
    }

    @Override
    public String toString() {
        return "Linie{" +
                "nrLinie=" + nrLinie +
                ", primaStatie='" + primaStatie + '\'' +
                ", ultimaStatie='" + ultimaStatie + '\'' +
                '}';
    }
}
