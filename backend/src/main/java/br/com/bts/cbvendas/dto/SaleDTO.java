package br.com.bts.cbvendas.dto;

import br.com.bts.cbvendas.entities.Sale;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class SaleDTO {

    private Long id;
    private Integer visited;
    private Integer deals;
    private Double amount;
    private LocalDate date;

    private SellerDTO seller;

    public SaleDTO(Sale saleEntity) {
        id = saleEntity.getId();
        visited = saleEntity.getVisited();
        deals = saleEntity.getDeals();
        amount = saleEntity.getAmount();
        date = saleEntity.getDate();
        seller = new SellerDTO(saleEntity.getSeller());
    }
}
