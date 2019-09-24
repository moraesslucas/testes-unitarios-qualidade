package br.com.senac.util;

import lombok.experimental.UtilityClass;

@UtilityClass
public class Mensagens {

    public static final String SEXO_INVALIDO = "O sexo informado não é válido, apenas \"M\" e \"F\" são aceitos.";
    public static final String SEXO_NULO = "O sexo da pessoa deve ser informado.";

    public static final String NOME_NULO = "O nome da pessoa não pode ser nulo.";
    public static final String NOME_CARACTER_INVALIDO = "O nome da pessoa contém caracteres inválidos, apenas caracteres alfa-numéricos são aceitos.";
    public static final String NOME_TAMANHO_INVALIDO = "O nome da pessoa deve conter entre 0 e 40 caracteres.";

    public static final String IDADE_NULA = "A idade da pessoa deve ser informada.";
    public static final String IDADE_INVALIDA = "A idade informada não é válida, informe até 2 caracteres.";
    public static final String IDADE_NAO_NUMERICA = "A idade deve ser apenas composta por números.";

}
