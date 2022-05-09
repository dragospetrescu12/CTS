package main;

import clase.Autobuz;
import clase.LaCapatDeLinie;

public class Main {
    public static void main(String[] args) {
        Autobuz autobuz = new Autobuz(99);
        autobuz.trimiteLaReparat();
        autobuz.pleacaInCursa();
        autobuz.iesireDinService();
        autobuz.pleacaInCursa();
        autobuz.trimiteLaReparat();
        //autobuz.setState(new LaCapatDeLinie()); ---aici este diferenta dintre State si strategy...nu avem voie sa modificam, de aceea facem seter-ul protected in clasa autobuz
        autobuz.ajungeInCapatDeLinie();
    }
}
