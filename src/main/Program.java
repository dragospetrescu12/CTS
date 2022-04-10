package main;

import adapter_clase.AdapterMetrouDeClasa;
import adapter_obiecte.Validator;
import adapter_obiecte.ValidatorAutobuz;
import adapter_obiecte.ValidatorSubteranAdapter;
import metrou.ValidatorMetrou;

public class Program {
    public static void valideazaBilet(Validator validator) {
        validator.v_bilet();

    }

    public static void valideazaAbonament(Validator validator) {
        validator.validareAbonament();

    }

    public static void main(String[] args) {
        ValidatorAutobuz validatorAutobuz = new ValidatorAutobuz();
        valideazaBilet(validatorAutobuz);
        ValidatorMetrou validatorMetrou = new ValidatorMetrou();
        ValidatorSubteranAdapter adapter = new ValidatorSubteranAdapter(validatorMetrou);
        valideazaBilet(adapter);

        AdapterMetrouDeClasa adapterMetrou = new AdapterMetrouDeClasa();
        valideazaAbonament(adapterMetrou);

    }
}