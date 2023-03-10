package com.vincent.stock.model;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "client")
public class Client extends AbstractEntity {/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Column(name = "nom")
	private String nom;

	@Column(name = "prenom")
	private String prenom;

	@Embedded
	private Adresse adresse;

	@Column(name = "photo")
	private String photo;

	@Column(name = "mail")
	private String mail;

	@Column(name = "numtel")
	private String numTel;

	@OneToMany(mappedBy = "client")
	private List<CommandeClient> commandeClients;
}
