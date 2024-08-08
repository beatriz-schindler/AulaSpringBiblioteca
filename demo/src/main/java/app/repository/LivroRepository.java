package app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import app.entity.Livro;

public interface LivroRepository extends JpaRepository<Livro, Long>{
	
	@Query ("FROM Livro l WHERE l.anoPublicacao BETWEEN :ano1 AND :ano2")
	public List<Livro> findByAnosEntre(int ano1, int ano2);

}
