package mainFlyweight;

import clase.Autobuz;
import clase.Linie;
import flyweightfactory.FlyweightFactory;

public class Main {
    public static void main(String[] args) {
        Autobuz autobuz1 = new Autobuz("a1", 1995, 40);
        Autobuz autobuz2 = new Autobuz("a2", 1994, 50);
        Autobuz autobuz3 = new Autobuz("a3", 1999, 60);
        Autobuz autobuz4 = new Autobuz("a4", 1993, 70);

        FlyweightFactory flyweightFactory = new FlyweightFactory();

        Linie linie1 = flyweightFactory.getLinie(168);
        Linie linie2 = flyweightFactory.getLinie(133);

        autobuz1.descriereAutobuz(linie1);
        autobuz2.descriereAutobuz(linie1);
        autobuz3.descriereAutobuz(linie2);
        autobuz4.descriereAutobuz(linie2);

        // folosim flyweight factory pentru a folosi de fiecare data aceeasi linie din memorie, care este salvata in map-ul respectiv



    }
}
