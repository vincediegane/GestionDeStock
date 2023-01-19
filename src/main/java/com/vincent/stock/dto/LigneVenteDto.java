package com.vincent.stock.dto;

import java.math.BigDecimal;

import com.vincent.stock.model.LigneVente;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class LigneVenteDto {
	
	private Integer id;

	private BigDecimal quantite;

	private BigDecimal prixUnitaire;

	private VentesDto ventes;
	
	public static LigneVenteDto fromEntity(LigneVente ligneVente) {
		if(ligneVente == null) return null;
		return LigneVenteDto.builder()
				.id(ligneVente.getId())
				.quantite(ligneVente.getQuantite())
				.prixUnitaire(ligneVente.getPrixUnitaire())
				// .ventes(ligneVente.getVentes())
				.build();
	}
	
	public static LigneVente toEntity(LigneVenteDto ligneVenteDto) {
		if(ligneVenteDto == null) return null;
		LigneVente ligneVente = new LigneVente();
		ligneVente.setId(ligneVenteDto.getId());
		ligneVente.setQuantite(ligneVenteDto.getQuantite());
		ligneVente.setPrixUnitaire(ligneVenteDto.getPrixUnitaire());
		// ligneVente.setVentes(ligneVenteDto.getVentes());
		return ligneVente;
	}
}
