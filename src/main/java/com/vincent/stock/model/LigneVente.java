package com.vincent.stock.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "lignevente")
public class LigneVente extends AbstractEntity {/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

}
