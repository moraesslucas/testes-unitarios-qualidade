package br.com.senac.validator;

public interface Validator<T> {

    void validate(T criteria);
}
