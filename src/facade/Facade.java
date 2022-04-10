package facade;

public class Facade {

    public static Autobuz autobuz = Autobuz.getInstance();

    public static void deschideUsi() {
        autobuz.deschideUsaFata();
        autobuz.deschideUsaSpate();
        autobuz.deschideUsaMijloc();
    }

    public static void punePeLiberUsi() {
        autobuz.puneLiberUsaSpate();
        autobuz.puneLiberUsaFata();
        autobuz.puneLiberUsaMijloc();
    }
}
