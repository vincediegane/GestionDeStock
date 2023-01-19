package com.vincent.stock.dto;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.vincent.stock.model.Utilisateur;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UtilisateurDto {
	
	private Integer id;
	
	private String nom;

	private String prenom;

	private String email;

	private Date dateDeNaissance;

	private String motDePasse;

	private AdresseDto adresse;

	private String photo;

	private EntrepriseDto entreprise;

	@JsonIgnore
	private List<RolesDto> roles;
	
	public static UtilisateurDto fromEntity(Utilisateur utilisateur) {
		if(utilisateur == null) return null;
		return UtilisateurDto.builder()
				.id(utilisateur.getId())
				.nom(utilisateur.getNom())
				.prenom(utilisateur.getPrenom())
				.email(utilisateur.getEmail())
				.dateDeNaissance(utilisateur.getDateDeNaissance())
				.motDePasse(utilisateur.getMotDePasse())
				// .adresse(utilisateur.getAdresse())
				.photo(utilisateur.getPhoto())
				// .entreprise(utilisateur.getEntreprise())
				.build();
	}
	
	public static Utilisateur toEntity(UtilisateurDto utilisateurDto) {
		if(utilisateurDto == null) return null;
		Utilisateur utilisateur = new Utilisateur();
		utilisateur.setId(utilisateurDto.getId());
		utilisateur.setNom(utilisateurDto.getNom());
		utilisateur.setPrenom(utilisateurDto.getPrenom());
		utilisateur.setEmail(utilisateurDto.getEmail());
		utilisateur.setDateDeNaissance(utilisateurDto.getDateDeNaissance());
		// utilisateur.setMotDePasse(utilisateurDto.getMotDePasse());
		utilisateur.setPhoto(utilisateurDto.getPhoto());
		// utilisateur.setEntreprise(utilisateurDto.getEntreprise());
		return utilisateur;
	}
}
