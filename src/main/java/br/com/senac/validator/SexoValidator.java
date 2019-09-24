package br.com.senac.validator;

import br.com.senac.enumeration.SexoEnum;
import br.com.senac.exception.SexoInvalidoException;
import br.com.senac.util.Mensagens;

import java.util.Objects;

public class SexoValidator implements Validator<String> {

    @Override
    public void validate(String criteria) throws SexoInvalidoException {
        if (Objects.isNull(criteria)) {
            throw new SexoInvalidoException(Mensagens.SEXO_NULO);
        }

        SexoEnum.getByLetra(criteria);
    }

}
