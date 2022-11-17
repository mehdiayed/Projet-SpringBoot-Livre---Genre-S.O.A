package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Genre;
import com.example.demo.entities.Livre;
import com.example.demo.repos.LivreRepository;

@Service
public class LivreServiceImpl implements LivreService {
	@Autowired
	private LivreRepository livreRepository;
	@Override
	public Livre saveLivre(Livre liv) {
		return livreRepository.save(liv);
	}

	@Override
	public Livre updateLivre(Livre liv) {
		return livreRepository.save(liv);
	}

	@Override
	public void deleteLivre(Livre liv) {
		livreRepository.delete(liv);
		
	}

	@Override
	public void deleteLivreById(Long id) {
		livreRepository.deleteById(id);
		
	}

	@Override
	public Livre getLivre(Long id) {
		return livreRepository.findById(id).get();
	}

	@Override
	public List<Livre> getAllLivres() {
		return livreRepository.findAll();
	}

	@Override
	public List<Livre> findByNomLivre(String nom) {
		// TODO Auto-generated method stub
		return livreRepository.findByNomLivre(nom);
	}

	@Override
	public List<Livre> findByNomLivreContains(String nom) {
		// TODO Auto-generated method stub
		return livreRepository.findByNomLivreContains(nom);
	}

	@Override
	public List<Livre> findByNomPrix(String nom, Double prix) {
		// TODO Auto-generated method stub
		return livreRepository.findByNomPrix(nom, prix);
	}

	@Override
	public List<Livre> findByGenre(Genre genre) {
		// TODO Auto-generated method stub
		return livreRepository.findByGenre(genre);
	}

	@Override
	public List<Livre> findByGenreIdGenre(Long id) {
		// TODO Auto-generated method stub
		return livreRepository.findByGenreIdGenre(id);
	}

	@Override
	public List<Livre> findByOrderByNomLivreAsc() {
		// TODO Auto-generated method stub
		return livreRepository.findByOrderByNomLivreAsc();
	}

	@Override
	public List<Livre> trierLivreNomPrix() {
		// TODO Auto-generated method stub
		return livreRepository.trierLivreNomPrix();
	}

	
}
