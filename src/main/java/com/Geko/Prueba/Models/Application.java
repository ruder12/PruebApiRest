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
@Table(name = "application")
@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class Application {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "app_id")
	private int id;
	@Column(name = "app_code")
	private String code;
	@Column(name = "app_name")
	private String name;
	@Column(name = "app_description")
	private String description;

 
}
