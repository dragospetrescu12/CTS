package main;

import clase.Autobuz;
import clase.ManagerAutobuz;

public class Main {
    public static void main(String[] args) {

        Autobuz autobuz = new Autobuz("autobuz1", "Dragos", 22.2f, 1999);
        ManagerAutobuz managerAutobuz = new ManagerAutobuz();
        managerAutobuz.adaugareMemento(autobuz.creareMemento());
        autobuz.setNumeSofer("Marcel");
        managerAutobuz.adaugareMemento(autobuz.creareMemento());
        autobuz.setConsumMediu(15);
        managerAutobuz.adaugareMemento(autobuz.creareMemento());
        System.out.println(autobuz.toString());

        autobuz.revenireStareAnterioara(managerAutobuz.getMementoAutobuz(0));

        System.out.println(autobuz.toString());

    }
}
