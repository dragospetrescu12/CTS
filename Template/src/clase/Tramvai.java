package clase;

public class Tramvai extends MijlocTransportPeSine {

    // le facem protected ca sa nu putem sa apelam din main, gen sa nu putem sa apelam oprirea in statia 2 fara sa intre in statia 1
    @Override
    protected void opresteInStatia1() {
        System.out.println("Oprire in statia 1");
    }

    @Override
    protected void opresteInStatia2() {
        System.out.println("Oprire in statia 2");

    }

    @Override
    protected void opresteInStatia3() {
        System.out.println("Oprire in statia 3");

    }
}
