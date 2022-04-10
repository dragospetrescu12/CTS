package adapter_obiecte;

import metrou.ValidatorMetrou;

public class ValidatorSubteranAdapter implements Validator{
    private ValidatorMetrou validatorMetrou;

    public ValidatorSubteranAdapter(ValidatorMetrou validatorMetrou) {
        this.validatorMetrou = validatorMetrou;
    }

    @Override
    public void validareAbonament() {
        validatorMetrou.validareAbonament();
    }

    @Override
    public void v_bilet() {
        validatorMetrou.validareCalatorie();
    }
}