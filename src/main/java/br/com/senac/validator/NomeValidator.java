package br.com.senac.validator;

import br.com.senac.exception.NomeInvalidoException;
import br.com.senac.util.Mensagens;

import java.util.Objects;

public class NomeValidator implements Validator<String> {

    @Override
    public void validate(String criteria) throws NomeInvalidoException {
        if (Objects.isNull(criteria)) {
            throw new NomeInvalidoException(Mensagens.NOME_NULO);
        }

        if (!criteria.matches("^[A-z][0-9]*")) {
            throw new NomeInvalidoException(Mensagens.NOME_CARACTER_INVALIDO);
        }

        if (criteria.length() > 40) {
            throw new NomeInvalidoException(Mensagens.NOME_TAMANHO_INVALIDO);
        }
    }

}
