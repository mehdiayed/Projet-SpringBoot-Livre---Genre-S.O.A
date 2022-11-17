package com.example.demo.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.example.demo.entities.Genre;
import com.example.demo.entities.Livre;
@RepositoryRestResource(path = "rest")
public interface LivreRepository extends JpaRepository<Livre, Long> {
	List<Livre> findByNomLivre(String nom);
	List<Livre> findByNomLivreContains(String nom);
	
	@Query("select l from Livre l where l.nomLivre like %:nom and l.prixLivre > :prix")
	List<Livre> findByNomPrix (@Param("nom") String nom,@Param("prix") Double prix);
	
	
	@Query("select l from Livre l where l.genre = ?1")
	List<Livre> findByGenre (Genre genre);
	
	List<Livre> findByGenreIdGenre(Long id);
	List<Livre> findByOrderByNomLivreAsc();
	
	
	@Query("select l from Livre l order by l.nomLivre ASC, l.prixLivre DESC")
	List<Livre> trierLivreNomPrix ();
}
