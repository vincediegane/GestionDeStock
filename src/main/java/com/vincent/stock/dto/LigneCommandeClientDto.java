package com.vincent.stock.dto;

import java.math.BigDecimal;
import com.vincent.stock.model.LigneCommandeClient;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class LigneCommandeClientDto {
	
	private Integer id;

	private BigDecimal quantite;

	private BigDecimal prixUnitaire;
	
	private ArticleDto article;

	private CommandeClientDto commandeClient;
	
	public static LigneCommandeClientDto fromEntity(LigneCommandeClient ligneCommandeClient) {
		if(ligneCommandeClient == null) return null;
		return LigneCommandeClientDto.builder()
				.id(ligneCommandeClient.getId())
				.quantite(ligneCommandeClient.getQuantite())
				.prixUnitaire(ligneCommandeClient.getPrixUnitaire())
				// .article(ligneCommandeClient.getArticle())
				// .commandeClient(ligneCommandeClient.getCommandeClient())
				.build();
	}
	
	public static LigneCommandeClient toEntity(LigneCommandeClientDto ligneCommandeClientDto) {
		if(ligneCommandeClientDto == null) return null;
		LigneCommandeClient ligneCommandeClient = new LigneCommandeClient();
		ligneCommandeClient.setId(ligneCommandeClientDto.getId());
		ligneCommandeClient.setQuantite(ligneCommandeClientDto.getQuantite());
		ligneCommandeClient.setPrixUnitaire(ligneCommandeClientDto.getPrixUnitaire());
		// ligneCommandeClient.setArticle(ligneCommandeClientDto.getArticle());
		// ligneCommandeClient.setCommandeClient(ligneCommandeClientDto.getCommandeClient());
		return ligneCommandeClient;
	}
}
