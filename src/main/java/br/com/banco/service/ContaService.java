package br.com.banco.service;

import br.com.banco.entities.Conta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.com.banco.repository.ContaRepository;

import java.util.List;

@Service
public class ContaService {

    @Autowired
    private ContaRepository contaRepository;

    public List<Conta> findAll(){
        return contaRepository.findAll();
    }

}
