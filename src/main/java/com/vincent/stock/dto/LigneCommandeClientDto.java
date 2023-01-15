package com.vincent.stock.dto;

import java.math.BigDecimal;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class LigneCommandeClientDto {

	private BigDecimal quantite;

	private BigDecimal prixUnitaire;
	
	private ArticleDto article;

	private CommandeClientDto commandeClient;
}
