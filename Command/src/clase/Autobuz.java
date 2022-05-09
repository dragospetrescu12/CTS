package clase;

public class Autobuz {
    private String model;

    public Autobuz(String model) {
        this.model = model;
    }

    public void pleacaInCursa(int linie) {
        System.out.println("Autobuzul " + model + " pleaca in cursa pe linia " + linie);
    }

}
