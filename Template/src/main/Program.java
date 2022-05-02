package main;

import clase.MijlocTransportPeSine;
import clase.Tramvai;

public class Program {
    public static void main(String[] args) {
        MijlocTransportPeSine tramvai = new Tramvai();
        tramvai.parcurgeTraseuInSensNormal();
        System.out.println("*******");
        tramvai.parcurgeTraseuInSensInvers();

    }
}
