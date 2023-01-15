package com.vincent.stock.dto;

import java.math.BigDecimal;
import java.util.Date;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class MvtStkDto {

	private Date dateMvt;

	private BigDecimal prixUnitaire;
	
//	private TypeMvtStk typeMvt;
	private String typeMvt;
	
	private ArticleDto article;
}
