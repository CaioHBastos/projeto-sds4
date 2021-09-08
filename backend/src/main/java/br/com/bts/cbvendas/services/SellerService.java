package br.com.bts.cbvendas.services;

import br.com.bts.cbvendas.dto.SellerDTO;
import br.com.bts.cbvendas.entities.Seller;
import br.com.bts.cbvendas.repositories.SellerRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@AllArgsConstructor
@Service
public class SellerService {

    private final SellerRepository sellerRepository;

    public List<SellerDTO> findAll() {
        List<Seller> sellers = sellerRepository.findAll();

        return sellers.stream()
                .map(SellerDTO::new)
                .collect(Collectors.toList());
    }
}
