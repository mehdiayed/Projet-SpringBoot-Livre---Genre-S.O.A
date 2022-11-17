package com.example.demo.service;

import java.util.List;

import com.example.demo.entities.Genre;
import com.example.demo.entities.Livre;

public interface LivreService {
	Livre saveLivre(Livre liv);
	Livre updateLivre(Livre liv);
	void deleteLivre(Livre liv);
	void deleteLivreById(Long id);
	Livre getLivre(Long id);
	List<Livre> getAllLivres();
	List<Livre> findByNomLivre(String nom);
	List<Livre> findByNomLivreContains(String nom);
	List<Livre> findByNomPrix (String nom,Double prix);
	List<Livre> findByGenre (Genre genre);
	List<Livre> findByGenreIdGenre(Long id);
	List<Livre> findByOrderByNomLivreAsc();
	List<Livre> trierLivreNomPrix();
}
