package br.com.senac.validator;

import br.com.senac.exception.NomeInvalidoException;
import br.com.senac.service.NomeService;
import br.com.senac.util.Mensagens;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.Collections;

@RunWith(MockitoJUnitRunner.class)
public class NomeValidatorTest {

    private static final String INVALID_NOME_ESPECIAL = "?!@#@!Carlos";
    private static final String INVALID_NOME_TAMANHO = "Nome muito grande deve gerar erro ao testar";
    private static final String VALID_NOME = "Carlos";

    @Rule
    public final ExpectedException expectedException = ExpectedException.none();

    @Mock
    private NomeService nomeService;

    private NomeValidator nomeValidator;

    @Before
    public void init() {
        nomeValidator = new NomeValidator(nomeService);
    }

//  metodo deve jogar exceção quando nome for nulo
    @Test
    public void validateShouldThrowExceptionWhenNomeIsNull() throws NomeInvalidoException {
        expectedException.expect(NomeInvalidoException.class);
        expectedException.expectMessage(Mensagens.NOME_NULO);

        nomeValidator.validate(null);
    }

//  metodo deve jogar exceção quando nome não for alfanumérico
    @Test
    public void validateShouldThrowExceptionWhenNomeIsNotAlphaNumeric() throws NomeInvalidoException {
        expectedException.expect(NomeInvalidoException.class);
        expectedException.expectMessage(Mensagens.NOME_CARACTER_INVALIDO);

        nomeValidator.validate(INVALID_NOME_ESPECIAL);
    }


//  metodo deve jogar exceção quando tamanho do parâmetro for maior que 40
    @Test
    public void validateShouldThrowExceptionWhenNomeSizeIsGreaterThan40() throws NomeInvalidoException {
        expectedException.expect(NomeInvalidoException.class);
        expectedException.expectMessage(Mensagens.NOME_TAMANHO_INVALIDO);

        nomeValidator.validate(INVALID_NOME_TAMANHO);
    }

//  metodo deve ter sucesso quando nome for válido
    @Test
    public void validateShouldSuccessWhenNomeIsValid() throws NomeInvalidoException {
        Mockito.when(nomeService.findAll()).thenReturn(Collections.singletonList(VALID_NOME));

        nomeValidator.validate(VALID_NOME);
    }

    @Test
    public void validateShouldFailWhenNomeIsInvalid() throws NomeInvalidoException {
        expectedException.expect(NomeInvalidoException.class);
        expectedException.expectMessage(Mensagens.NOME_NAO_PERMITIDO);

        Mockito.when(nomeService.findAll()).thenReturn(Collections.emptyList());

        nomeValidator.validate(VALID_NOME);
    }

}
