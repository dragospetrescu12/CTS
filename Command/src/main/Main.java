package main;

import clase.Autobuz;
import clase.Comanda;
import clase.ManagerComenzi;
import clase.PleacaInCursa;

public class Main {
    public static void main(String[] args) {

        Autobuz a1 = new Autobuz("autobuz1");
        Autobuz a2 = new Autobuz("autobuz2");
        Autobuz a3 = new Autobuz("autobuz3");

        Comanda c1 = new PleacaInCursa(a1, 331);
        ManagerComenzi mc = new ManagerComenzi();

        mc.invoca(new PleacaInCursa(a1,331));
        mc.invoca(new PleacaInCursa(a1,341));
        mc.invoca(new PleacaInCursa(a1,351));
        mc.invoca(new PleacaInCursa(a1,361));
        mc.invoca(new PleacaInCursa(a1,371));
        mc.invoca(new PleacaInCursa(a1,381));

        mc.executa();
        mc.executa();
        mc.executa();
        mc.executa();



    }
}
