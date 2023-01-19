package com.vincent.stock.dto;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.vincent.stock.model.Article;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ArticleDto {
	
	private Integer id;
	
	private String codeArticle;

	private String designation;

	private BigDecimal prixUnitaireHt;

	private BigDecimal tauxTva;

	private BigDecimal prixUnitaireTtc;

	private String photo;

	@JsonIgnore
	private CategoryDto category;
	
	public static ArticleDto fromEntity(Article article) {
		if(article == null) return null;
		return ArticleDto.builder()
				.id(article.getId())
				.codeArticle(article.getCodeArticle())
				.designation(article.getDesignation())
				.prixUnitaireHt(article.getPrixUnitaireHt())
				.prixUnitaireTtc(article.getPrixUnitaireTtc())
				.photo(article.getPhoto())
				.build();
	}
	
	public static Article toEntity(ArticleDto articleDto) {
		if(articleDto == null) return null;
		Article article = new Article();
		article.setId(articleDto.getId());
		article.setCodeArticle(articleDto.getCodeArticle());
		article.setDesignation(articleDto.getDesignation());
		article.setPrixUnitaireHt(articleDto.getPrixUnitaireHt());
		article.setPrixUnitaireTtc(articleDto.getPrixUnitaireTtc());
		article.setPhoto(articleDto.getPhoto());

		return article;
	}
}
