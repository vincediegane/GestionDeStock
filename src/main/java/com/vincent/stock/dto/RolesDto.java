package com.vincent.stock.dto;

import com.vincent.stock.model.Roles;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class RolesDto {
	
	private Integer id;

	private String roleName;

	private String nom;

	private UtilisateurDto utilisateur;
	
	public static RolesDto fromEntity(Roles roles) {
		if(roles == null) return null;
		return RolesDto.builder()
				.id(roles.getId())
				.roleName(roles.getRoleName())
				.nom(roles.getNom())
				// .utilisateur(roles.getUtilisateur())
				.build();
	}
}
