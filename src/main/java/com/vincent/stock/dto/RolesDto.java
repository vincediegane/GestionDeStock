package com.vincent.stock.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class RolesDto {

	private String roleName;

	private String nom;

	private UtilisateurDto utilisateur;
}
