package br.com.senac.validator;

import br.com.senac.exception.SexoInvalidoException;
import br.com.senac.util.Mensagens;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class SexoValidatorTest {

    private static final String INVALID_SEXO = "C";
    private static final String VALID_SEXO = "M";

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    private static final SexoValidator sexoValidator = new SexoValidator();

    @Test
    public void validateShouldThrowExceptionWhenNomeIsNull() throws SexoInvalidoException {
        expectedException.expect(SexoInvalidoException.class);
        expectedException.expectMessage(Mensagens.SEXO_NULO);

        sexoValidator.validate(null);
    }

    @Test
    public void validateShouldThrowExceptionWhenNomeIsNotAlphaNumeric() throws SexoInvalidoException {
        expectedException.expect(SexoInvalidoException.class);
        expectedException.expectMessage(Mensagens.SEXO_INVALIDO);

        sexoValidator.validate(INVALID_SEXO);
    }


    @Test
    public void validateShouldSuccessWhenNomeIsValid() throws SexoInvalidoException {
        sexoValidator.validate(VALID_SEXO);
    }

}
