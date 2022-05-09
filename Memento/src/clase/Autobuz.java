package clase;

public class Autobuz {

    private String model;
    private String numeSofer;
    private float consumMediu;
    private int anFabricatie;

    public Autobuz(String model, String numeSofer, float consumMediu, int anFabricatie) {
        this.model = model;
        this.numeSofer = numeSofer;
        this.consumMediu = consumMediu;
        this.anFabricatie = anFabricatie;
    }

    public MementoAutobuz creareMemento() {
        return new MementoAutobuz(this.numeSofer, this.consumMediu);
    }

    public void revenireStareAnterioara(MementoAutobuz mementoAutobuz) {
        this.consumMediu = mementoAutobuz.getConsumMediu();
        this.numeSofer = mementoAutobuz.getNumeSofer();
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setNumeSofer(String numeSofer) {
        this.numeSofer = numeSofer;
    }

    public void setConsumMediu(float consumMediu) {
        this.consumMediu = consumMediu;
    }

    public void setAnFabricatie(int anFabricatie) {
        this.anFabricatie = anFabricatie;
    }

    @Override
    public String toString() {
        return "Autobuz{" +
                "model='" + model + '\'' +
                ", numeSofer='" + numeSofer + '\'' +
                ", consumMediu=" + consumMediu +
                ", anFabricatie=" + anFabricatie +
                '}';
    }
}
