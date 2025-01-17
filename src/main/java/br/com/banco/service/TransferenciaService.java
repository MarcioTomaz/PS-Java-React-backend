package br.com.banco.service;

import br.com.banco.entities.Conta;
import br.com.banco.entities.Transferencia;
import br.com.banco.repository.ContaRepository;
import br.com.banco.repository.TransferenciaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransferenciaService {

    @Autowired
    private TransferenciaRepository transferenciaRepository;

    public List<Transferencia> findAllByConta(Long conta_id){
        return transferenciaRepository.findAllTransferencia(conta_id);
    }

    public List<Transferencia> findAll() {
        return transferenciaRepository.findAll();
    }

    public List<Transferencia> findAllBeetwenDate(String startDate, String endDate) {

        return transferenciaRepository.findAllBeetwenDate(startDate, endDate);
    }

    public List<Transferencia> findByName(String operatorName) {
        return transferenciaRepository.findByNomeOperadorTransacao(operatorName);
    }
}
