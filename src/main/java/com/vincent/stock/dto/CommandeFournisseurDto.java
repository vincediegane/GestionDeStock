package com.vincent.stock.dto;

import java.util.Date;
import java.util.List;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CommandeFournisseurDto {
	
	private String code;

	private Date dateCommande;

	private FournisseurDto fournisseur;

	private List<LigneCommandeFournisseurDto> ligneCommandeFournisseurs;
}
