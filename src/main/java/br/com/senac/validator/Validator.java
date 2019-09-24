package br.com.senac.validator;

import br.com.senac.exception.ValidationException;

public interface Validator<T> {

    void validate(T criteria) throws ValidationException;
}
