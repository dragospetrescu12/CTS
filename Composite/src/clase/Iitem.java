package clase;

public interface Iitem {

    void adaugaItem(Iitem item) throws Exception;
    void stergeItem(Iitem item) throws Exception;
    void descriereItem();
    Iitem getItem(int pozitie) throws Exception;
    float calculeazaSumaGarantata(float pretPerLoc);

}
