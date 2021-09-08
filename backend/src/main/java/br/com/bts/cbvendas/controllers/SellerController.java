package br.com.bts.cbvendas.controllers;

import br.com.bts.cbvendas.dto.SellerDTO;
import br.com.bts.cbvendas.services.SellerService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping(value = "/sellers")
public class SellerController {

    private final SellerService sellerService;

    @GetMapping
    public ResponseEntity<List<SellerDTO>> findAll() {
        List<SellerDTO> sellers = sellerService.findAll();
        return ResponseEntity.ok(sellers);
    }
}
