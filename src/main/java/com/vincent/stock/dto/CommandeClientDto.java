package com.vincent.stock.dto;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.vincent.stock.model.CommandeClient;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CommandeClientDto {
	
	private Integer id;

	private String code;

	private Date dateCommande;

	private ClientDto client;

	@JsonIgnore
	private List<LigneCommandeClientDto> ligneCommandeClient;
	
	public static CommandeClientDto fromEntity(CommandeClient commandeClient) {
		if(commandeClient == null) return null;
		return CommandeClientDto.builder()
				.id(commandeClient.getId())
				.code(commandeClient.getCode())
				.dateCommande(commandeClient.getDateCommande())
				// .client(commandeClient.getClient())
				.build();
	}
	
	public static CommandeClient toEntity(CommandeClientDto commandeClientDto) {
		if(commandeClientDto == null) return null;
		CommandeClient commandeClient = new CommandeClient();
		commandeClient.setId(commandeClient.getId());
		commandeClient.setCode(commandeClient.getCode());
		commandeClient.setDateCommande(commandeClient.getDateCommande());
		// commandeClient.setClient(commandeClient.getClient());
		return commandeClient;
	}
}
