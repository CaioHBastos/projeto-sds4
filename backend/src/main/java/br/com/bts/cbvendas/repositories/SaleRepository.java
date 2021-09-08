package br.com.bts.cbvendas.repositories;

import br.com.bts.cbvendas.entities.Sale;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SaleRepository extends JpaRepository<Sale, Long> {
}
