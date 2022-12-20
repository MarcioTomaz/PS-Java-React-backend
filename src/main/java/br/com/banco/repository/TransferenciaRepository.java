package br.com.banco.repository;

import br.com.banco.entities.Transferencia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TransferenciaRepository extends JpaRepository<Transferencia, Long> {


    @Query(nativeQuery = true, value = "SELECT * FROM transferencia WHERE conta_id = :id ")
    List<Transferencia> findAllTransferencia(@Param("id") Long id);

    @Query(nativeQuery = true, value =
            "SELECT * FROM " +
                    " TRANSFERENCIA " +
                    "   WHERE data_transferencia >= :startDate " +
                    "       AND data_transferencia <= :endDate ")
    List<Transferencia> findAllBeetwenDate(@Param("startDate") String startDate, @Param("endDate") String endDate);

    List<Transferencia> findByNomeOperadorTransacao(String operatorName);
}
