package main;

import clase.Decorator;
import clase.DecoratorAbstract;
import clase.Iimprimanta;
import clase.ImprimantaDeBilete;

public class Program {
    public static void main(String[] args) {
        Iimprimanta imprimanta = new ImprimantaDeBilete(5);
        imprimanta.printeazaBilet();

        DecoratorAbstract decorator = new Decorator(imprimanta, "Paste fericit!!");
        decorator.printeazaBilet();
        decorator.printeazaVerso();
    }
}
