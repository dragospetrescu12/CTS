package facade;

public class Autobuz {

    private static Autobuz autobuz = null;

    public void deschideUsaFata() {
        System.out.println("Usa din fata deschisa");
    }

    public void deschideUsaMijloc() {
        System.out.println("Usa din mijloc deschisa");
    }

    public void deschideUsaSpate() {
        System.out.println("Usa din spate deschisa");
    }

    public void puneLiberUsaMijloc() {
        System.out.println("Usa din mijloc pusa pe liber");
    }

    public void puneLiberUsaSpate() {
        System.out.println("Usa din spate pusa pe liber");
    }

    public void puneLiberUsaFata() {
        System.out.println("Usa din fata pusa pe liber");
    }

    private Autobuz() {
    }

    public static Autobuz getInstance() {
        if (autobuz != null) {
            return autobuz;
        } else {
            autobuz = new Autobuz();
            return autobuz;
        }
    }
}
