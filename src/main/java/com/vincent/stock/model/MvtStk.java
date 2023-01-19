package com.vincent.stock.model;

import java.math.BigDecimal;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
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
@Table(name = "mvtstk")
public class MvtStk extends AbstractEntity {/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Column(name = "datemvt")
	private Date dateMvt;

	@Column(name = "prixUnitaire")
	private BigDecimal prixUnitaire;
	
	@Column(name = "typemvt")
//	private TypeMvtStk typeMvt;
	private String typeMvt;
	
	@ManyToOne
	@JoinColumn(name = "idArticle")
	private Article article;
}
