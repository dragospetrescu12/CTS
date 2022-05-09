package clase;

import java.util.ArrayList;
import java.util.List;

public class ManagerComenzi {
    List<Comanda> comenzi;

    public ManagerComenzi() {
        this.comenzi = new ArrayList<>();
    }

    public void invoca(Comanda comanda) {
        comenzi.add(comanda);
    };

    public void executa() {
        if(!(comenzi.isEmpty())) {
            comenzi.get(0).executa();
            comenzi.remove(0);
        }

    }
}
