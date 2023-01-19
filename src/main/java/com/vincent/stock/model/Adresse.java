package com.vincent.stock.model;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Embeddable
public class Adresse {
	@Column(name = "adresse1")
	private String adresse1;

	@Column(name = "adresse2")
	private String adresse2;

	@Column(name = "ville")
	private String ville;

	@Column(name = "codepostale")
	private String codePostale;

	@Column(name = "pays")
	private String pays;
}
