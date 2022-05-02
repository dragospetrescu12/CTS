package main;

import clase.*;

public class Program {
    public static void main(String[] args) {

        Autobuz autobuz = new Autobuz(5);
        Troleibuz troleibuz = new Troleibuz(3);
        Tramvai tramvai = new Tramvai(10);
        Metrou metrou = new Metrou();

        troleibuz.setNextHandler(autobuz);
        autobuz.setNextHandler(tramvai);
        tramvai.setNextHandler(metrou);

        troleibuz.afiseazaCuCeSaMearga(4);
        troleibuz.afiseazaCuCeSaMearga(2);
        troleibuz.afiseazaCuCeSaMearga(7);
        troleibuz.afiseazaCuCeSaMearga(12);

        Handler autobuzCluj = new Autobuz(3000);
        Handler tramvaiCluj = new Tramvai(8);
        Handler troleibuzCluj = new Troleibuz(3);

        troleibuzCluj.setNextHandler(tramvaiCluj);
        tramvaiCluj.setNextHandler(autobuzCluj);
    }
}
