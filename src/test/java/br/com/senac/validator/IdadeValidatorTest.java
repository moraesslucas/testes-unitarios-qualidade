package br.com.senac.validator;

import br.com.senac.exception.IdadeInvalidaException;
import br.com.senac.util.Mensagens;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class IdadeValidatorTest {

    private static final String INVALID_IDADE_LETRA = "ab123";
    private static final String INVALID_IDADE_TAMANHO = "11111";
    private static final String VALID_IDADE = "21";

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    private static final IdadeValidator IDADE_VALIDATOR = new IdadeValidator();

    @Test
    public void validateShouldThrowExceptionWhenNomeIsNull() throws IdadeInvalidaException {
        expectedException.expect(IdadeInvalidaException.class);
        expectedException.expectMessage(Mensagens.IDADE_NULA);

        IDADE_VALIDATOR.validate(null);
    }

    @Test
    public void validateShouldThrowExceptionWhenNomeIsNotAlphaNumeric() throws IdadeInvalidaException {
        expectedException.expect(IdadeInvalidaException.class);
        expectedException.expectMessage(Mensagens.IDADE_NAO_NUMERICA);

        IDADE_VALIDATOR.validate(INVALID_IDADE_LETRA);
    }

    @Test
    public void validateShouldThrowExceptionWhenNomeSizeIsGreaterThan40() throws IdadeInvalidaException {
        expectedException.expect(IdadeInvalidaException.class);
        expectedException.expectMessage(Mensagens.IDADE_INVALIDA);

        IDADE_VALIDATOR.validate(INVALID_IDADE_TAMANHO);
    }

    @Test
    public void validateShouldSuccessWhenIdadeIsValid() throws IdadeInvalidaException {
        IDADE_VALIDATOR.validate(VALID_IDADE);
    }

}
