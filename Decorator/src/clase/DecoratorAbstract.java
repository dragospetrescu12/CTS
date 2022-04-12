package clase;

public abstract class DecoratorAbstract implements Iimprimanta {
    private Iimprimanta iimprimanta;

    public DecoratorAbstract(Iimprimanta iimprimanta) {
        this.iimprimanta = iimprimanta;
    }

    @Override
    public void printeazaBilet() {
        iimprimanta.printeazaBilet();
    }

    public abstract void printeazaVerso();

}
