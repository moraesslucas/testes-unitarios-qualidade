package br.com.senac.exemplo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class Funcionario {

    private SenioridadeEnum senioridade;
    private Double salario;

}
