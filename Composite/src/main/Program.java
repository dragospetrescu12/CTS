package main;

import clase.Autobuz;
import clase.Flota;

public class Program {
    public static void main(String[] args) {
        Autobuz autobuz1 = new Autobuz("Audi", "a1", 10);
        Autobuz autobuz2 = new Autobuz("Audi", "a1", 7);
        Autobuz autobuz3 = new Autobuz("Audi", "a1", 30);
        Autobuz autobuz4 = new Autobuz("Audi", "a1", 100);
        Autobuz autobuz5 = new Autobuz("Audi", "a1", 30);
        Autobuz autobuz6 = new Autobuz("Audi", "a1", 45);

        Flota flota1 = new Flota("Flota 1");
        Flota flota2 = new Flota("Flota 2");
        Flota flota3 = new Flota("Flota mare");
        Flota flota4 = new Flota("Flota MAMA");


        try {
            flota1.adaugaItem(autobuz1);
            flota1.adaugaItem(autobuz2);

            flota2.adaugaItem(autobuz3);

            flota3.adaugaItem(autobuz4);
            flota3.adaugaItem(autobuz5);
            flota3.adaugaItem(autobuz6);

            flota4.adaugaItem(flota1);
            flota4.adaugaItem(flota2);
            flota4.adaugaItem(flota3);

            flota4.descriereItem(); //afisam pt toate
            flota4.stergeItem(flota2);

            flota1.stergeItem(autobuz2);

            flota4.descriereItem();

            System.out.println("Suma totala pentru flota cu masinile mari, adica flota 3 este "
                    + flota3.calculeazaSumaGarantata(3) + " lei(pretul fiind de 3 lei per loc.");





        } catch (Exception e) {
            e.printStackTrace();
        }



    }
}
