package br.com.bts.cbvendas.dto;

import br.com.bts.cbvendas.entities.Seller;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class SalesSuccessDTO {

    private String sellerName;
    private Long visited;
    private Long deals;

    public SalesSuccessDTO(Seller seller, Long visited, Long deals) {
        sellerName = seller.getName();
        this.visited = visited;
        this.deals = deals;
    }
}
