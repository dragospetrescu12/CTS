package clase;

public class ImprimantaDeBilete implements Iimprimanta {

    private float pretBilet;

    public ImprimantaDeBilete(float pretBilet) {
        this.pretBilet = pretBilet;
    }

    @Override
    public void printeazaBilet() {
        System.out.println("Biletul are pretul: " + pretBilet + " lei.");
    }
}
