package br.com.bts.cbvendas.repositories;

import br.com.bts.cbvendas.dto.SalesSuccessDTO;
import br.com.bts.cbvendas.dto.SalesSumDTO;
import br.com.bts.cbvendas.entities.Sale;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface SaleRepository extends JpaRepository<Sale, Long> {

    @Query("SELECT new br.com.bts.cbvendas.dto.SalesSumDTO(obj.seller, SUM(obj.amount)) " +
            " FROM Sale AS obj GROUP BY obj.seller")
    List<SalesSumDTO> amountGroupdBySeller();

    @Query("SELECT new br.com.bts.cbvendas.dto.SalesSuccessDTO(obj.seller, SUM(obj.visited), SUM(obj.deals)) " +
            " FROM Sale AS obj GROUP BY obj.seller")
    List<SalesSuccessDTO> successGroupdBySeller();
}
