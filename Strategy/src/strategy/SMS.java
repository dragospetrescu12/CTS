package strategy;

public class SMS implements ModPlata {

    @Override
    public void plateste(float pret) {
        System.out.println("A fost realizata plata prin sms in valoare de " + pret + "." );
    }
}
