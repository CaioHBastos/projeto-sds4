package br.com.bts.cbvendas.dto;

import br.com.bts.cbvendas.entities.Seller;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class SalesSumDTO {

    private String sellerName;
    private Double sum;

    public SalesSumDTO(Seller seller, Double sum) {
        sellerName = seller.getName();
        this.sum = sum;
    }
}
