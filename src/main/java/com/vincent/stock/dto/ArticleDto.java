package com.vincent.stock.dto;

import java.math.BigDecimal;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ArticleDto {
	
	private String codeArticle;

	private String designation;

	private BigDecimal prixUnitaireHt;

	private BigDecimal tauxTva;

	private BigDecimal prixUnitaireTtc;

	private String photo;

	private CategoryDto category;
}
