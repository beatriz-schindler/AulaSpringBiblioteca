package app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import app.entity.Editora;
import app.repository.EditoraRepository;

@Service
public class EditoraService {

	@Autowired
	EditoraRepository editoraRepository;

	public String save(Editora editora) {
		if (editora.getLivros() != null) {
			for (int i = 0; i < editora.getLivros().size(); i++) {
				editora.getLivros().get(i).setEditora(editora);
			}
		}
		this.editoraRepository.save(editora);
		return "Editora cadastrada com sucesso!";
	}

	public String update(Editora editora, long id) {
		editora.setId(id);
		this.editoraRepository.save(editora);
		return "Editora atualizada com sucesso!";
	}

	public Editora findById(long id) {

		Optional<Editora> optional = this.editoraRepository.findById(id);
		if (optional.isPresent()) {
			return optional.get();
		} else
			return null;

	}

	public List<Editora> findAll() {
		return this.editoraRepository.findAll();
	}

	public String delete(long id) {

		this.editoraRepository.deleteById(id);
		return "Editora deletada com sucesso!";
	}
	
	public List<Editora> findByEndereco(String endereco){
		return this.editoraRepository.findByEndereco(endereco);
	}
}
