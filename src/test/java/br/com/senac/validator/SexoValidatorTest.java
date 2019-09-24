package br.com.senac.validator;

import br.com.senac.exception.NomeInvalidoException;
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

    private static final SexoValidator SEXO_VALIDATOR = new SexoValidator();

    @Test
    public void validateShouldThrowExceptionWhenNomeIsNull() throws SexoInvalidoException {
        expectedException.expect(SexoInvalidoException.class);
        expectedException.expectMessage(Mensagens.SEXO_NULO);

        SEXO_VALIDATOR.validate(null);
    }

    @Test
    public void validateShouldThrowExceptionWhenNomeIsNotAlphaNumeric() throws SexoInvalidoException {
        expectedException.expect(SexoInvalidoException.class);
        expectedException.expectMessage(Mensagens.SEXO_INVALIDO);

        SEXO_VALIDATOR.validate(INVALID_SEXO);
    }


    @Test
    public void validateShouldSuccessWhenNomeIsValid() throws SexoInvalidoException {
        SEXO_VALIDATOR.validate(VALID_SEXO);
    }

}
