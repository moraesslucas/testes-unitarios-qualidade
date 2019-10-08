package br.com.senac.exemplo;

import lombok.Getter;

@Getter
public enum SenioridadeEnum {

    JUNIOR("Júnior", 1.0d),
    PLENO("Pleno", 2.0d),
    SENIOR("Sênior", 3.0d);


    private final String label;
    private final double metricaPpr;

    SenioridadeEnum(String label, double metricaPpr) {
        this.label = label;
        this.metricaPpr = metricaPpr;
    }
}
