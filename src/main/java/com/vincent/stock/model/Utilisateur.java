package com.vincent.stock.model;

import java.util.Date;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
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
@Table(name = "utilisateur")
public class Utilisateur extends AbstractEntity {/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Column(name = "nom")
	private String nom;

	@Column(name = "prenom")
	private String prenom;

	@Column(name = "email")
	private String email;

	@Column(name = "datedenaissance")
	private Date dateDeNaissance;

	@Column(name = "motdepasse")
	private String motDePasse;

	@Embedded
	private Adresse adresse;

	@Column(name = "photo")
	private String photo;

	@ManyToOne
	@JoinColumn(name = "idEntreprise")
	private Entreprise entreprise;

	@OneToMany(mappedBy = "utilisateur")
	private List<Roles> roles;
}
