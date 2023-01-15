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
	@Column(name = "addresse1")
	private String addresse1;
	@Column(name = "addresse2")
	private String addresse2;
	@Column(name = "ville")
	private String ville;
	@Column(name = "codepostale")
	private String codePostale;
	@Column(name = "pays")
	private String pays;
}
