package clase;

import java.util.ArrayList;
import java.util.List;

public class ManagerAutobuz {

    private List<MementoAutobuz> listaMemento;

    public ManagerAutobuz() {
        this.listaMemento = new ArrayList<>();
    }

    public MementoAutobuz getMementoAutobuz(int index){
        return listaMemento.get(index);
    }

    public void adaugareMemento(MementoAutobuz mementoAutobuz) {
        listaMemento.add(mementoAutobuz);
    }
}
