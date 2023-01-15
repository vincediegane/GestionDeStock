package com.vincent.stock.model;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "entreprise")
public class Entreprise extends AbstractEntity {/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Column(name = "nom")
	private String nom;

	@Column(name = "description")
	private String description;

	@Embedded
	private Adresse adresse;

	@Column(name = "codefiscal")
	private String codeFiscal;
	
	@Column(name = "photo")
	private String photo;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "numtel")
	private String numTel;
	
	@Column(name = "siteweb")
	private String siteWeb;
	
	@OneToMany(mappedBy = "entreprise")
	private List<Utilisateur> utilisateurs;
}
