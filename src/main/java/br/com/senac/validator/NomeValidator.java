package br.com.senac.validator;

import br.com.senac.exception.NomeInvalidoException;
import br.com.senac.service.NomeService;
import br.com.senac.util.Mensagens;

import java.util.Objects;

public class NomeValidator implements Validator<String> {

    private final NomeService nomeService;

    public NomeValidator(NomeService nomeService) {
        this.nomeService = nomeService;
    }

    @Override
    public void validate(String criteria) throws NomeInvalidoException {
        if (Objects.isNull(criteria)) {
            throw new NomeInvalidoException(Mensagens.NOME_NULO);
        }

        if (!criteria.matches("^[A-z0-9 ]*")) {
            throw new NomeInvalidoException(Mensagens.NOME_CARACTER_INVALIDO);
        }

        if (criteria.length() > 40) {
            throw new NomeInvalidoException(Mensagens.NOME_TAMANHO_INVALIDO);
        }

        if (Objects.nonNull(nomeService.findAll()) && !nomeService.findAll().contains(criteria)) {
            throw new NomeInvalidoException(Mensagens.NOME_NAO_PERMITIDO);
        }
    }

}
