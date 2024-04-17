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
@Table(name = "version")
@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class Version {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "v_id")
	private int id;
	@Column(name = "v_app_id")
	private int app_id;
	
	@Column(name = "v_version")
	private int version;
	@Column(name = "v_description")
	private String description;
	
}
