package com.example.demo.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

	@Entity
	public class Genre {
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long idGenre;
		private String nomGenre;
		private String descriptionGenre;
		
		@JsonIgnore
		@OneToMany(mappedBy = "genre")
		private List<Livre> livres;
		
		public Genre() {}
		public Genre(String nomGenre, String descriptionGenre) {
			super();
			this.nomGenre = nomGenre;
			this.descriptionGenre = descriptionGenre;
		}
		
		public Long getIdGenre() {
			return idGenre;
		}
		public void setIdGenre(Long idGenre) {
			this.idGenre = idGenre;
		}
		public String getNomGenre() {
			return nomGenre;
		}
		public void setNomGenre(String nomGenre) {
			this.nomGenre = nomGenre;
		}
		public String getDescriptionGenre() {
			return descriptionGenre;
		}
		public void setDescriptionGenre(String descriptionGenre) {
			this.descriptionGenre = descriptionGenre;
		}
		
		
		public List<Livre> getLivres()
		{
			return livres;
		}
		
		public void setLivres(List<Livre> livres)
		{
			this.livres = livres;
		}
	}

