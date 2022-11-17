package com.example.demo.entities;

import java.util.Date;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


@Entity
public class Livre {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idLivre;
	private String nomLivre;
	private String nomAutheur;
	private Double prixLivre;
	private Date dateLancementLivre;
	

	
	public Livre(String nomLivre, String nomAutheur, Double prixLivre, Date dateLancementLivre) {
		super();
		this.nomLivre = nomLivre;
		this.nomAutheur = nomAutheur;
		this.prixLivre = prixLivre;
		this.dateLancementLivre = dateLancementLivre;
	}
	
	@ManyToOne
	private Genre genre;
	public Livre() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Long getIdLivre() {
		return idLivre;
	}
	public void setIdLivre(Long idLivre) {
		this.idLivre = idLivre;
	}
	public String getNomLivre() {
		return nomLivre;
	}
	public void setNomLivre(String nomLivre) {
		this.nomLivre = nomLivre;
	}
	public String getNomAutheur() {
		return nomAutheur;
	}
	public void setNomAutheur(String nomAutheur) {
		this.nomAutheur = nomAutheur;
	}
	public Double getPrixLivre() {
		return prixLivre;
	}
	public void setPrixLivre(Double prixLivre) {
		this.prixLivre = prixLivre;
	}
	public Date getDateLancementLivre() {
		return dateLancementLivre;
	}
	public void setDateLancementLivre(Date dateLancementLivre) {
		this.dateLancementLivre = dateLancementLivre;
	}
	
	@Override
	public String toString() {
		return "Livre [idLivre=" + idLivre + ", nomLivre=" + nomLivre + ", nomAutheur=" + nomAutheur + ", prixLivre="
				+ prixLivre + ", dateLancementLivre=" + dateLancementLivre + "]";
	}
	
}
