package app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import app.entity.Editora;

public interface EditoraRepository extends JpaRepository<Editora, Long> {
	
	public List<Editora> findByEndereco(String endereco);

}
