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

    public final ExpectedException expectedException = ExpectedException.none();

    private static final NomeValidator nomeValidator = new NomeValidator();

//  metodo deve jogar exceção quando nome for nulo
    @Test
    public void validateShouldThrowExceptionWhenNomeIsNull() {
        expectedException.expect(NomeInvalidoException.class);
        expectedException.expectMessage(Mensagens.NOME_NULO);

        nomeValidator.validate(null);
    }

//  metodo deve jogar exceção quando nome não for alfanumérico
    @Test
    public void validateShouldThrowExceptionWhenNomeIsNotAlphaNumeric() {
        expectedException.expect(NomeInvalidoException.class);
        expectedException.expectMessage(Mensagens.NOME_CARACTER_INVALIDO);

        nomeValidator.validate(INVALID_NOME_ESPECIAL);
    }


//  metodo deve jogar exceção quando tamanho do parâmetro for maior que 40
    @Test
    public void validateShouldThrowExceptionWhenNomeSizeIsGreaterThan40() {
        expectedException.expect(NomeInvalidoException.class);
        expectedException.expectMessage(Mensagens.NOME_TAMANHO_INVALIDO);

        nomeValidator.validate(INVALID_NOME_TAMANHO);
    }

//  metodo deve ter sucesso quando nome for válido
    @Test
    public void validateShouldSuccessWhenNomeIsValid() {
        nomeValidator.validate(VALID_NOME);
    }

}
