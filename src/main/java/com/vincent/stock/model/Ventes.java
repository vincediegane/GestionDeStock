package com.vincent.stock.model;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
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
@Table(name = "ventes")
public class Ventes extends AbstractEntity{/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	// FIX ME
	@Column(name = "code")
	private String code;

	@Column(name = "datevente")
	private Date dateVente;

	@Column(name = "commentaire")
	private String commentaire;

//	@OneToMany(mappedBy = "ventes")
//	private List<LigneVente> ligneVentes;
}
