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

    private static final NomeValidator nomeValidator = new NomeValidator();

//  metodo deve jogar exceção quando nome for nulo
    @Test
    public void validateShouldThrowExceptionWhenNomeIsNull() {
    }

//  metodo deve jogar exceção quando nome não for alfanumérico
    @Test
    public void validateShouldThrowExceptionWhenNomeIsNotAlphaNumeric() {
    }


//  metodo deve jogar exceção quando tamanho do parâmetro for maior que 40
    @Test
    public void validateShouldThrowExceptionWhenNomeSizeIsGreaterThan40() {
    }

//  metodo deve ter sucesso quando nome for válido
    @Test
    public void validateShouldSuccessWhenNomeIsValid() {
        nomeValidator.validate(VALID_NOME);
    }

}
