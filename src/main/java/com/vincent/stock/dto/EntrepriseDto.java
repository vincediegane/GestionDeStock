package com.vincent.stock.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.vincent.stock.model.Entreprise;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class EntrepriseDto {
	
	private Integer id;
	
	private String nom;

	private String description;

	private AdresseDto adresse;

	private String codeFiscal;
	
	private String photo;
	
	private String email;
	
	private String numTel;
	
	private String siteWeb;

	@JsonIgnore
	private List<UtilisateurDto> utilisateurs;
	
	public static EntrepriseDto fromEntity(Entreprise entreprise) {
		if(entreprise == null) return null;
		return EntrepriseDto.builder()
				.id(entreprise.getId())
				.nom(entreprise.getNom())
				.description(entreprise.getDescription())
				// .adresse(entreprise.getAdresse())
				.codeFiscal(entreprise.getCodeFiscal())
				.photo(entreprise.getPhoto())
				.email(entreprise.getPhoto())
				.numTel(entreprise.getNumTel())
				.siteWeb(entreprise.getSiteWeb())
				.build();
	}
	
	public static Entreprise toEntity(EntrepriseDto entrepriseDto) {
		if(entrepriseDto == null) return null;
		Entreprise entreprise = new Entreprise();
		entreprise.setId(entrepriseDto.getId());
		entreprise.setNom(entrepriseDto.getNom());
		entreprise.setDescription(entrepriseDto.getDescription());
		// entreprise.setAdresse(entrepriseDto.getAdresse());
		entreprise.setCodeFiscal(entrepriseDto.getCodeFiscal());
		entreprise.setPhoto(entrepriseDto.getPhoto());
		entreprise.setEmail(entrepriseDto.getEmail());
		entreprise.setNumTel(entrepriseDto.getNumTel());
		entreprise.setSiteWeb(entrepriseDto.getSiteWeb());
		return entreprise;
	}
}
