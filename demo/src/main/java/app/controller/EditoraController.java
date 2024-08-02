package app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import app.service.EditoraService;
import entity.Editora;

@RestController
@RequestMapping("/api/biblioteca")
public class EditoraController {
	@Autowired
	private EditoraService editoraService;
	

	@PostMapping("/saveEdit")
	public ResponseEntity<String> save(@RequestBody Editora editora){
		try {
			String mensagem = this.editoraService.save(editora);
			return new ResponseEntity<>(mensagem, HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity<>("Deu erro!"+e.getMessage(), HttpStatus.BAD_REQUEST );
		}
	}
	
	@PutMapping("/updateEdit/{id}")
	public ResponseEntity<String> update(@RequestBody Editora editora, @PathVariable long id){
		try {
			String mensagem = this.editoraService.update(editora, id);
			return new ResponseEntity<>(mensagem, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>("Deu erro!"+e.getMessage(), HttpStatus.BAD_REQUEST );
		}
	}

	@GetMapping("/findByIdEdit/{id}")
	public ResponseEntity<Editora> findById(@PathVariable long id){
		try {
			Editora editora = this.editoraService.findById(id);
			return new ResponseEntity<>(editora, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST );
		}
	}
	
	@GetMapping("/findAllEdit")
	public ResponseEntity<List<Editora>> findAll(){
		try {
			List<Editora> lista = this.editoraService.findAll();
			return new ResponseEntity<>(lista, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST );
		}
	}
	
	@DeleteMapping("/deleteEdit/{id}")
	public ResponseEntity<String> delete(@PathVariable long id){
		try {
			String mensagem = this.editoraService.delete(id);
			return new ResponseEntity<>(mensagem, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST );
		}
	}
	

}