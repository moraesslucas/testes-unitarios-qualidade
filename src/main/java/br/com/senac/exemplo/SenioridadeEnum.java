package br.com.senac.exemplo;

import lombok.Getter;

@Getter
public enum SenioridadeEnum {

    JUNIOR("Júnior"),
    PLENO("Pleno"),
    SENIOR("Sênior");


    private final String label;

    SenioridadeEnum(String label) {
        this.label = label;
    }
}
