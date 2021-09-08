package br.com.bts.cbvendas.repositories;

import br.com.bts.cbvendas.entities.Seller;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SellerRepository extends JpaRepository<Seller, Long> {
}
