package clase;

import java.util.ArrayList;
import java.util.List;

public abstract class MijlocTransport {
    protected List<ICalator> calatori; //s o accesam direct, sa nu mai dam prin getter

    public MijlocTransport() {
        calatori = new ArrayList<>();
    }

    public void adaugaCalator(ICalator calator) {
        calatori.add(calator);
    }

    public void eliminaCalator(ICalator calator) {
        calatori.remove(calator);
    }

    public abstract void anuntaCalatori();
}
