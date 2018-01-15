package com.example.bihacAPI.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "sportskiCentri")
public class Sport {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column
	private int id;
	
	@Column
	private String nazivCentra;
	
	@Column
	private String adresa;
	
	@Column
	private double geografska_sirina;
	
	@Column
	private double geografska_duzina;
	
	@Column
	private String brojTelefona;
	
	

	public Sport() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNazivCentra() {
		return nazivCentra;
	}

	public void setNazivCentra(String nazivCentra) {
		this.nazivCentra = nazivCentra;
	}

	public String getAdresa() {
		return adresa;
	}

	public void setAdresa(String adresa) {
		this.adresa = adresa;
	}

	public double getGeografska_sirina() {
		return geografska_sirina;
	}

	public void setGeografska_sirina(double geografska_sirina) {
		this.geografska_sirina = geografska_sirina;
	}

	public double getGeografska_duzina() {
		return geografska_duzina;
	}

	public void setGeografska_duzina(double geografska_duzina) {
		this.geografska_duzina = geografska_duzina;
	}

	public String getBrojTelefona() {
		return brojTelefona;
	}

	public void setBrojTelefona(String brojTelefona) {
		this.brojTelefona = brojTelefona;
	}
	
	
	
	
}
