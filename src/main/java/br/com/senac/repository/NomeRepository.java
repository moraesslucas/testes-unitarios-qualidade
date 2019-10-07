package br.com.senac.repository;

import java.util.Arrays;
import java.util.List;

public class NomeRepository {

    public List<String> findAll() {
        return Arrays.asList("Carlos", "Lucas", "Kamila");
    }

}
