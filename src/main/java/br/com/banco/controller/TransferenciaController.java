package br.com.banco.controller;

import br.com.banco.service.ContaService;
import br.com.banco.service.TransferenciaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/transferencias")
public class TransferenciaController {

    @Autowired
    TransferenciaService transferenciaService;

    @GetMapping("/byContaId")
    public ResponseEntity findAllByContaId(@Param("id") Long conta_id){

        return ResponseEntity.ok().body(transferenciaService.findAllByConta(conta_id));
    }

    @GetMapping
    public ResponseEntity findAll(){

        return ResponseEntity.ok().body(transferenciaService.findAll());
    }

    @GetMapping("/byTempo")
    public ResponseEntity findBeetwenDate(@Param("startDate") String startDate,
                                          @Param("endDate") String endDate){

        return ResponseEntity.ok().body(transferenciaService.findAllBeetwenDate(startDate, endDate));
    }

    @GetMapping("/byNome")
    public ResponseEntity findByName(@Param("operatorName") String operatorName){

        return ResponseEntity.ok().body(transferenciaService.findByName(operatorName));
    }
}
