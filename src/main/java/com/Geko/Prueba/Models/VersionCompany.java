package com.Geko.Prueba.Models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "version_company")
@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class VersionCompany {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "vc_id")
	private int id;

	@ManyToOne(fetch = FetchType.LAZY,optional = false)
    @JoinColumn(name = "vc_company_id")
    @JsonProperty(access = Access.WRITE_ONLY)
	private Company companyId;
	
	@ManyToOne(fetch = FetchType.LAZY,optional = false)
    @JoinColumn(name = "vc_version_id")
    @JsonProperty(access = Access.WRITE_ONLY)
	private Version version_id;
	
	@Column(name = "vc_description")
	private String description;
	

}
