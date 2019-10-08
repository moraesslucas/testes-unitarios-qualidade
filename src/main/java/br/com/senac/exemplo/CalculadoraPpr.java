package br.com.senac.exemplo;

public class CalculadoraPpr {

    public double calcular(Funcionario funcionario) {
        if (funcionario.getSenioridade() == SenioridadeEnum.JUNIOR) {
            return funcionario.getSalario();
        }

        if (funcionario.getSenioridade() == SenioridadeEnum.PLENO) {
            return funcionario.getSalario() * 2;
        }

        if (funcionario.getSenioridade() == SenioridadeEnum.SENIOR) {
            return funcionario.getSalario() * 3;
        }

        return 0.0d;
    }

}
