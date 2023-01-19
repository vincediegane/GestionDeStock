package com.vincent.stock.dto;

import java.math.BigDecimal;

import com.vincent.stock.model.LigneCommandeFournisseur;

import lombok.Builder;
import lombok.Data;
@Data
@Builder
public class LigneCommandeFournisseurDto {
	
	private Integer id;

	private BigDecimal quantite;

	private BigDecimal prixUnitaire;
	
	private ArticleDto article;

	private CommandeFournisseurDto commandeFournisseur;
	
	public static LigneCommandeFournisseurDto fromEntity(LigneCommandeFournisseur ligneCommandeFournisseur) {
		if(ligneCommandeFournisseur == null) return null;
		return LigneCommandeFournisseurDto.builder()
				.id(ligneCommandeFournisseur.getId())
				.quantite(ligneCommandeFournisseur.getQuantite())
				.prixUnitaire(ligneCommandeFournisseur.getPrixUnitaire())
				// .article(ligneCommandeFournisseur.getArticle())
				// .commandeFournisseur(ligneCommandeFournisseur.getCommandeFournisseur())
				.build();
	}
	
	public static LigneCommandeFournisseur toEntity(LigneCommandeFournisseurDto ligneCommandeFournisseurDto) {
		if(ligneCommandeFournisseurDto == null) return null;
		LigneCommandeFournisseur ligneCommandeFournisseur = new LigneCommandeFournisseur();
		ligneCommandeFournisseur.setId(ligneCommandeFournisseurDto.getId());
		ligneCommandeFournisseur.setQuantite(ligneCommandeFournisseurDto.getQuantite());
		ligneCommandeFournisseur.setPrixUnitaire(ligneCommandeFournisseurDto.getPrixUnitaire());
		// ligneCommandeFournisseur.setArticle(ligneCommandeFournisseurDto.getArticle());
		// ligneCommandeFournisseur.setCommandeClient(ligneCommandeFournisseurDto.getCommandeFournisseur());
		return ligneCommandeFournisseur;
	}
}
