package app.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import entity.Livro;

@Service
public class LivroService {

	public String save (Livro livro) {
		return "Livro cadastrado com sucesso";
	}
	
	public String update (Livro livro, long id) {
		return "Atualizado com sucesso";
	}
	
	public Livro findById (long id) {
		
		List<Livro> listaTemp = this.findAll();
		
		for (int i = 0; i < listaTemp.size(); i++) {
			if(listaTemp.get(i).getId() == id) {
				return listaTemp.get(i);
			}
		}
		
		return null;
		
	}
	
	public List<Livro> findAll () {
		
		List<Livro> lista = new ArrayList<>();
		lista.add(new Livro(1,"A Pequena Sereia", "1990", "Hanz"));
		lista.add(new Livro(2,"Rainha Vermelha", "2015", "Victoria"));
		lista.add(new Livro(3,"Diário de um Banana", "2010", "Jeffrey"));
		
		return lista;
	}
	
	public String delete (long id) {
		
		List<Livro> listaTemp = this.findAll();
		
		for (int i = 0; i < listaTemp.size(); i++) {
			if(listaTemp.get(i).getId() == id) {
				return listaTemp.get(i).getNome()+" deletado com sucesso";
			}
		}
		return "Livro não encontrado";
	}
	
}
