package br.com.senac.validator;

import br.com.senac.exception.NomeInvalidoException;
import br.com.senac.util.Mensagens;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class NomeValidatorTest {

    private static final String INVALID_NOME_ESPECIAL = "?!@#@!Carlos";
    private static final String INVALID_NOME_TAMANHO = "Nome muito grande deve gerar erro ao testar";
    private static final String VALID_NOME = "Carlos Nome";

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    private static final NomeValidator NOME_VALIDATOR = new NomeValidator();

    @Test
    public void validateShouldThrowExceptionWhenNomeIsNull() throws NomeInvalidoException {
        expectedException.expect(NomeInvalidoException.class);
        expectedException.expectMessage(Mensagens.NOME_NULO);

        NOME_VALIDATOR.validate(null);
    }

    @Test
    public void validateShouldThrowExceptionWhenNomeIsNotAlphaNumeric() throws NomeInvalidoException {
        expectedException.expect(NomeInvalidoException.class);
        expectedException.expectMessage(Mensagens.NOME_CARACTER_INVALIDO);

        NOME_VALIDATOR.validate(INVALID_NOME_ESPECIAL);
    }

    @Test
    public void validateShouldThrowExceptionWhenNomeSizeIsGreaterThan40() throws NomeInvalidoException {
        expectedException.expect(NomeInvalidoException.class);
        expectedException.expectMessage(Mensagens.NOME_CARACTER_INVALIDO);

        NOME_VALIDATOR.validate(INVALID_NOME_TAMANHO);
    }

    @Test
    public void validateShouldSuccessWhenNomeIsValid() throws NomeInvalidoException {
        NOME_VALIDATOR.validate(VALID_NOME);
    }

}
