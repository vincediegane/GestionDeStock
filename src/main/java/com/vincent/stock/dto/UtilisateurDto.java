package com.vincent.stock.dto;

import java.util.Date;
import java.util.List;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UtilisateurDto {
	
	private String nom;

	private String prenom;

	private String email;

	private Date dateDeNaissance;

	private String motDePasse;

	private AdresseDto adresse;

	private String photo;

	private EntrepriseDto entreprise;

	private List<RolesDto> roles;
}
