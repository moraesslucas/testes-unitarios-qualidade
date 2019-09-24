package br.com.senac.validator;

import br.com.senac.exception.IdadeInvalidaException;
import br.com.senac.util.Mensagens;

import java.util.Objects;

public class IdadeValidator implements Validator<String> {

    @Override
    public void validate(String criteria) throws IdadeInvalidaException {
        if (Objects.isNull(criteria)) {
            throw new IdadeInvalidaException(Mensagens.IDADE_NULA);
        }

        if (!criteria.matches("^[0-9]*")) {
            throw new IdadeInvalidaException(Mensagens.IDADE_NAO_NUMERICA);
        }

        if (Integer.parseInt(criteria) > 100) {
            throw new IdadeInvalidaException(Mensagens.IDADE_INVALIDA);
        }
    }

}
