package clase;

public class Autobuz implements MijlocTransport {

    private String nrAutobuz;
    private int nrCalatori;

    public Autobuz(String nrAutobuz, int nrCalatori) {
        this.nrAutobuz = nrAutobuz;
        this.nrCalatori = nrCalatori;
    }

    public String getNrAutobuz() {
        return nrAutobuz;
    }

    public int getNrCalatori() {
        return nrCalatori;
    }

    @Override
    public void opresteInStatie() {
        System.out.println("Autobuzul " + nrAutobuz + " a oprit in statie cu " + nrCalatori + " calatori.");
    }
}
