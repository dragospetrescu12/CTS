package clase;

public class Autobuz extends Handler {

    public Autobuz(int prag) {
        super(prag);
        nextHandler = null;
    }

    @Override
    public void afiseazaCuCeSaMearga(int distanta) {
        if(distanta < prag) {
            System.out.println("Te poti deplasa cu autobuzul.");
        } else {
            nextHandler.afiseazaCuCeSaMearga(distanta); //trimitem mai departe request-ul
        }
    }
}
