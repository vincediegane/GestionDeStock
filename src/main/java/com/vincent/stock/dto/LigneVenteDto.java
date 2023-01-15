package com.vincent.stock.dto;

import java.math.BigDecimal;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class LigneVenteDto {

	private BigDecimal quantite;

	private BigDecimal prixUnitaire;

	private VentesDto ventes;
}
