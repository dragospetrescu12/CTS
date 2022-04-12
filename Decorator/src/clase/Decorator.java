package clase;

public class Decorator extends DecoratorAbstract {

    private String mesaj;

    public Decorator(Iimprimanta iimprimanta, String mesaj) {
        super(iimprimanta);
        this.mesaj = mesaj;
    }

    @Override
    public void printeazaVerso() {
        System.out.println("Verso: " + mesaj);
    }
}
