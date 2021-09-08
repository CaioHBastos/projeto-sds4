package br.com.bts.cbvendas.controllers;

import br.com.bts.cbvendas.dto.SaleDTO;
import br.com.bts.cbvendas.dto.SalesSuccessDTO;
import br.com.bts.cbvendas.dto.SalesSumDTO;
import br.com.bts.cbvendas.services.SaleService;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping(value = "/sales")
public class SaleController {

    private final SaleService saleService;

    @GetMapping
    public ResponseEntity<Page<SaleDTO>> findAll(Pageable pageable) {
        Page<SaleDTO> sales = saleService.findAll(pageable);
        return ResponseEntity.ok(sales);
    }

    @GetMapping(value = "/amount-by-seller")
    public ResponseEntity<List<SalesSumDTO>> amountGroupdBySeller() {
        List<SalesSumDTO> salesSuns = saleService.amountGroupdBySeller();
        return ResponseEntity.ok(salesSuns);
    }

    @GetMapping(value = "/success-by-seller")
    public ResponseEntity<List<SalesSuccessDTO>> successGroupdBySeller() {
        List<SalesSuccessDTO> salesSuccesses = saleService.successGroupdBySeller();
        return ResponseEntity.ok(salesSuccesses);
    }
}