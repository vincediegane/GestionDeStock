package com.vincent.stock.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "mvtstk")
public class MvtStk extends AbstractEntity {/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

}