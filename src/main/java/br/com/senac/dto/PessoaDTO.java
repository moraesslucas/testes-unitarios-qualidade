package br.com.senac.dto;

import br.com.senac.enumeration.SexoEnum;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class PessoaDTO {

    private String nome;
    private String idade;
    private String sexo;

}
