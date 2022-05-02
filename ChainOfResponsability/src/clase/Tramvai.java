package clase;

public class Tramvai extends Handler {

    public Tramvai(int prag) {
        super(prag);
        nextHandler = null;
    }

    @Override
    public void afiseazaCuCeSaMearga(int distanta) {
        if(distanta < prag) {
            System.out.println("Te poti deplasa cu tramvaiul.");
        } else {
            nextHandler.afiseazaCuCeSaMearga(distanta);
        }
    }
}
