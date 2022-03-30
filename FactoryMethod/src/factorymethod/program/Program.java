package factorymethod.program;

import factorymethod.FactoryAutobuz;
import factorymethod.FactoryTramvai;
import factorymethod.FactoryTroleibuz;
import factorymethod.MijlocTransport;

public class Program {
    public static void main(String[] args) {
        MijlocTransport autobuz = new FactoryAutobuz().getMijlocTransport(100);
        MijlocTransport tramvai = new FactoryTramvai().getMijlocTransport(101);
        MijlocTransport troleibuz = new FactoryTroleibuz().getMijlocTransport(102);

        System.out.println(autobuz.toString());
        System.out.println(tramvai.toString());
        System.out.println(troleibuz.toString());

    }
}
