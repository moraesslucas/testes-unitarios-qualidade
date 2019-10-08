package br.com.senac.exemplo;

public class CalculadoraPpr {

    public double calcular(Funcionario funcionario) {
        return funcionario.getSalario() * funcionario.getSenioridade().getMetricaPpr();
    }

}
