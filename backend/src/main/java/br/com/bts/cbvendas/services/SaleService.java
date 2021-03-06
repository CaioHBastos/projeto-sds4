package br.com.bts.cbvendas.services;

import br.com.bts.cbvendas.dto.SaleDTO;
import br.com.bts.cbvendas.dto.SalesSuccessDTO;
import br.com.bts.cbvendas.dto.SalesSumDTO;
import br.com.bts.cbvendas.entities.Sale;
import br.com.bts.cbvendas.repositories.SaleRepository;
import br.com.bts.cbvendas.repositories.SellerRepository;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@AllArgsConstructor
@Service
public class SaleService {

    private final SaleRepository saleRepository;
    private final SellerRepository sellerRepository;

    @Transactional(readOnly = true)
    public Page<SaleDTO> findAll(Pageable pageable) {
        sellerRepository.findAll();
        Page<Sale> sales = saleRepository.findAll(pageable);
        return sales.map(SaleDTO::new);
    }

    @Transactional(readOnly = true)
    public List<SalesSumDTO> amountGroupdBySeller() {
        return saleRepository.amountGroupdBySeller();
    }

    @Transactional(readOnly = true)
    public List<SalesSuccessDTO> successGroupdBySeller() {
        return saleRepository.successGroupdBySeller();
    }

}
