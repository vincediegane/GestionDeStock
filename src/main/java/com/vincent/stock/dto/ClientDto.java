package com.vincent.stock.dto;

import java.util.List;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ClientDto {
	
	private String nom;

	private String prenom;

	private AdresseDto adresse;

	private String photo;

	private String mail;

	private String numTel;

	private List<CommandeClientDto> commandeClients;
}
