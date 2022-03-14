package ase.cts.clase.readers;

import ase.cts.clase.Aplicant;
import ase.cts.clase.Student;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class StudentiReader extends IReader {

    public StudentiReader(String numeFisier) throws FileNotFoundException {
        super(numeFisier);
    }

    @Override
    public List<Aplicant> readAplicanti() {
        super.scanner.useDelimiter(",|\n");
        List<Aplicant> studenti = new ArrayList<Aplicant>();

        while (scanner.hasNext()) {
            Student student = new Student();
            super.citireAplicant(scanner, student);
            int anStudii = scanner.nextInt();
            String facultate = scanner.next();
            student.setFacultate(facultate);
            student.setAnStudii(anStudii);
            studenti.add(student);
        }
        scanner.close();
        return studenti;
    }

}
