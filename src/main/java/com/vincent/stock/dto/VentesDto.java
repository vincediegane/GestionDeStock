package com.vincent.stock.dto;

import java.util.Date;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class VentesDto {
	
	private String code;

	private Date dateVente;

	private String commentaire;
}
