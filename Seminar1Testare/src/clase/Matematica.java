package clase;

import teste.MatematicaTest;

import java.util.ArrayList;
import java.util.List;

public class Matematica {

    private static Matematica matematica = null;

    private Matematica() {

    }

    public static Matematica getInstance() {
        if(matematica == null) {
            matematica = new Matematica();
        }
        return  matematica;
    }

    public int suma(int param1, int param2) {
        return param1 + param2;
    }

    public double raport(int numarator, int numitor) {
        if(numitor != 0) {
            return (double) numarator / numitor;
        } else {
            throw new IllegalArgumentException();
        }
    }

    public boolean estePar(int numar) {
        return numar % 2 == 0;
    }

    public List<Integer> nNumerePare(int n) {
        if (n >= 0) {
            if(n!=0) {
                List<Integer> lista;
                lista = new ArrayList<Integer>();
                for (int i = 0; i < n; i++)
                    lista.add(i * 2);
                return lista;
            }  else {
                return null;
            }
        } else {
            throw new IllegalArgumentException();
        }
    }
}
