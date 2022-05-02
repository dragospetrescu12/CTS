package main;

import clase.Autobuz;
import clase.MijlocDeTransportNoapte;

public class Program {
    public static void main(String[] args) {
        Autobuz autobuz1 = new Autobuz("b123ABC", 20);
        Autobuz autobuz2 = new Autobuz("b123ZXC", 0);

        MijlocDeTransportNoapte mijlocDeTransportNoapte1 = new MijlocDeTransportNoapte(autobuz1);
        MijlocDeTransportNoapte mijlocDeTransportNoapte2 = new MijlocDeTransportNoapte(autobuz2);

        autobuz1.opresteInStatie();
        autobuz2.opresteInStatie();

        mijlocDeTransportNoapte1.opresteInStatie();
        mijlocDeTransportNoapte2.opresteInStatie();

    }
}
