package br.com.senac.enumeration;

import br.com.senac.exception.SexoInvalidoException;
import br.com.senac.util.Mensagens;
import lombok.Getter;

import java.util.Arrays;

@Getter
public enum SexoEnum {

    MASCULINO("M"),
    FEMININO("F"),
    OUTRO("O");

    private String letra;

    SexoEnum(String letra) {
        this.letra = letra;
    }

    public static SexoEnum getByLetra(String letra) throws SexoInvalidoException {
        return Arrays.asList(SexoEnum.values()).stream()
                .filter(sexo -> sexo.getLetra().equals(letra))
                .findFirst()
                .orElseThrow(() -> new SexoInvalidoException(Mensagens.SEXO_INVALIDO));
    }

}
