package com.vincent.stock.dto;

import java.util.Date;
import java.util.List;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CommandeClientDto {

	private String code;

	private Date dateCommande;

	private ClientDto client;

	private List<LigneCommandeClientDto> ligneCommandeClient;
}
