package br.com.senac.service;

import br.com.senac.repository.NomeRepository;
import br.com.senac.validator.NomeValidator;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class NomeServiceTest {

    @Mock
    private NomeRepository nomeRepository;

    private NomeService nomeService;

    @Before
    public void init() {
        nomeService = new NomeServiceImpl(nomeRepository);
    }

    @Test
    public void findAllShouldReturnNomeRepositoryList() {
        List<String> expected = Arrays.asList("José", "Maria", "João");
        Mockito.when(nomeRepository.findAll()).thenReturn(expected);

        assertEquals(expected, nomeService.findAll());

        expected = Collections.emptyList();
        Mockito.when(nomeRepository.findAll()).thenReturn(expected);

        assertEquals(expected, nomeService.findAll());
    }



}
