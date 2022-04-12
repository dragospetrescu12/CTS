package clase;

import java.util.ArrayList;
import java.util.List;

public class Flota implements Iitem{

    private String nume;
    private List<Iitem> items;

    public Flota(String nume) {
        this.nume = nume;
        this.items = new ArrayList<>();
    }

    @Override
    public void adaugaItem(Iitem item) throws Exception {
        items.add(item);
    }

    @Override
    public void stergeItem(Iitem item) throws Exception {
        items.remove(item);
    }

    @Override
    public void descriereItem() {
        System.out.println(nume); //afisam informatiile pentru nodul curent
        for(Iitem item : items) {
            item.descriereItem();
        }
    }

    @Override
    public Iitem getItem(int pozitie) throws Exception {
       return items.get(pozitie);
    }

    @Override
    public float calculeazaSumaGarantata(float pretPerLoc) {
        float suma = 0;
        for (Iitem item : items) {
            suma += item.calculeazaSumaGarantata(pretPerLoc);
        }
        return suma;
    }
}
