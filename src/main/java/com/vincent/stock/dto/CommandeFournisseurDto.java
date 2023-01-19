package com.vincent.stock.dto;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.vincent.stock.model.CommandeFournisseur;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CommandeFournisseurDto {
	
	private Integer id;
	
	private String code;

	private Date dateCommande;

	private FournisseurDto fournisseur;

	@JsonIgnore
	private List<LigneCommandeFournisseurDto> ligneCommandeFournisseurs;
	
	public static CommandeFournisseurDto fromEntity(CommandeFournisseur commandeFournisseur) {
		if(commandeFournisseur == null) return null;
		return CommandeFournisseurDto.builder()
				.id(commandeFournisseur.getId())
				.code(commandeFournisseur.getCode())
				.dateCommande(commandeFournisseur.getDateCommande())
				// .fournisseur(commandeFournisseur.getFournisseur())
				.build();
	}
	
	public static CommandeFournisseur toEntity(CommandeFournisseurDto commandeFournisseurDto) {
		if(commandeFournisseurDto == null) return null;
		CommandeFournisseur commandeFournisseur = new CommandeFournisseur();
		commandeFournisseur.setId(commandeFournisseurDto.getId());
		commandeFournisseur.setCode(commandeFournisseurDto.getCode());
		commandeFournisseur.setDateCommande(commandeFournisseurDto.getDateCommande());
		// commandeFournisseur.setFournisseur(commandeFournisseurDto.getFournisseur());
		return commandeFournisseur;
	}
}
