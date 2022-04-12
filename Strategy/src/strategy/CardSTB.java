package strategy;

public class CardSTB implements ModPlata {

    @Override
    public void plateste(float pret) {
        System.out.println("A fost realizata plata prin card Stb in valoare de " + pret + "." );
    }
}
