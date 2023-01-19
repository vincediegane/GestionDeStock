package com.vincent.stock.dto;

import java.math.BigDecimal;
import java.util.Date;

import com.vincent.stock.model.MvtStk;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class MvtStkDto {
	
	private Integer id;

	private Date dateMvt;

	private BigDecimal prixUnitaire;
	
//	private TypeMvtStk typeMvt;
	private String typeMvt;
	
	private ArticleDto article;
	
	public static MvtStkDto fromEntity(MvtStk mvtStk) {
		if(mvtStk == null) return null;
		return MvtStkDto.builder()
				.id(mvtStk.getId())
				.dateMvt(mvtStk.getDateMvt())
				.prixUnitaire(mvtStk.getPrixUnitaire())
				// .typeMvt(mvtStk.getTypeMvt())
				// .article(mvtStk.getArticle())
				.build();
	}
	
	public static MvtStk toEntity(MvtStkDto mvtStkDto) {
		if(mvtStkDto == null) return null;
		MvtStk mvtStk = new MvtStk();
		mvtStk.setId(mvtStkDto.getId());
		mvtStk.setDateMvt(mvtStkDto.getDateMvt());
		mvtStk.setPrixUnitaire(mvtStkDto.getPrixUnitaire());
		// mvtStk.setTypeMvt(mvtStkDto.getTypeMvt());
		// mvtStk.setArticle(mvtStkDto.getArticle());
		return mvtStk;
	}
}
