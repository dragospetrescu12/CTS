package clase;

public class InCursa implements Stare {
    @Override
    public void doAction(Autobuz autobuz) {
        if(autobuz.getState() instanceof LaCapatDeLinie) {
            System.out.println("Autobuzul cu nr. " + autobuz.getNrAutobuz() + " pleaca in cursa.");
        } else {
            System.out.println("Autobuzul cu nr. " + autobuz.getNrAutobuz() + " nu poate pleca in cursa");
        }
    }
}
