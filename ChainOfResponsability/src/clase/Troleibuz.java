package clase;

public class Troleibuz extends Handler {

    public Troleibuz(int prag) {
        super(prag);
        nextHandler = null;
    }

    @Override
    public void afiseazaCuCeSaMearga(int distanta) {
        if(distanta < prag) {
            System.out.println("Te poti deplasa cu troleibuzul");
        } else {
            nextHandler.afiseazaCuCeSaMearga(distanta);
        }
    }
}
