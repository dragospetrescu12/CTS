package ase.cts.clase.readers;

import ase.cts.clase.Angajat;
import ase.cts.clase.Aplicant;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class AngajatiReader extends IReader{
    public AngajatiReader(String numeFisier) throws FileNotFoundException {
        super(numeFisier);
    }

    @Override
    public List<Aplicant> readAplicanti()  {
        super.scanner.useDelimiter(",");
        List<Aplicant> angajati = new ArrayList<Aplicant>();

        while (scanner.hasNext()) {
            Angajat angajat = new Angajat();
            super.citireAplicant(scanner, angajat);
            int salariu = scanner.nextInt();
            String ocupatie = scanner.next();
            angajat.setSalariu(salariu);
            angajat.setOcupatie(ocupatie);
            angajati.add(angajat);
        }
        scanner.close();
        return angajati;
    }
}
