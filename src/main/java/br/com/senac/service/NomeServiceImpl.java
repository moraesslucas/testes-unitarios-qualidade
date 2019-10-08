package br.com.senac.service;

import br.com.senac.repository.NomeRepository;

import java.util.List;

public class NomeServiceImpl implements NomeService {

    private final NomeRepository nomeRepository;

    public NomeServiceImpl(NomeRepository nomeRepository) {
        this.nomeRepository = nomeRepository;
    }

    @Override
    public List<String> findAll() {
        return nomeRepository.findAll();
    }
}
