package com.example.demo;

import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.entities.Genre;
import com.example.demo.entities.Livre;
import com.example.demo.repos.LivreRepository;

@SpringBootTest
class BooksProjectVersionFinalApplicationTests {
	
	@Autowired
	private LivreRepository livreRepository;
	
	@Test
	public void testCreateLivre() {
	Livre liv = new Livre("harry potter","jk roling",404.5,new Date());
	livreRepository.save(liv);
	}
	
	@Test
	public void testFindLivre()
	{
	Livre p = livreRepository.findById(1L).get();
	System.out.println(p);
	}
	
	@Test
	public void TestUpdateLivre() {
		Livre liv = livreRepository.findById(2L).get();
		liv.setPrixLivre(1000.0);
		livreRepository.save(liv);
	}
	
	@Test
	public void testDeleteLivre() {
		livreRepository.deleteById(1L);
	}
	
	@Test
	public void testListerTousLivres() {
		List<Livre> livs = livreRepository.findAll();
		for(Livre liv : livs){
			System.out.println(liv);
		}
	}
	
	@Test
	public void testFindByNomLivre()
	{
	List<Livre> liv = livreRepository.findByNomLivre("Harry Potter");
	for (Livre l : liv)
	{
		System.out.println(l);
	}
	}
	
	@Test
	public void testFindByNomLivreContains ()
	{
		List<Livre> liv=livreRepository.findByNomLivreContains("Harry Potter");
		for (Livre l : liv)
		{
			System.out.println(l);
		} 
	}
	
	
	@Test
	public void testfindByNomPrix()
	{
	List<Livre> liv = livreRepository.findByNomPrix("Harry Potter", 1000.0);
	for (Livre p : liv)
	{
	System.out.println(p);
	}
	}
	
	@Test
	public void testfindByGenre()
	{
		Genre gen = new Genre();
		gen.setIdGenre(1L);
		List<Livre> liv = livreRepository.findByGenre(gen);
		for (Livre l : liv)
		{
			System.out.println(l);
		}
	}
	
	@Test
	public void testfindByGenidGenre()
	{
		List<Livre> livs = livreRepository.findByGenreIdGenre(1L);
		for (Livre p : livs)
		{
			System.out.println(p);
		}
	}
	@Test
	public void testfindByOrderByNomLivreAsc()
	{
		List<Livre> livs =livreRepository.findByOrderByNomLivreAsc();
		for (Livre p : livs)
		{
			System.out.println(p);
		}
	}
	
	@Test
	public void testTrierLivreNomPrix()
	{
		List<Livre> livs = livreRepository.trierLivreNomPrix();
		for (Livre p : livs)
		{
			System.out.println(p);
		}
	}

}
