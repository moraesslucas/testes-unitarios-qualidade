package br.com.senac.service;

import br.com.senac.repository.NomeRepository;

import java.util.List;

public class NomeServiceImpl implements NomeService {

    private final NomeRepository nomeRepository;

    public NomeServiceImpl() {
        this.nomeRepository = new NomeRepository();
    }

    @Override
    public List<String> findAll() {
        return nomeRepository.findAll();
    }
}
