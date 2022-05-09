package clase;

public class LaReparat implements Stare {
    @Override
    public void doAction(Autobuz autobuz) {
        if(autobuz.getState() instanceof LaCapatDeLinie) {
            System.out.println("Autobuzul cu nr. " + autobuz.getNrAutobuz() + " intra in service.");
            autobuz.setState(this);
        } else {
            System.out.println("Autobuzul cu nr. " + autobuz.getNrAutobuz() + " nu poate intra acum in service, trebuie sa ajunga prima data la capat de linie.");
        }
    }
}
