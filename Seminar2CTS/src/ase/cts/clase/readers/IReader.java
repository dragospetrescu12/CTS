package ase.cts.clase.readers;

import ase.cts.clase.Aplicant;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;

public abstract class IReader {
    public abstract List<Aplicant> readAplicanti() ;
    protected Scanner scanner;

    public IReader(String numeFisier) throws FileNotFoundException {
        scanner = new Scanner(new File(numeFisier));
    }

    public void citireAplicant(Scanner input, Aplicant aplicant) {
        String nume = input.next();
        String prenume = input.next();
        int varsta = input.nextInt();
        int punctaj = input.nextInt();
        int nrProiecte = input.nextInt();
        String[] vect = new String[nrProiecte];
        for (int i = 0; i < nrProiecte; i++) {
            vect[i] = input.next();
        }
        aplicant.setNume(nume);
        aplicant.setPrenume(prenume);
        aplicant.setVarsta(varsta);
        aplicant.setPunctaj(punctaj);
        aplicant.setNrProiecte(nrProiecte,vect);
    }
}
