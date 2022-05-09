package clase;

public class LaCapatDeLinie implements Stare {
    @Override
    public void doAction(Autobuz autobuz) {
        if(!(autobuz.getState() instanceof LaCapatDeLinie)) {
            System.out.println("Autobuzul cu nr. " + autobuz.getNrAutobuz() + " este la capat de linie");
            autobuz.setState(this);
        } else {
            System.out.println("Autobuzul cu nr. " + autobuz.getNrAutobuz() + " nu poate sa fie la capat de linie." );
        }
    }
}
