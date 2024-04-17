package com.Geko.Prueba.Models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "company")
@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class Company {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "comp_id")
	private int id;
	@Column(name = "comp_codigo")
	private String codigo;
	@Column(name = "comp_name")
	private String name;
	@Column(name = "comp_description")
	private String description;
}
