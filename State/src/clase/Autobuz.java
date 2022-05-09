package clase;

public class Autobuz {

    private int nrAutobuz;
    private Stare state;

    public Autobuz(int nrAutobuz) {
        this.nrAutobuz = nrAutobuz;
        this.state = new LaCapatDeLinie();
    }

    public int getNrAutobuz() {
        return nrAutobuz;
    }

    public Stare getState() {
        return state;
    }

    public void setNrAutobuz(int nrAutobuz) {
        this.nrAutobuz = nrAutobuz;
    }

    protected void setState(Stare state) {
        this.state = state;
    }

    public void pleacaInCursa() {
        new InCursa().doAction(this);
    }

    public void ajungeInCapatDeLinie() {
        new LaCapatDeLinie().doAction(this);
    }

    public void iesireDinService() {
        new LaCapatDeLinie().doAction(this);
    }

    public void trimiteLaReparat() {
        new LaReparat().doAction(this);
    }
}
