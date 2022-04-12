package flyweightfactory;

import clase.Linie;

import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {

    Map<Integer, Linie> linieMap;

    public FlyweightFactory() {
        linieMap = new HashMap<>(); //alocam spatiu pentru map-ul de sus, nu dam ca parametru in constructor
    }

    public Linie getLinie(int nrLinie) {
        Linie linieDeReturnat =  linieMap.get(nrLinie);
        if(linieDeReturnat != null) {
            return linieDeReturnat;
        } else {
            // statiile pot fi preluate din fisier sau baze de date
            linieDeReturnat = new Linie(nrLinie, "Prima statie", "Ulitma statie");
            linieMap.put(linieDeReturnat.getNrLinie(), linieDeReturnat);
            return linieDeReturnat;
        }
    }
}
