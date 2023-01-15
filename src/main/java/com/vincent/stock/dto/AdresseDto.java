package com.vincent.stock.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class AdresseDto {
	private String addresse1;
	private String addresse2;
	private String ville;
	private String codePostale;
	private String pays;
}
