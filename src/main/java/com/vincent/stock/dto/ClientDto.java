package com.vincent.stock.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.vincent.stock.model.Client;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ClientDto {
	
	private Integer id;
	
	private String nom;

	private String prenom;

	private AdresseDto adresse;

	private String photo;

	private String mail;

	private String numTel;

	@JsonIgnore
	private List<CommandeClientDto> commandeClients;
	
	public static ClientDto fromEntity(Client client) {
		if(client == null) return null;
		return ClientDto.builder()
				.id(client.getId())
				.nom(client.getNom())
				.prenom(client.getPrenom())
				.photo(client.getPhoto())
				.mail(client.getMail())
				.numTel(client.getNumTel())
				// .adresse(client.getAdresse())
				.build();
	}
	
	public static Client toEntity(ClientDto clientDto) {
		if(clientDto == null) return null;
		Client client = new Client();
		client.setId(clientDto.getId());
		client.setNom(clientDto.getNom());
		client.setPrenom(clientDto.getPrenom());
		client.setPhoto(clientDto.getPhoto());
		client.setMail(clientDto.getMail());
		client.setNumTel(clientDto.getNumTel());
		// client.setAdresse(clientDto.getAdresse());
		return client;
	}
}
