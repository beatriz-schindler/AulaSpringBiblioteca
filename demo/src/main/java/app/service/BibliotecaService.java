package app.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import entity.Biblioteca;

@Service
public class BibliotecaService {


	public String save(Biblioteca editora) {
		return "Biblioteca cadastrada com sucesso";
	}

	public String update(Biblioteca editora, long id) {
		return "Atualizado com sucesso";
	}

	public Biblioteca findById(long id) {

		List<Biblioteca> listaTemp = this.findAll();

		for (int i = 0; i < listaTemp.size(); i++) {
			if (listaTemp.get(i).getId() == id) {
				return listaTemp.get(i);
			}
		}

		return null;

	}

	public List<Biblioteca> findAll() {

		List<Biblioteca> lista = new ArrayList<>();
		lista.add(new Biblioteca(1, "Rua 5", "45 99999-9999"));
		lista.add(new Biblioteca(2, "Rua 7", "45 88888-8888"));

		return lista;
	}

	public String delete(long id) {

		List<Biblioteca> listaTemp = this.findAll();

		for (int i = 0; i < listaTemp.size(); i++) {
			if (listaTemp.get(i).getId() == id) {
				return "Deletado com sucesso";
			}
		}
		return "Biblioteca não encontrado";
	}
}
