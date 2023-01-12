package com.vincent.stock.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "utilisateur")
public class Utilisateur extends AbstractEntity {/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

}
