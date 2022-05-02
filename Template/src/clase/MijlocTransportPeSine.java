package clase;

public abstract class MijlocTransportPeSine {
    protected abstract void opresteInStatia1();
    protected abstract void opresteInStatia2();
    protected abstract void opresteInStatia3();

    public final void parcurgeTraseuInSensNormal() {
        opresteInStatia1();
        opresteInStatia2();
        opresteInStatia3();
    };

    public final void parcurgeTraseuInSensInvers() {
        opresteInStatia3();
        opresteInStatia2();
        opresteInStatia1();
    };
}
