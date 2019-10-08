package br.com.senac.exemplo;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculadoraPprTest {

    private static final CalculadoraPpr calculadoraPpr = new CalculadoraPpr();

    @Test
    public void juniorDeveSerUmSalario() {
        Funcionario funcionario = new Funcionario(SenioridadeEnum.JUNIOR, 1000.0d);

        assertEquals(1000.0d, calculadoraPpr.calcular(funcionario), 2);
    }

    @Test
    public void plenoDeveSerDoisSalarios() {
        Funcionario funcionario = new Funcionario(SenioridadeEnum.PLENO, 2000.0d);

        assertEquals(4000.0d, calculadoraPpr.calcular(funcionario), 2);
    }

    @Test
    public void seniorDeveSerTresSalarios() {
        Funcionario funcionario = new Funcionario(SenioridadeEnum.PLENO, 3000.0d);

        assertEquals(6000.0d, calculadoraPpr.calcular(funcionario), 2);
    }
}
