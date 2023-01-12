package com.vincent.stock.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "entreprise")
public class Entreprise extends AbstractEntity {/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

}
