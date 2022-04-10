package adapter_clase;

import adapter_obiecte.Validator;
import metrou.ValidatorMetrou;

public class AdapterMetrouDeClasa extends ValidatorMetrou implements Validator {

    @Override
    public void v_bilet() {
        super.validareCalatorie();
    }

    public void validareAbonament() {
        super.validareAbonament();
    }

}
